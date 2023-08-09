package com.delightland.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delightland.service.RadioService;

@RestController
@RequestMapping("/radio")
public class RadioController {

  @Autowired
  private RadioService radioService;

  @PostMapping("/self")
  public void RadioOn() {
    String radioPath = radioService.getObject("01. 캐해불가 셒구.mp3");
    System.out.println(radioPath);
  }
  
}
