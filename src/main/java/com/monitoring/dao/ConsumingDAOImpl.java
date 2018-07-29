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
    public List<Consuming> allConsumings() {
        return entityManager.createQuery("Select t from " + Consuming.class.getSimpleName() + " t").getResultList();
    }
}
