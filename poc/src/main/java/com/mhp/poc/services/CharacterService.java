package com.mhp.poc.services;

import com.mhp.poc.DTOs.CharacterDTO;
import com.mhp.poc.entities.CharacterEntity;
import com.mhp.poc.mappers.CharacterMapper;
import com.mhp.poc.repositories.CharacterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;


    public List<CharacterDTO> getAllCharacters(){
        List<CharacterEntity> all = characterRepository.findAll();

        return characterMapper.entitiesToDto(all);
    }


    /*public CharacterDTO updateCharacter(CharacterDTO characterDTO) {
        CharacterEntity byId = characterRepository.findById(
                characterMapper.DtoToEntity(characterDTO)
                        .getId())
                        .get();

        byId.setAge(byId.getAge()+1);

        CharacterEntity byName = characterRepository.getOne(1L);

        if (byId.hashCode() == byName.hashCode()){
            System.out.println("OK");
        }else {
            System.out.println("NOT OK");
        }

        characterRepository.save(byId);

        return characterMapper.entityToDto(byId);

    }*/
}
