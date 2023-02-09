package com.example.rickandmorty.service;

import com.example.rickandmorty.model.RMApiCharactersResponse;
import com.example.rickandmorty.model.RMCharacter;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RickAndMortyApiService {

    private WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/");

    public List<RMCharacter> getAllCharacters() {
        RMApiCharactersResponse rmApiCharactersResponse = webClient.get()
                .uri("/character")
                .retrieve()
                .toEntity(RMApiCharactersResponse.class)
                .block()
                .getBody();

        return rmApiCharactersResponse.rmCharacterList();
    }


}
