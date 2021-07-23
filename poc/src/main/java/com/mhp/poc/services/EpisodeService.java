package com.mhp.poc.services;

import com.mhp.poc.DTOs.EpisodeDTO;
import com.mhp.poc.entities.EpisodeEntity;

import java.util.List;

public interface EpisodeService {
    List<EpisodeDTO> findByPlatform(String platform);

    List<EpisodeDTO> findAllByCountry(String country);

    List<EpisodeDTO> findAllByPlatformAndEpisodeNr(String country , String episodeNr);

    EpisodeDTO save(EpisodeDTO episodeDTO);

    List<EpisodeDTO> findAllEpisodes();
}
