package com.mikhailpalagashvili.petclinic.controllers;

import com.mikhailpalagashvili.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping
    public String listVets(final Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
