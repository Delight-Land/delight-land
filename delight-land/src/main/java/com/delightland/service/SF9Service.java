package com.delightland.service;

import java.util.List;

import com.delightland.domain.Career;
import com.delightland.domain.SF9;

public interface SF9Service {
    
    public boolean newMember(SF9 sf9);

    public List<SF9> findAll();

    public SF9 findByName(String sf9_name);

    public SF9 findByNo(int sf9_no);

    public List<Career> careerByno(int sf9_no);
}
