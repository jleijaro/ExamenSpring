package com.example.Examen.entity;

import com.example.Examen.entity.ItemPrestamo;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Prestamo {
    private String fecha;
    private ItemPrestamo item;
    private String fechaDevolucion;
    private String estado;

    public Prestamo(String fecha, ItemPrestamo item, String fechaDevolucion) {
        this.fecha = fecha;
        this.item = item;
        this.fechaDevolucion = fechaDevolucion;
    }
}
