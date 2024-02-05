package com.rungroop.web.respository;

import com.rungroop.web.models.Club;
import lombok.Builder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRespository extends JpaRepository<Club, Long>{
    Optional<Club> findByTitle(String url);
}
