package com.mhp.poc.mappers;

import com.mhp.poc.DTOs.AbilityDTO;
import com.mhp.poc.entities.AbilityEntity;
import lombok.Data;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AbilityMapper {

    AbilityDTO entityToDto(AbilityEntity abilityEntity);
    AbilityEntity dtoToEntity(AbilityDTO abilityDTO);

    List<AbilityEntity> dtosToEntity(List<AbilityDTO> abilityDTOS);

}
