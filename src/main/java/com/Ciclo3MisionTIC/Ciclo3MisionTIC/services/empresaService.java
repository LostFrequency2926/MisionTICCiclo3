package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Transaction;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.repositories.empresaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
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

    public Empresa createEnterprise(Empresa empresa){
        return this.repository.save(empresa);
    }

    public void deleteEnterprises(Long id_enterprise) {
        this.repository.deleteById(id_enterprise);
    }

    public void patchEnterprises(Empresa empresa, Long id_enterprise) {
        this.repository.deleteById(id_enterprise);
        this.repository.save(empresa);
    }

    public List<Empresa> getEnterprise(Long EnterpriseId){
        return this.repository.findAllById(Collections.singleton(EnterpriseId));
    }

}
