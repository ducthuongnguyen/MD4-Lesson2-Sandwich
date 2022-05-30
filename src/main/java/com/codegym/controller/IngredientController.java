package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class IngredientController {
    @GetMapping()
    public String index() {
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam String[] condiment, Model model) {
        model.addAttribute("con",condiment);
        return "list";
    }
}
