package com.delightland.service;

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
    

}
