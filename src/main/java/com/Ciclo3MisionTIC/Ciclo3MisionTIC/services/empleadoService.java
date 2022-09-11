package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empleado;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaUsuarios;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.repositories.empleadoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class empleadoService {

    private empleadoRepository repository;

    public empleadoService(empleadoRepository repository){
        this.repository = repository;
    }

    public List<Empleado> getListaUsuarios(){
        return this.repository.findAll();
    }

    public List<Empleado> getUsuario(Long idUser){
        return this.repository.findAllById(Collections.singleton(idUser));
    }

    public Empleado createEmployee(Empleado empleado){
        return this.repository.save(empleado);
    }

    public void deleteEmployees(Long id_Employee) {
        this.repository.deleteById(id_Employee);
    }

    public void patchEmployees(Empleado empleado, Long id_Employee) {
        this.repository.deleteById(id_Employee);
        this.repository.save(empleado);
    }

}