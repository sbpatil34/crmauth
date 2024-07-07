package com.crm.crmauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crmauth")
public class CrmauthController {
    @GetMapping("/customer")
    public String getCustomer(){
        return "from crm auth get customer";
    }

    @GetMapping("/home")
    public String getHome(){
        System.out.println("from get home");
        return "from home endpoint";
    }
}
