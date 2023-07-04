package com.delightland.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.delightland.domain.Career;
import com.delightland.domain.SF9;

@Mapper
public interface SF9Mapper {
    public boolean newMember(SF9 sf9);

    public List<SF9> findAll();

    public SF9 findByName(String sf9_name);

    public SF9 findByNo(long sf9_no);

    public List<Career> careerByno(int sf9_no);
}
