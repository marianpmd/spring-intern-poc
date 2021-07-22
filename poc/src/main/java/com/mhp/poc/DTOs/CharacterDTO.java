package com.mhp.poc.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class CharacterDTO {
    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private List<AbilityDTO> abilities;
}
