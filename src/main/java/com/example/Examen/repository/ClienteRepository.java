package com.example.Examen.repository;

import com.example.Examen.entity.Cliente;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Getter @Setter
public class ClienteRepository {
    private List<Cliente> listaCliente = new ArrayList<>();

    public Optional<Cliente> buscarCliente(String nombre){
        return listaCliente.stream().filter(cliente -> cliente.getNombre().equals(nombre)).findFirst();
    }

    public Optional<Cliente> buscarClienteDni(String dni){
        return listaCliente.stream().filter(cliente -> cliente.getDni().equals(dni)).findFirst();
    }
}
