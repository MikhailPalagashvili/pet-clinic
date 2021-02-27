package com.mikhailpalagashvili.petclinic.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping({"/owner", "/owner/index", "/owner/index.html"})
public class OwnerController {
    @GetMapping
    public String listOwners() {
        return "owners/index";
    }
}
