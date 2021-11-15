package com.example.Examen.entity;

public class CD extends  ItemPrestamo{

    public int getDiasDevolucion(){
        return 0;
    }

    public CD(int codigo, String nombre) {
        super(codigo, nombre);
    }
}
