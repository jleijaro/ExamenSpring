package com.example.Examen.entity;

public class Libro extends ItemPrestamo{

    public int getDiasDevolicuon() {
        return 0;
    }

    public Libro(int codigo, String nombre) {
        super(codigo, nombre);
    }
}
