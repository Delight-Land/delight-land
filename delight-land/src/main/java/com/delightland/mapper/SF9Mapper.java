package com.delightland.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.delightland.domain.SF9;

@Mapper
public interface SF9Mapper {
    public boolean newMember(SF9 sf9);
}
