package com.monitoring.service;

import com.monitoring.model.Consuming;

import java.util.List;

public interface ConsumingService {
    void addConsuming(Consuming consuming);
    List<Consuming> allConsuming();
}
