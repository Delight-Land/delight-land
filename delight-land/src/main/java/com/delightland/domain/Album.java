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
public class Album {
    

    private int al_no;
    private String al_name;
    private String al_title;
    private LocalDate al_date;
    
    private String sf9_name;
    private long file_no;
}
