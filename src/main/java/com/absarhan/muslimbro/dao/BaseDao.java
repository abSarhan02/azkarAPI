package com.absarhan.muslimbro.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public abstract class BaseDao {

    private static EntityManagerFactory entityManagerFactory = null;

    protected EntityManager entityManager;

    protected EntityManager getEntityManager() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = getEntityManagerFactory().createEntityManager();
        }
        return entityManager;
    }

    private EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null || !entityManagerFactory.isOpen()) {
            entityManagerFactory = Persistence.createEntityManagerFactory("DefaultPersistenceUnit");
        }
        return entityManagerFactory;
    }

    public void close() {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }

    public <T> T get(Class<T> entityClass, Long id) {
        return getEntityManager().find(entityClass, id);
    }

    public <T> List<T> getAll(Class<T> entityClass) {
        String query = "SELECT e FROM " + entityClass.getName() + " e";
        return getEntityManager().createQuery(query, entityClass).getResultList();
    }

    public void save(Object entity) {
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new RuntimeException("Error saving entity: " + e.getMessage(), e);
        }
    }

    public void update(Object entity) {
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new RuntimeException("Error updating entity: " + e.getMessage(), e);
        }
    }


    public void delete(Object entity) {
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.contains(entity) ? entity : em.merge(entity));
            em.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new RuntimeException("Error deleting entity: " + e.getMessage(), e);
        }
    }
}
