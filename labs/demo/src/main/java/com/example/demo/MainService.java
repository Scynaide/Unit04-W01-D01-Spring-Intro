package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MainService {

    private final HelperService helperService;

    @Autowired
    public MainService(HelperService helperService) {
        this.helperService = helperService;
    }
    public void performAction() {
        String helpMessage = helperService.getHelp();
        System.out.println("HelperService is working!");
    }
}