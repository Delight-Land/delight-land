package com.delightland.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delightland.domain.Dict;
import com.delightland.service.DictService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/dict")
@RequiredArgsConstructor
public class DictController {
    

    private final DictService service;

    @GetMapping("/list")
    public List<Dict> findAll(){
        List<Dict> result = new ArrayList<>();
        result = service.findAll();
        
        return result;
    }

    @GetMapping("/{sf9_name}")
    public List<Dict> findBySF9Name(@PathVariable String sf9_name){
        List<Dict> result = new ArrayList<>();
        result = service.findBySF9Name(sf9_name);
        return result;
    }

    @GetMapping()
    public Dict findByWord(String word){
        Dict result = new Dict();
        result = service.findByWord(word);
        return result;
    }


    @PostMapping("/new")
    public boolean newDict(@RequestBody Dict dict) {
        boolean result = false;
        result = service.newDict(dict);        
        return result;
    }
    
}
