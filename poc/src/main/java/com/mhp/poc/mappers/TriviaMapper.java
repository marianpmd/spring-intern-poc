package com.mhp.poc.mappers;

import com.mhp.poc.DTOs.TriviaDTO;
import com.mhp.poc.entities.TriviaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TriviaMapper {
    TriviaDTO entityToDto(TriviaEntity triviaEntity);

    TriviaEntity dtoToEntity(TriviaDTO triviaDTO);

    List<TriviaDTO> entitiesToDto(List<TriviaEntity> entities);

}
