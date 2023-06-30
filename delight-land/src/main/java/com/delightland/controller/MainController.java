package com.delightland.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.delightland.domain.SF9;
import com.delightland.service.SF9Service;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
    
    private final SF9Service service;

    @GetMapping("/test")
    public void test(){
        
    }

    @ResponseBody
    @GetMapping("/new")
    public String newMember(SF9 sf9){
        boolean result = service.newMember(sf9);
        return result ? "success": "fail";
    }
}
