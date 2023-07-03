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
public class Career {
    
    private long career_no;
    private String career_name;
    private String career_role;
    private LocalDate career_date;
    private String sf9_name;
    private long file_no;
}
