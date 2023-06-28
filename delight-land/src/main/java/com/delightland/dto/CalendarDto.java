package com.delightland.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalendarDto {
 
    
    private int cal_no;
    private String cal_anniv;
    private LocalDate cal_date;
    private String sf9_name;
}
