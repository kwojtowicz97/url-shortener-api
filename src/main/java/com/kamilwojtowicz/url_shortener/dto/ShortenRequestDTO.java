package com.kamilwojtowicz.url_shortener.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotNull;

public class ShortenRequestDTO {
    @NotNull(message = "Url cannot be null")
    @URL(message = "Url must be valid")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
