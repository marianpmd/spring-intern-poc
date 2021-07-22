package com.mhp.poc.entities;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="episode")
@Data
public class EpisodeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "episode_nr")
    private String episodeNr;

    @Column( name = "release_date")
    private LocalDateTime releaseDate;

    @Column( name = "air_date")
    private LocalDateTime airDate;

    private String platform;
    private String country;

}
