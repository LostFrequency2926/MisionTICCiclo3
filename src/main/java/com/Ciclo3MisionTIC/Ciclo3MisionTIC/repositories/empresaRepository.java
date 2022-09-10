package com.Ciclo3MisionTIC.Ciclo3MisionTIC.repositories;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empresaRepository extends JpaRepository<Empresa, Long> {
}
