package com.delightland.service;

import java.util.List;

import com.delightland.domain.Dict;

public interface DictService {
    
	public List<Dict> findAll();

    public List<Dict> findBySF9No(int sf9_no);

    public Dict findByWord(String sf9_word);

	public boolean newDict(Dict dict);

}
