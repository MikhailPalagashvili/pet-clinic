package com.mikhailpalagashvili.petclinic.controllers;

import com.mikhailpalagashvili.petclinic.services.OwnerService;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping({"/owner", "/owner/index", "/owner/index.html"})
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping
    public String listOwners(final Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
