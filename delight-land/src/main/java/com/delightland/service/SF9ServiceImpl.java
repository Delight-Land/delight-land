package com.delightland.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.delightland.domain.SF9;
import com.delightland.mapper.SF9Mapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SF9ServiceImpl implements SF9Service {

    private final SF9Mapper sf9Mapper;


    @Override
    public boolean newMember(SF9 sf9) {
        return sf9Mapper.newMember(sf9);
    }
    
    @Override
    public List<SF9> findAll(){
        List<SF9> list = sf9Mapper.findAll();
        System.out.println(list);
        return sf9Mapper.findAll();
    }

    @Override
    public SF9 findByName(String sf9_name){
        return sf9Mapper.findByName(sf9_name);
    }
    
    @Override
    public SF9 findByNo(int sf9_no){
        System.out.println(sf9_no);
        SF9 result = new SF9();
        result = sf9Mapper.findByNo(sf9_no);
        System.out.println(result);
        return sf9Mapper.findByNo(sf9_no);
    }

}
