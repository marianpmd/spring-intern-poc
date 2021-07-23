package com.mhp.poc.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "trivia")
public class TriviaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
}
