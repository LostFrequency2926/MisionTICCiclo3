package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Transaction;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaPerfiles;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.perfilesService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class perfilesController {

    perfilesService service;

    public perfilesController(perfilesService service){
        this.service = service;
    }

    @GetMapping("/profiles")
    public List<Profile> ConsultarListaPerfiles(){
        return this.service.getListaPerfiles();
    }

    @PostMapping("/profiles")
    //public Profile createProfile(@RequestBody Profile perfil){
    //    return this.service.createProfile(perfil);
    //}
    public RedirectView createProfile(@ModelAttribute @DateTimeFormat(pattern = "YYYY-MM-DD") Profile perfil, Model model){
        model.addAttribute(perfil);
        this.service.createProfile(perfil);

        return new RedirectView("/profilesV2");
    }

    @DeleteMapping("/profiles/{id}")
    //public void deleteProfile(@PathVariable(value = "id") Long profileId){
    //    this.service.deleteProfile(profileId);
    //}
    public RedirectView deleteProfile(@PathVariable(value = "id") Long profileId){
        this.service.deleteProfile(profileId);
        return new RedirectView("/profilesV2");
    }


    @PatchMapping("/profiles/{id}")
    //public void patchProfile(@RequestBody Profile perfil, @PathVariable(value = "id") Long profileId){
    //    this.service.patchProfile(perfil, profileId);
    //}
    public RedirectView patchProfile(@PathVariable(value = "id") Long profileId){
        this.service.patchProfile(profileId);
        return new RedirectView("/profilesV2");
    }

}
