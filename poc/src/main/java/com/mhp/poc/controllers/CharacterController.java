package com.mhp.poc.controllers;

import com.mhp.poc.DTOs.CharacterDTO;
import com.mhp.poc.services.CharacterService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/character")
@AllArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping("/")
    public ResponseEntity<List<CharacterDTO>> getAllCharacters(){
        return ResponseEntity.ok(characterService.getAllCharacters());
    }

}
