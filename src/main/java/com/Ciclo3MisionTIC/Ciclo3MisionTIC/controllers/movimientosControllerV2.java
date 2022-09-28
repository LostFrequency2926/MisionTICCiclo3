package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Transaction;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.movimientoService;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.perfilesService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class movimientosControllerV2 {
    movimientoService serviceMovimiento;
    perfilesService serviceProfile2;

    public movimientosControllerV2(movimientoService service, perfilesService service2){
        this.serviceMovimiento = service;
        this.serviceProfile2 = service2;
    }

    @GetMapping("/movementsV2")
    public String Movimientos(Model model, @AuthenticationPrincipal OidcUser principal){
        List<Transaction> Movimientos = this.serviceMovimiento.getListadeMovimientos();
        model.addAttribute("Movimientos", Movimientos);

        Profile servicePerfil = this.serviceProfile2.getOrCreateProfile(principal.getClaims());
        model.addAttribute("perfilAdm", servicePerfil);

        return "Movimientos";
    }

    @GetMapping("/movementsV2/new")
    public String newMovimiento(Model model){
        model.addAttribute("movimientoNuevo", new Transaction());
        return "newMovimiento";
    }
}
