package com.hack;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import com.hack.model.Build;

public class TestPersistingEntities {
	
	private EntityManager entityManager = EntityManagerUtil.getEntityManager();

	  public static void main(String[] args) {
		TestPersistingEntities test = new TestPersistingEntities();
	    System.out.println("After Sucessfully insertion ");
	    Build build1 = test.saveBuild("Rouge");
	    Build build2 = test.saveBuild("Healer");
	    test.listBuild();
	    System.out.println("After Sucessfully modification ");
	    test.updateBuild(build1.getId(), "Mage");
	    test.updateBuild(build2.getId(), "Tank");
	    test.listBuild();
	    System.out.println("After Sucessfully deletion ");
	    test.deleteBuild(build2.getId());
	    test.listBuild();
	   

	  }

	  public Build saveBuild(String buildName) {
		  Build build = new Build();
	    try {
	      entityManager.getTransaction().begin();
	      build.setBuildName(buildName);
	      build = entityManager.merge(build);
	      entityManager.getTransaction().commit();
	    } catch (Exception e) {
	      entityManager.getTransaction().rollback();
	    }
	    return build;
	  }

	  public void listBuild() {
	    try {
	      entityManager.getTransaction().begin();
	      @SuppressWarnings("unchecked")
	      List<Build> builds = entityManager.createQuery("from SKILL").getResultList();
	      for (Iterator<Build> iterator = builds.iterator(); iterator.hasNext();) {
	    	  Build build = (Build) iterator.next();
	        System.out.println(build.getBuildName());
	      }
	      entityManager.getTransaction().commit();
	    } catch (Exception e) {
	      entityManager.getTransaction().rollback();
	    }
	  }

	  public void updateBuild(Long buildId, String buildName) {
	    try {
	      entityManager.getTransaction().begin();
	      Build build = (Build) entityManager.find(Build.class, buildId);
	      build.setBuildName(buildName);;
	      entityManager.getTransaction().commit();
	    } catch (Exception e) {
	      entityManager.getTransaction().rollback();
	    }
	  }

	  public void deleteBuild(Long buildId) {
	    try {
	      entityManager.getTransaction().begin();
	      Build build = (Build) entityManager.find(Build.class, buildId);
	      entityManager.remove(build);
	      entityManager.getTransaction().commit();
	    } catch (Exception e) {
	      entityManager.getTransaction().rollback();
	    }
	  }

}
