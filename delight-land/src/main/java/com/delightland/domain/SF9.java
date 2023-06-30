package com.delightland.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SF9 {

    private int sf9_no;
    private String sf9_name;
    private LocalDate sf9_birth;
    private String sf9_insta;
    
}
