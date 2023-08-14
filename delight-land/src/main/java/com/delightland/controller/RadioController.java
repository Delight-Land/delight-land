package com.delightland.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delightland.service.RadioService;
@RestController
@RequestMapping("/radio")
public class RadioController {

  @Autowired
  private RadioService radioService;

  @PostMapping("/self/{radio_no}")
  public String RadioOn(@PathVariable int radio_no) {
    
    String result = radioService.findByno(radio_no);
    String radioPath = radioService.getObject(result);
    System.out.println(radioPath);
    
    return radioPath;
  }
  
}
