package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.*;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empresaService;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.movimientoService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@RestController
public class empresaController {

    empresaService service;
    movimientoService MovementService;

    public empresaController(empresaService service, movimientoService MovementService){
        this.service = service;
        this.MovementService = MovementService;
    }

    @GetMapping("/enterprises")
    public List<Empresa> ConsultarListaEmpresas(){

        return this.service.getListaEmpresas();
    }

    @GetMapping("/enterprises/{id}")
    public List<Empresa> getEnterprise(@PathVariable(value = "id") Long EnterpriseId){
        return this.service.getEnterprise(EnterpriseId);
    }

    @PostMapping("/enterprises")
    //public Empresa createEnterprise(@RequestBody Empresa empresa){
    //    return this.service.createEnterprise(empresa);
    //}
    public RedirectView createEnterprises(@ModelAttribute @DateTimeFormat(pattern = "YYYY-MM-DD") Empresa empresa, Model model){
        model.addAttribute(empresa);
        this.service.createEnterprise(empresa);

        return new RedirectView("/enterprisesV2");
    }

    @DeleteMapping("/enterprises/{id}")
    public RedirectView deleteEnterprises(@PathVariable(value = "id") Long profileId){
        this.service.deleteEnterprises(profileId);
        return new RedirectView("/enterprisesV2");
    }


    //El acceso a la creacion de movimientos solo estara disponible si la empresa existe
    @GetMapping("/enterprises/{id}/movements")
    public List<Transaction> enterpriseMovements(@PathVariable(value = "id") Long EnterpriseId) {
        List<Empresa> prueba = this.service.getEnterprise(EnterpriseId);
        System.out.println(prueba);
        System.out.println(prueba.size());

        if (prueba.size() == 0) {
            return null;
        } else {
            return this.MovementService.getListadeMovimientos();
        }
    }

    @PostMapping("/enterprises/{id}/movements")
    public Transaction createEnterprise(@RequestBody Transaction movimiento, @PathVariable(value = "id") Long EnterpriseId){
        List<Empresa> prueba = this.service.getEnterprise(EnterpriseId);
        System.out.println(prueba);
        System.out.println(prueba.size());

        if (prueba.size() == 0) {
            return null;
        } else {
            return this.MovementService.createTransaction(movimiento);
        }
    }

    @DeleteMapping("/enterprises/{id}/movements/{id2}")
    public void deleteMovement(@PathVariable(value = "id") Long EnterpriseId, @PathVariable(value = "id2") Long MovementId){

        List<Empresa> prueba = this.service.getEnterprise(EnterpriseId);
        System.out.println(prueba);
        System.out.println(prueba.size());

        if (prueba.size() == 0) {
            System.out.println("");
        } else {
            this.MovementService.deleteMovement(MovementId);
        }

    }
    @PatchMapping("/enterprises/{id}/movements")
    public void patchProfile(@RequestBody Transaction movimiento, @PathVariable(value = "id") Long EnterpriseId, @PathVariable(value = "id2") Long MovementId){
        this.MovementService.patchMovement(movimiento, MovementId);

        List<Empresa> prueba = this.service.getEnterprise(EnterpriseId);
        System.out.println(prueba);
        System.out.println(prueba.size());

        if (prueba.size() == 0) {
            System.out.println("");
        } else {
            this.MovementService.patchMovement(movimiento, MovementId);
        }



    }

    }
