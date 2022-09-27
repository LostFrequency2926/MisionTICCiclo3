package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Transaction;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empleadoService;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empresaService;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.movimientoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class empresaControllerV2 {
    empresaService serviceEmpresa;

    public empresaControllerV2(empresaService service){
        this.serviceEmpresa = service;
    }

    @GetMapping("/enterprisesV2")
    public String Empresas(Model model){
        List<Empresa> Empresas = this.serviceEmpresa.getListaEmpresas();
        model.addAttribute("Empresas", Empresas);
        return "empresas";
    }

    @GetMapping("/enterprisesV2/new")
    public String newEmpresa(Model model){
        model.addAttribute("empresaNueva", new Empresa());
        return "newEmpresa";
    }
}
