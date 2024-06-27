package com.kamilwojtowicz.url_shortener.dto;

import jakarta.validation.constraints.NotNull;

public class ShortenRequestDTO {
    @NotNull(message = "Url cannot be null")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
