package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Transaction;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.movimientoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class movimientosControllerV2 {
    movimientoService serviceMovimiento;

    public movimientosControllerV2(movimientoService service){
        this.serviceMovimiento = service;
    }

    @GetMapping("/movementsV2")
    public String Movimientos(Model model){
        List<Transaction> Movimientos = this.serviceMovimiento.getListadeMovimientos();
        model.addAttribute("Movimientos", Movimientos);
        return "Movimientos";
    }

    @GetMapping("/movementsV2/new")
    public String newMovimiento(Model model){
        model.addAttribute("movimientoNuevo", new Transaction());
        return "newMovimiento";
    }
}
