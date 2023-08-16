package com.delightland.mapper;



import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface RadioMapper {

  public String findByno(int radio_no);
  
}
