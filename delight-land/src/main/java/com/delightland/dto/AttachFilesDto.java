package com.delightland.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AttachFilesDto {
    
    private long file_no;
    private String file_name;
    private String file_path;
    private String file_uuid;
    private LocalDateTime file_date;
    private String file_ext;
}
