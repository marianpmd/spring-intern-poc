package com.mhp.poc.repositories;

import com.mhp.poc.entities.EpisodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodeRepository extends JpaRepository<EpisodeEntity,Long> {

    List<EpisodeEntity> findAllByCountry(String country);

    List<EpisodeEntity> findAllByPlatform(String platform);

    List<EpisodeEntity> findAllByPlatformAndEpisodeNr(String country , String episodeNr);


}
