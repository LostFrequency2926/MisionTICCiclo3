package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.*;
import java.time.LocalDate;

public class movimientoService {
    Transaction movimiento1;
    Transaction movimiento2;
    listaMovimientos listadeMovimientos;

    public movimientoService(){

        this.movimiento1 = new Transaction(1, "mail", 100, "nan", "Andes", LocalDate.now(),LocalDate.now() );
        this.movimiento2 = new Transaction(1, "mail", 100, "nan", "Andes", LocalDate.now(),LocalDate.now() );

        this.listadeMovimientos = new listaMovimientos("Prueba de lista de movimientos");

        listadeMovimientos.addMovimiento(movimiento1);
        listadeMovimientos.addMovimiento(movimiento2);
    }

    public listaMovimientos getListadeMovimientos(){

        return this.listadeMovimientos;
    }
}
