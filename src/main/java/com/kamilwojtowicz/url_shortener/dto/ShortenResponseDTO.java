package com.kamilwojtowicz.url_shortener.dto;

public class ShortenResponseDTO {

    private String shortUrl;

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public ShortenResponseDTO(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}
