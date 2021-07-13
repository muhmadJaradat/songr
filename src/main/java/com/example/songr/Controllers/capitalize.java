package com.example.songr.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Locale;

@Controller
public class capitalize {
    @GetMapping("/capitalize/{anythingToCapitalize}")
    public String capitalize(@PathVariable() String anythingToCapitalize, Model model){
model.addAttribute("text",anythingToCapitalize.toUpperCase(Locale.ROOT));
return "capitalize";
    }
}
