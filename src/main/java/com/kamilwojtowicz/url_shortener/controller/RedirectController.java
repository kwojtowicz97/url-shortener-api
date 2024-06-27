package com.kamilwojtowicz.url_shortener.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kamilwojtowicz.url_shortener.service.AliasService;

@Controller
public class RedirectController {
    @Autowired
    private AliasService aliasService;

    @GetMapping("/{alias}")
    public String redirect(@PathVariable String alias) {
        String redirectUrl = aliasService.getRedirectUrl(alias);
        return "redirect:" + redirectUrl;
    }
}
