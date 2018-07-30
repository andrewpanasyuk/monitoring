package com.monitoring.dao;

import com.monitoring.model.Consuming;

import java.util.List;

public interface ConsumingDAO {

    void addConsuming(Consuming consuming);
    List<Consuming> allConsumings(String userName);
}
