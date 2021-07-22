package com.mhp.poc.controllers;

import com.mhp.poc.DTOs.CharacterDTO;
import com.mhp.poc.services.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
@AllArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping("/all")
    public ResponseEntity<List<CharacterDTO>> getAllCharacters(){
        return ResponseEntity.ok(characterService.getAllCharacters());
    }

    @PutMapping("/")
    public CharacterDTO updateCharacter(@RequestBody CharacterDTO characterDTO){
        return characterService.updateCharacter(characterDTO);
    }

}
