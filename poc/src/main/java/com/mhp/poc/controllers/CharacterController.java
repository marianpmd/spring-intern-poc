package com.mhp.poc.controllers;

import com.mhp.poc.DTOs.CharacterDTO;
import com.mhp.poc.DTOs.CharacterNameAgeDTO;
import com.mhp.poc.services.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
@AllArgsConstructor
@CrossOrigin
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping("/all")
    public ResponseEntity<List<CharacterDTO>> getAllCharacters(){
        return ResponseEntity.ok(characterService.getAllCharacters());
    }

    @GetMapping("/getById")
    public ResponseEntity<CharacterDTO> getByName(@RequestParam(value = "id") Long id){
       CharacterDTO character = characterService.getCharacterById(id);

       return ResponseEntity.ok(character);
    }

    @GetMapping("/getNameAndAge")
    public ResponseEntity<List<CharacterNameAgeDTO>> getNameAndAge(){
        List<CharacterNameAgeDTO> characterNameAge = characterService.getCharacterNameAge();

        return ResponseEntity.ok(characterNameAge);
    }

    @PostMapping("/save")
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
    public ResponseEntity<Long> deleteCharacter(@RequestParam(value = "id") Long id){
        System.out.println(id);
        boolean wasDeleted = characterService.deleteCharacter(id);

        if (!wasDeleted){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(id);
    }



}
