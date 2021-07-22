package com.mhp.poc.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "character")
@Data
public class CharacterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer age;
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "characterEntity")
    private List<AbilityEntity> abilities;

}
