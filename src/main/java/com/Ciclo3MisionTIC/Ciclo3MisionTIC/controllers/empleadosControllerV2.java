package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empleado;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empleadoService;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.perfilesService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class empleadosControllerV2 {
    empleadoService serviceEmpleado;
    perfilesService serviceProfile2;

    public empleadosControllerV2(empleadoService service, perfilesService service2){
        this.serviceEmpleado = service;
        this.serviceProfile2 = service2;
    }

    @GetMapping("/employeesV2")
    public String Empleados(Model model, @AuthenticationPrincipal OidcUser principal){
        List<Empleado> Empleados = this.serviceEmpleado.getListaUsuarios();
        model.addAttribute("Empleados", Empleados);

        Profile servicePerfil = this.serviceProfile2.getOrCreateProfile(principal.getClaims());
        model.addAttribute("perfilAdm", servicePerfil);

        return "empleados";
    }

    @GetMapping("/employeesV2/new")
    public String new_Empleado(Model model){
        model.addAttribute("empleadoNuevo", new Empleado());
        return "newEmpleado";
    }
}
