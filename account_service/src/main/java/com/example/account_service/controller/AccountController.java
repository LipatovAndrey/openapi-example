package com.example.account_service.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/api")
public class AccountController {

    @Operation(summary = "getAccount", description = "test method for get account")
    @GetMapping("/test")
    public String getAccount(){
        return "Account1";
    }
}
