package com.Ciclo3MisionTIC.Ciclo3MisionTIC.repositories;

import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movimientosRepository extends JpaRepository<Transaction, Long> {
}
