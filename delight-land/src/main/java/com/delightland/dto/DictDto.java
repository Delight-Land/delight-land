package com.delightland.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DictDto {
    
    private int dict_no;
    private String dict_word;
    private String dict_mean;

    private List<SF9> member;

}
