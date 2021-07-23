package com.mhp.poc.controllers;

import com.mhp.poc.DTOs.EpisodeDTO;
import com.mhp.poc.services.EpisodeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/episode")
@AllArgsConstructor
@Slf4j
public class EpisodeController {

    private final EpisodeService episodeService;

    @GetMapping
    public ResponseEntity<List<EpisodeDTO>> getAllEpisodes(){
       List<EpisodeDTO> episodes = episodeService.findAllEpisodes();

       return ResponseEntity.ok(episodes);
    }

    @GetMapping("/{platform}")
    public ResponseEntity<List<EpisodeDTO>> getByPlatform(@PathVariable("platform") String platform){
        List<EpisodeDTO> byPlatform = episodeService.findByPlatform(platform);

        return ResponseEntity.ok(byPlatform);
    }


    @GetMapping("/country/{country}")
    public ResponseEntity<List<EpisodeDTO>> getByCountry(@PathVariable("country") String country){
            List<EpisodeDTO> byCountry = episodeService.findAllByCountry(country);

        return ResponseEntity.ok(byCountry);
    }

    @GetMapping("/platformAndNo")
    public ResponseEntity<List<EpisodeDTO>> getByPlatformAndNo(@RequestParam("platform") String platform,
                                                               @RequestParam("no") String no){
        List<EpisodeDTO> allByPlatformAndEpisodeNr = episodeService.findAllByPlatformAndEpisodeNr(platform, no);

        return ResponseEntity.ok(allByPlatformAndEpisodeNr);
    }

    @PostMapping("/save")
    public ResponseEntity<EpisodeDTO> saveEpisode(@RequestBody EpisodeDTO episodeDTO){
        EpisodeDTO save = episodeService.save(episodeDTO);

        return ResponseEntity.ok(save);

    }




}
