package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.perfilesService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class perfilesControllerV2 {
    perfilesService serviceProfile;
    perfilesService serviceProfile2;

    public perfilesControllerV2(perfilesService service){
        this.serviceProfile = service;
        this.serviceProfile2 = service;
    }


    @GetMapping("/profilesV2")
    public String Perfiles(Model model, @AuthenticationPrincipal OidcUser principal){
        List<Profile> Perfiles = this.serviceProfile.getListaPerfiles();
        model.addAttribute("Perfiles", Perfiles);

        Profile servicePerfil = this.serviceProfile2.getOrCreateProfile(principal.getClaims());
        model.addAttribute("perfilAdm", servicePerfil);

        return "perfiles";
    }

    @GetMapping("/profilesV2/new")
    public String newPerfiles(Model model){
        model.addAttribute("perfilNuevo", new Profile());
        return "newPerfil";
    }

}
