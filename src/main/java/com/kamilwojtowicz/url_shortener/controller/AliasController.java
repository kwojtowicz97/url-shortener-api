package com.kamilwojtowicz.url_shortener.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kamilwojtowicz.url_shortener.dto.ShortenRequestDTO;
import com.kamilwojtowicz.url_shortener.dto.ShortenResponseDTO;
import com.kamilwojtowicz.url_shortener.service.AliasService;
import org.springframework.http.HttpStatus;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class AliasController {

    @Autowired
    private AliasService urlService;

    @PostMapping("/shorten")
    public ResponseEntity<ShortenResponseDTO> shortenUrl(@Valid @RequestBody ShortenRequestDTO shortenRequestDTO) {
        String shortUrl = urlService.shortenUrl(shortenRequestDTO.getUrl());

        return ResponseEntity.status(HttpStatus.CREATED).body(new ShortenResponseDTO(shortUrl));
    }
}