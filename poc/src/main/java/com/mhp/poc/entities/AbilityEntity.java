package com.mhp.poc.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ability")
@Data
public class AbilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "character_fk")
    CharacterEntity characterEntity;
}
