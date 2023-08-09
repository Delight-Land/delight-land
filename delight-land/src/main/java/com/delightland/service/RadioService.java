package com.delightland.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3Client;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RadioService {
  private final AmazonS3Client amazonS3Client;

  @Value("${cloud.aws.s3.bucket}")
  private String bucketName;

  public String getObject(String path){
    String S3_key = "sf9의 셀프캐해/" + path;
    return amazonS3Client.getUrl(bucketName, S3_key).toString();
  }
}
