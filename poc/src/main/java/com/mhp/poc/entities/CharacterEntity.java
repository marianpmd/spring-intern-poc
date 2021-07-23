package com.mhp.poc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
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

    @OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn(name = "character_fk",  nullable = false)
    private List<AbilityEntity> abilities = new ArrayList<>();

}
