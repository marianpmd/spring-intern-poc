package com.mhp.poc.services;

import com.mhp.poc.DTOs.EpisodeDTO;
import com.mhp.poc.entities.EpisodeEntity;
import com.mhp.poc.mappers.EpisodeMapper;
import com.mhp.poc.repositories.EpisodeRepository;
import liquibase.pro.packaged.E;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class EpisodeServiceImpl implements EpisodeService {

    private final EpisodeRepository episodeRepository;
    private final EpisodeMapper episodeMapper;

    @Override
    public List<EpisodeDTO> findByPlatform(String platform) {
        List<EpisodeEntity> allByPlatform = episodeRepository.findAllByPlatform(platform);

        return episodeMapper.episodeEntitiesToDto(allByPlatform);
    }

    @Override
    public List<EpisodeDTO> findAllByCountry(String country) {
        List<EpisodeEntity> allByCountry = episodeRepository.findAllByCountry(country);

        return episodeMapper.episodeEntitiesToDto(allByCountry);
    }

    @Override
    public List<EpisodeDTO> findAllByPlatformAndEpisodeNr(String country, String episodeNr) {
        List<EpisodeEntity> allByPlatformAndEpisodeNr = episodeRepository.findAllByPlatformAndEpisodeNr(country, episodeNr);

        return episodeMapper.episodeEntitiesToDto(allByPlatformAndEpisodeNr);
    }

    @Override
    public EpisodeDTO save(EpisodeDTO episodeDTO) {
        EpisodeEntity save = episodeRepository.save(episodeMapper.DtoToEntity(episodeDTO));
        log.debug("SAVED ENTRY : " + episodeDTO);
        return episodeMapper.entityToDto(save);
    }
}
