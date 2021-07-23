package com.mhp.poc.mappers;

import com.mhp.poc.DTOs.CharacterDTO;
import com.mhp.poc.DTOs.CharacterNameAgeDTO;
import com.mhp.poc.entities.CharacterEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring" , uses = {AbilityMapper.class})
public interface CharacterMapper {

    CharacterDTO entityToDto(CharacterEntity characterEntity);

    CharacterEntity dtoToEntity(CharacterDTO characterDTO);

    List<CharacterDTO> entitiesToDto(List<CharacterEntity> characterEntities);

    List<CharacterEntity> dtosToEntity(List<CharacterDTO> characterDTOS);

    CharacterNameAgeDTO entityToNameAge(CharacterEntity entity);

    List<CharacterNameAgeDTO> entitiesToNameAge(List<CharacterEntity> characterEntities);

}
