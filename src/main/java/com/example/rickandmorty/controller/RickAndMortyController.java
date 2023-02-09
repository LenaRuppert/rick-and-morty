package com.example.rickandmorty.controller;

import com.example.rickandmorty.model.RMCharacter;
import com.example.rickandmorty.service.RickAndMortyApiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RickAndMortyController {
    private RickAndMortyApiService rickAndMortyApiService;

    @GetMapping("/characters")
    public List<RMCharacter> getRMCharacters(){
        return rickAndMortyApiService.getAllCharacters();
    }
}

