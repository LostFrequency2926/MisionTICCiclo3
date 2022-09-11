package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.*;
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

    public Profile createProfile(Profile perfil){
        return this.repository.save(perfil);
    }

    public void deleteProfile(Long id_profile) {
        this.repository.deleteById(id_profile);
    }

    public void patchProfile(Profile profile,Long id_profile) {
        this.repository.deleteById(id_profile);
        this.repository.save(profile);
    }

}
