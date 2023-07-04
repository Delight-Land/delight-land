package com.delightland.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delightland.domain.Dict;
import com.delightland.mapper.DictMapper;

@Service
public class DictServiceImpl implements DictService{

    @Autowired
    private DictMapper mapper;

    @Override
    public List<Dict> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<Dict> findBySF9Name(String name) {
        String sf9_name = "%" + name + "%";
        System.out.println(sf9_name);
        return mapper.findBySF9Name(sf9_name);
    }

    @Override
    public Dict findByWord(String sf9_word) {
        return mapper.findByWord(sf9_word);
    }
    
    @Override
    public boolean newDict(Dict dict){
        if(dict.getFile_no()==0){
            //dict.setFile_no(1);
        }
        if(dict.getSf9_name().isEmpty()){
            //dict.setSf9_no(1);
        }
        return mapper.newDict(dict);
        //return true;
    }
}
