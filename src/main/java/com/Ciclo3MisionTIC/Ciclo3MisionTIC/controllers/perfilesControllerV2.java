package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.perfilesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class perfilesControllerV2 {
    perfilesService serviceProfile;

    public perfilesControllerV2(perfilesService service){
        this.serviceProfile = service;
    }

    @GetMapping("/profilesV2")
    public String Perfiles(Model model){
        List<Profile> Perfiles = this.serviceProfile.getListaPerfiles();
        model.addAttribute("Perfiles", Perfiles);
        return "Perfiles";
    }

    @GetMapping("/profilesV2/new")
    public String newPerfiles(Model model){
        model.addAttribute("perfilNuevo", new Profile());
        return "newPerfil";
    }

}
