package com.mhp.poc.services;

import com.mhp.poc.DTOs.CharacterDTO;
import com.mhp.poc.DTOs.CharacterNameAgeDTO;
import com.mhp.poc.entities.CharacterEntity;
import com.mhp.poc.mappers.AbilityMapper;
import com.mhp.poc.mappers.CharacterMapper;
import com.mhp.poc.repositories.CharacterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        CharacterEntity byName = characterRepository
                .findById(characterDTO.getId())
                .orElseThrow();

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

    public boolean deleteCharacter(Long id) {
        Optional<CharacterEntity> characterEntity = characterRepository
                .findById(id);

        if (characterEntity.isPresent()){
            characterRepository.delete(characterEntity.get());
            return true;
        }
        return false;
    }

    public CharacterDTO getCharacterById(Long id) {
        CharacterEntity byName = characterRepository
                .findById(id)
                .orElseThrow();

        return characterMapper.entityToDto(byName);
    }

    public List<CharacterNameAgeDTO> getCharacterNameAge() {
        List<CharacterEntity> byName = characterRepository.findAll();

        return characterMapper.entitiesToNameAge(byName);
    }
}
