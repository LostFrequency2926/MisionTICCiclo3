package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.*;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.repositories.perfilesRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class perfilesService {

    private perfilesRepository repository;

    public perfilesService(perfilesRepository repository) {
        this.repository = repository;
    }

    public List<Profile> getListaPerfiles() {
        return this.repository.findAll();
    }



    public boolean deleteProfile(Long id_profile) {
        this.repository.deleteById(id_profile);
        return true;
    }

    public void patchProfile(Long id_profile) {
        Optional<Profile> profile = this.repository.findById(id_profile);
        if (profile.isPresent()) {
            this.repository.save(profile.get());
        }
    }

    public Profile createProfile(Profile perfil) {
        return this.repository.save(perfil);
    }

    public Profile findProfileByEmail(String email){
        return this.repository.findByEmail(email);
    }

    public Profile getOrCreateProfile(Map<String, Object> userData){
        String email = (String) userData.get("email");
        Profile perfil = findProfileByEmail(email);

        if(perfil == null) {
            String name = (String) userData.get("nickname");
            String image = (String) userData.get("picture");
            String Aut0Id = (String) userData.get("sub");
            LocalDate updated_at = LocalDate.from(LocalDateTime.now());
            LocalDate created_at = LocalDate.from(LocalDateTime.now());
            Profile newPerfil = new Profile(image, name, email, created_at, updated_at, Aut0Id, false);
            return createProfile(newPerfil);
        }

        return perfil;
    }

}