package com.delightland.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictService {
    

    public List<List<String>> readCsv(){
		List<List<String>> list = new ArrayList<>();
		
		File csv = new File("/Users/jjyoun/Downloads/dict.csv");
		BufferedReader br = null;
		String line = "";
		
		try {
			br = new BufferedReader(new FileReader(csv));
			while((line=br.readLine())!=null) {
				List<String> aLine = new ArrayList<>();
				String[] lineArr = line.split(",");
				aLine = Arrays.asList(lineArr);
				if (lineArr.length!=0) {
					list.add(aLine);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) {
					br.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
}
