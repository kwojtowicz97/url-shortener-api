package com.kamilwojtowicz.url_shortener.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamilwojtowicz.url_shortener.model.Alias;

public interface AliasRepository extends JpaRepository<Alias, Long> {
    Alias findByShortUrl(String shortUrl);
}
