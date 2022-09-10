package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.*;

import java.time.LocalDate;

public class movimientoService {
    MovimientoDinero movimiento1;
    MovimientoDinero movimiento2;
    listaMovimientos listadeMovimientos;

    public movimientoService(){

        this.movimiento1 = new MovimientoDinero(1,"compra sillas",2000000, "Daniel", "AndesBPO", LocalDate.now(),LocalDate.now());
        this.movimiento2 = new MovimientoDinero(1,"compra sillas",2000000, "Daniel", "AndesBPO", LocalDate.now(),LocalDate.now());

        this.listadeMovimientos = new listaMovimientos("Prueba de lista de movimientos");

        listadeMovimientos.addMovimiento(movimiento1);
        listadeMovimientos.addMovimiento(movimiento2);
    }

    public listaMovimientos getListadeMovimientos(){

        return this.listadeMovimientos;
    }
}
