package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Transaction;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empleadoService;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empresaService;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.movimientoService;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.perfilesService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class empresaControllerV2 {
    empresaService serviceEmpresa;
    perfilesService serviceProfile2;

    public empresaControllerV2(empresaService service, perfilesService service2){
        this.serviceEmpresa = service;
        this.serviceProfile2 = service2;
    }

    @GetMapping("/enterprisesV2")
    public String Empresas(Model model, @AuthenticationPrincipal OidcUser principal){
        List<Empresa> Empresas = this.serviceEmpresa.getListaEmpresas();
        model.addAttribute("Empresas", Empresas);

        Profile servicePerfil = this.serviceProfile2.getOrCreateProfile(principal.getClaims());
        model.addAttribute("perfilAdm", servicePerfil);

        return "empresas";
    }

    @GetMapping("/enterprisesV2/new")
    public String newEmpresa(Model model){
        model.addAttribute("empresaNueva", new Empresa());
        return "newEmpresa";
    }
}
