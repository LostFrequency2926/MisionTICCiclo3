package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.*;

public class movimientoService {
    MovimientoDinero movimiento1;
    MovimientoDinero movimiento2;
    listaMovimientos listadeMovimientos;

    public movimientoService(){

        this.movimiento1 = new MovimientoDinero(4000000, "cobro facturacion", "Daniel");
        this.movimiento2 = new MovimientoDinero(-1000000, "compra escritorio", "Felipe");

        this.listadeMovimientos = new listaMovimientos("Prueba de lista de movimientos");

        listadeMovimientos.addMovimiento(movimiento1);
        listadeMovimientos.addMovimiento(movimiento2);
    }

    public listaMovimientos getListadeMovimientos(){

        return this.listadeMovimientos;
    }
}
