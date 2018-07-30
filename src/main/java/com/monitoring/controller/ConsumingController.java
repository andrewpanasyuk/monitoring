package com.monitoring.controller;

import com.monitoring.model.Consuming;
import com.monitoring.service.ConsumingService;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class ConsumingController {

    private ConsumingService consumingService;

    @Autowired
    public ConsumingController(ConsumingService consumingService) {
        this.consumingService = consumingService;
    }

    @PostMapping("/all")
    @ResponseBody
    public List<Consuming> getAllbyUser(@RequestBody String userName) {
        JSONParser parser = new JSONParser();
        List<Consuming> consumingList = new ArrayList<>();
        try {
            JSONObject obj = (JSONObject) parser.parse(userName);
            consumingList = consumingService.allConsuming((String)obj.get("user"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return consumingList;
    }

    @PostMapping("/consuming")
    @ResponseBody
    public Consuming post(@Valid @RequestBody Consuming consuming) {
        consumingService.addConsuming(consuming);
        return consuming;

    }

}
