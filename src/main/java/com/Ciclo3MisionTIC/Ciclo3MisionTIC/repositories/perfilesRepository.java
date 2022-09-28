package com.Ciclo3MisionTIC.Ciclo3MisionTIC.repositories;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface perfilesRepository extends JpaRepository<Profile, Long> {
    Profile findByEmail(String email);
}
