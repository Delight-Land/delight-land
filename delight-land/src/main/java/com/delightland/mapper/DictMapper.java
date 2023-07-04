package com.delightland.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.delightland.domain.Dict;

@Mapper
public interface DictMapper {
    

    public List<Dict> findAll();

    public List<Dict> findBySF9No(int sf9_no);

    public Dict findByWord(String sf9_word);

    public boolean newDict(Dict dict);
}
