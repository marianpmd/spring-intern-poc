package com.mhp.poc.services;

import com.mhp.poc.DTOs.TriviaDTO;
import com.mhp.poc.entities.TriviaEntity;
import com.mhp.poc.mappers.TriviaMapper;
import com.mhp.poc.repositories.TriviaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TriviaService {
    private final TriviaRepository triviaRepository;
    private final TriviaMapper triviaMapper;

    public List<TriviaDTO> getAll() {
        List<TriviaEntity> all = triviaRepository.findAll();
        return triviaMapper.entitiesToDto(all);
    }
}
