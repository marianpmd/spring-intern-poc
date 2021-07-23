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

    @PostMapping("/add")
    public ResponseEntity<CharacterDTO> addCharacter(@RequestBody CharacterDTO characterDTO){
        CharacterDTO character = characterService.addCharacter(characterDTO);
        return ResponseEntity.ok(character);
    }

    @PutMapping("/update")
    public ResponseEntity<CharacterDTO> updateCharacter(@RequestBody CharacterDTO characterDTO){
        CharacterDTO character = characterService.updateCharacter(characterDTO);
        return ResponseEntity.ok(character);
    }

    @DeleteMapping("/delete")
    public void deleteCharacter(@RequestParam(value = "name") String name){
        characterService.deleteCharacter(name);
    }



}
