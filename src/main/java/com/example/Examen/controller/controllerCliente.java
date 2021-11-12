package com.example.Examen.controller;

import com.example.Examen.entity.Cliente;
import com.example.Examen.repository.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class controllerCliente {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<Cliente> getCliente(){
        return clienteRepository.getListaCliente();
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<Cliente> getCliente(@PathVariable String nombre) throws ClienteInexistenteException {
        Optional<Cliente> optionalCliente = clienteRepository.buscarCliente(nombre);
        if (optionalCliente.isEmpty()){
            throw new ClienteInexistenteException();
        }
        return ResponseEntity.ok(optionalCliente.get());
    }

   @PostMapping
    public void crearCliente(@RequestBody Cliente clientes){
        Cliente cliente = modelMapper.map(clientes, Cliente.class);
        clienteRepository.getListaCliente().add(cliente);
    }

    @DeleteMapping
    public void eliminarCliente(String cliente){
        Optional<Cliente> optionalCliente = clienteRepository.buscarCliente(cliente);
        optionalCliente.ifPresent(value -> clienteRepository.getListaCliente().remove(value));
    }

    @PutMapping
    public  void modificarCliente(Cliente cliente){
        eliminarCliente(cliente.getNombre());
        clienteRepository.getListaCliente().add(cliente);
    }
}
