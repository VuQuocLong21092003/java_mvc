package com.rungroop.web.service;

import com.rungroop.web.dto.ClubDto;
import com.rungroop.web.models.Club;
import lombok.Builder;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
