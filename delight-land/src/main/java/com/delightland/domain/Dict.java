package com.delightland.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Dict {
    
    private int dict_no;
    private String dict_word;
    private String dict_mean;

    private String sf9_name;
    private long file_no;

}
