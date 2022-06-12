package com.master.yotubeProjects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        
       Employee emp = new Employee();
       
       emp.setEid(101);
       emp.seteName("Mahesh");
       emp.seteCompanyName("Tata Consultancy Services");
       emp.seteSalary(800000);
       
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
       EntityManager em = emf.createEntityManager();
       
       em.getTransaction().begin();
       
       em.persist(emp);
       
       em.getTransaction().commit();
       
       System.out.println(emp);
       
       //Note : project might throw an "PersistenceException". 
       //Same can be resolved by searching it on Google.
    	
    }
}
