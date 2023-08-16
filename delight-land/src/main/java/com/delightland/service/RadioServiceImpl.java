package com.delightland.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3Client;
import com.delightland.mapper.RadioMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RadioServiceImpl implements RadioService {

  private final RadioMapper RadioMapper;

    private final AmazonS3Client amazonS3Client;

  @Value("${cloud.aws.s3.bucket}")
  private String bucketName;
  
  @Override
    public String getObject(String path){
      String S3_key = "sf9의 셀프캐해/" + path;
      return amazonS3Client.getUrl(bucketName, S3_key).toString();
    }


  @Override
    public String findByno(int radio_no){
        String result = RadioMapper.findByno(radio_no);
        System.out.println(result);
        return RadioMapper.findByno(radio_no);
    }
  
}
