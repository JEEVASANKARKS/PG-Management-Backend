package com.pgmanagement.Admin.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MasterLookupDto {
    private Long id;
    private String category;
    private String lookupKey;
    private String lookupValue;
    private Boolean isActive;
}
