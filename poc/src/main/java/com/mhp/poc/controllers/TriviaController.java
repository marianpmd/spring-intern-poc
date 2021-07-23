package com.mhp.poc.controllers;

import com.mhp.poc.DTOs.TriviaDTO;
import com.mhp.poc.entities.TriviaEntity;
import com.mhp.poc.mappers.TriviaMapper;
import com.mhp.poc.services.TriviaService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/trivia")
@AllArgsConstructor
public class TriviaController {
    private final TriviaService triviaService;


    @GetMapping("/all")
    public ResponseEntity<List<TriviaDTO>> getAllTrivia(){
        List<TriviaDTO> all = triviaService.getAll();
        return ResponseEntity.ok(all);
    }

}
