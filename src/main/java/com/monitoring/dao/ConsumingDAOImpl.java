package com.monitoring.dao;

import com.monitoring.model.Consuming;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ConsumingDAOImpl implements ConsumingDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addConsuming(Consuming consuming) {
        entityManager.persist(consuming);
    }

    @Override
    public List<Consuming> allConsumings(String userName) {
        return entityManager.createQuery("SELECT t FROM " + Consuming.class.getSimpleName() + " t WHERE t.user LIKE :userName").setParameter("userName", userName).getResultList();

    }
}
