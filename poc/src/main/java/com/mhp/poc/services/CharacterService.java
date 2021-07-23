package com.mhp.poc.services;

import com.mhp.poc.DTOs.CharacterDTO;
import com.mhp.poc.entities.CharacterEntity;
import com.mhp.poc.mappers.AbilityMapper;
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
    private final AbilityMapper abilityMapper;


    public List<CharacterDTO> getAllCharacters(){
        List<CharacterEntity> all = characterRepository.findAll();
        return characterMapper.entitiesToDto(all);
    }

    public CharacterDTO updateCharacter(CharacterDTO characterDTO) {
        CharacterEntity characterEntity = characterMapper.dtoToEntity(characterDTO);

        CharacterEntity byName = characterRepository.findByName(characterDTO.getName());

        byName.setName(characterDTO.getName());
        byName.setAge(characterDTO.getAge());
        byName.setLastName(characterDTO.getLastName());

        byName.getAbilities().clear();

        byName.getAbilities().addAll(abilityMapper.dtosToEntity(characterDTO.getAbilities()));

        CharacterEntity save = characterRepository.save(byName);
        return characterMapper.entityToDto(save);

    }


    public CharacterDTO addCharacter(CharacterDTO characterDTO) {
        CharacterEntity characterEntity = characterMapper.dtoToEntity(characterDTO);

        CharacterEntity save = characterRepository.save(characterEntity);
        return characterMapper.entityToDto(save);
    }

    public void deleteCharacter(String name) {
        CharacterEntity characterEntity = characterRepository.findByName(name);
        characterRepository.delete(characterEntity);
    }
}
