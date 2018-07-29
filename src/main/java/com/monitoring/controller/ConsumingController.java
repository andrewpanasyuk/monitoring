package com.monitoring.controller;

import com.monitoring.model.Consuming;
import com.monitoring.service.ConsumingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class ConsumingController {


    private ConsumingService consumingService;

    @Autowired
    public ConsumingController(ConsumingService consumingService) {
        this.consumingService = consumingService;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Consuming> getAll() {
        return consumingService.allConsuming();
    }

    @PostMapping("/consuming")
    @ResponseBody
    public Consuming post(@Valid @RequestBody Consuming consuming) {

        consumingService.addConsuming(consuming);
        return consuming;

//        try {
//            Employee employee = new Employee(name.getName());
//            employeeService.create(employee);
//            return "Added employee with id: " + employee.getId();
//        } catch (Exception e) {
//            logger.error("Error occurred while creating a new employee", e);
//            return e.getMessage();
//        }
    }
}
