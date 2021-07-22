package com.mhp.poc.mappers;

import com.mhp.poc.DTOs.EpisodeDTO;
import com.mhp.poc.entities.EpisodeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
@Component
public interface EpisodeMapper {

    EpisodeDTO entityToDto(EpisodeEntity episodeEntity);

    EpisodeEntity DtoToEntity(EpisodeDTO episodeDTO);

    List<EpisodeDTO> episodeEntitiesToDto(List<EpisodeEntity> episodeEntityList);
}
