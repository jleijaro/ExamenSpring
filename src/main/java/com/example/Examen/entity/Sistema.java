package com.example.Examen.entity;

import com.example.Examen.entity.Cliente;
import com.example.Examen.entity.ItemPrestamo;
import com.example.Examen.entity.Prestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Vector;

public class Sistema {

    @Autowired
    /*private Vector prestamos;
    private Vector clientes;
    private Vector items;*/
    private List<Prestamo> prestamos;
    private List<Cliente> clientes;
    private List<ItemPrestamo> item;
}
