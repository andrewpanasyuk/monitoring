package com.monitoring.service;

import com.monitoring.dao.ConsumingDAO;
import com.monitoring.model.Consuming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ConsumingServiceImpl implements ConsumingService {

    @Autowired
    private ConsumingDAO consumingDAO;

    @Override
    public void addConsuming(Consuming consuming) {
        consumingDAO.addConsuming(consuming);
    }

    @Override
    public List<Consuming> allConsuming(String userName) {
        return consumingDAO.allConsumings(userName);
    }
}
