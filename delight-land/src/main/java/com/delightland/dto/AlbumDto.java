package com.delightland.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlbumDto {
    

    private int al_no;
    private String al_name;
    private String al_title;
    private LocalDate al_date;
    
    private List<String> sf9_name;
    private List<Long> file_no;
}
