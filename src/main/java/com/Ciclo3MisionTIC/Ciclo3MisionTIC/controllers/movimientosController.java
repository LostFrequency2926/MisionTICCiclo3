package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Transaction;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaMovimientos;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.movimientoService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class movimientosController {
    movimientoService service;

    public movimientosController(movimientoService service){
        this.service = service;
    }

    @GetMapping("/movements")
    public List<Transaction> ConsultarListaMovimientos(){
        return this.service.getListadeMovimientos();
    }

    @PostMapping("/movements")
    //public Transaction createTransaction(@RequestBody Transaction movimiento){
    //    return this.service.createTransaction(movimiento);
    //}
    public RedirectView createProfile(@ModelAttribute @DateTimeFormat(pattern = "YYYY-MM-DD") Transaction movimiento, Model model){
        model.addAttribute(movimiento);
        this.service.createTransaction(movimiento);

        return new RedirectView("/movementsV2");
    }


    @DeleteMapping("/movements/{id}")
    //public void deleteMovement(@PathVariable(value = "id") Long profileId){
    //    this.service.deleteMovement(profileId);
    //}
    public RedirectView deleteMovement(@PathVariable(value = "id") Long profileId){
        this.service.deleteMovement(profileId);
        return new RedirectView("/movementsV2");
    }

    @PatchMapping("/movements/{id}")
    public void patchProfile(@RequestBody Transaction movimiento, @PathVariable(value = "id") Long movimientoId){
        this.service.patchMovement(movimiento, movimientoId);
    }


}
