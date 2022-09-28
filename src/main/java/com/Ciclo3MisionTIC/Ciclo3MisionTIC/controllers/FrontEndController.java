package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empleadoService;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.perfilesService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontEndController {

    empleadoService serviceEmpleado;
    perfilesService servicePerfil;

    public FrontEndController(empleadoService service, perfilesService servicePerfil){
        this.serviceEmpleado = service;
        this.servicePerfil = servicePerfil;
    }

    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal OidcUser principal) {
        if(principal != null){
            Profile servicePerfil = this.servicePerfil.getOrCreateProfile(principal.getClaims());
            model.addAttribute("perfil", servicePerfil);
        }
        return "index";
    }
}
