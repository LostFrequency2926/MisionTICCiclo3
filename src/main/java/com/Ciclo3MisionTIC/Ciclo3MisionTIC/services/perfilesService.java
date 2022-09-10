package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empleado;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaUsuarios;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaPerfiles;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.repositories.perfilesRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class perfilesService {

    private perfilesRepository repository;

    public perfilesService(perfilesRepository repository){
        this.repository = repository;
    }

    public List<Profile> getListaPerfiles(){
        return this.repository.findAll();
    }

}
