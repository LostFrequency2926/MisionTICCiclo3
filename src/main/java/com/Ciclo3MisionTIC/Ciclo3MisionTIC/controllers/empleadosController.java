package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empleado;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empleadoService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class empleadosController {

    empleadoService service;

    public empleadosController(empleadoService service){
        this.service = service;
    }


    @GetMapping("/employees")
    public List<Empleado> ConsultarListaUsuarios(){
        return this.service.getListaUsuarios();
    }

    @PostMapping("/employees")
    public RedirectView createEmpleado(@ModelAttribute @DateTimeFormat(pattern = "YYYY-MM-DD") Empleado empleado, Model model){
        model.addAttribute(empleado);
        this.service.createEmployee(empleado);
        return new RedirectView("employeesV2");
    }

    @GetMapping("/employees/{id}")
    public List<Empleado> getUsuario(@PathVariable(value = "id") Long profileId){
        return this.service.getUsuario(profileId);
    }

    @DeleteMapping("/employees/{id}")
    public RedirectView deleteEmployees(@PathVariable(value = "id") Long profileId){
        this.service.deleteEmployees(profileId);
        return new RedirectView("/employeesV2");
    }

    @PatchMapping("/employees/{id}")
    public void patchProfile(@RequestBody Empleado empleado, @PathVariable(value = "id") Long employeesId){
        this.service.patchEmployees(empleado, employeesId);
    }

}
