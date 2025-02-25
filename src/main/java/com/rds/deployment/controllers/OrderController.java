package com.rds.deployment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/public/order")
public class OrderController {
    @GetMapping()
    public List<Integer> getOrders(){
        System.out.println("Orders gets");
        return new ArrayList<>(Arrays.asList(1,2,3));
    }
}
