package com.mhp.poc.mappers;

import com.mhp.poc.DTOs.CharacterDTO;
import com.mhp.poc.entities.CharacterEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CharacterMapper {

    CharacterDTO entityToDto(CharacterEntity characterEntity);

    CharacterEntity DtoToEntity(CharacterDTO characterDTO);

    List<CharacterDTO> entitiesToDto(List<CharacterEntity> characterEntities);

}
