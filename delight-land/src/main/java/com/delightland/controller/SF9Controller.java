package com.delightland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delightland.domain.Career;
import com.delightland.domain.SF9;
import com.delightland.service.SF9Service;


@RestController
@RequestMapping("/sf9")
public class SF9Controller {

    @Autowired
    private SF9Service service;
    
    @GetMapping
    public List<SF9> findAll(){
        return service.findAll();
    }

    @GetMapping("/name")
    public SF9 findByName(String sf9_name){
        SF9 result =  service.findByName(sf9_name);
        return result != null ? result : null;
    }
    @GetMapping("/{sf9_name}")
    public SF9 findByNo(@PathVariable String sf9_name){
        SF9 result =  service.findByName(sf9_name);
        return result;
    }

    @GetMapping("/new")
    public String newMember(SF9 sf9){
        boolean result = service.newMember(sf9);
        return result ? "success": "fail";
    }

    @GetMapping("/career/{sf9_no}")
    public List<Career> Career(@PathVariable int sf9_no){
        List<Career> result = service.careerByno(sf9_no);
        System.out.println(result.get(0).getCareer_name().toString());
        return  result;
    }
}
