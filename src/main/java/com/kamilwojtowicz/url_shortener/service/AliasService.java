package com.kamilwojtowicz.url_shortener.service;

import org.springframework.stereotype.Service;

import com.kamilwojtowicz.url_shortener.model.Alias;
import com.kamilwojtowicz.url_shortener.repository.AliasRepository;
import com.kamilwojtowicz.url_shortener.util.RandomStringGenerator;

@Service
public class AliasService {
    private final AliasRepository aliasRepository;

    public AliasService(AliasRepository aliasRepository) {
        this.aliasRepository = aliasRepository;
    }

    public String shortenUrl(String url) {
        String shortUrl;
        do {
            shortUrl = RandomStringGenerator.generateRandomString(8, RandomStringGenerator.ALPHANUMERIC);
        } while (aliasRepository.findByShortUrl(shortUrl) != null);
        aliasRepository.save(new Alias(shortUrl, url));

        return shortUrl;
    }
}
