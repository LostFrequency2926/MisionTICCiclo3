package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaEmpresas;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.repositories.empresaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class empresaService {

    private empresaRepository repository;

    public empresaService(empresaRepository repository){
        this.repository = repository;
    }

    public List<Empresa> getListaEmpresas(){
        return this.repository.findAll();
    }
}
