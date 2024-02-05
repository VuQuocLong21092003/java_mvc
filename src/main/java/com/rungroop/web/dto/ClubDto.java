package com.rungroop.web.dto;

import lombok.Builder;

import java.time.LocalDateTime;
@Builder
public class ClubDto {
    private Long id;
    private String title;
    private String photoUrl;
    private String content;
    private LocalDateTime createOn;
    private LocalDateTime updateOn;
}
