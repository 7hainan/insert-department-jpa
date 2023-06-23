package com.devesteves;

import com.devesteves.model.entities.Department;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Department department = new Department("JPA HIBERNATE");

        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("exemplo-jpa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
            entityManager.persist(department);
        entityManager.getTransaction().commit();
        System.out.println("Department created");

        entityManager.close();
        entityManagerFactory.close();
    }
}