package com.ps.demopractica.controller;



import com.ps.demopractica.model.Cliente;
import com.ps.demopractica.service.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // decir que esta clase es administrida o controlada por spring
@RequestMapping("/clientes") // agregar una ruta
public class ClientController {

    @Autowired
    private IClienteService iClienteService;

    @GetMapping()
    public ResponseEntity<List<Cliente>> getClientByName(@RequestParam String nombre){
        List<Cliente> cliente = iClienteService.getClientByName(nombre);
        return  ResponseEntity.ok(cliente);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClientById(@PathVariable Long id){
        Cliente cliente = iClienteService.getClientById(id);
        return  ResponseEntity.ok(cliente);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public  ResponseEntity<Cliente> createClient(@RequestBody Cliente cliente){
        Cliente createClient = iClienteService.createClient(cliente);
        return  new ResponseEntity<>(createClient , HttpStatus.CREATED);
    }


    @PutMapping
    public ResponseEntity<Cliente> updateClient(@RequestBody Cliente cliente){
        Cliente updateClient = iClienteService.createUpdateClient(cliente);
        return  ResponseEntity.ok(updateClient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id){
        iClienteService.deleteClient(id);
        return  ResponseEntity.noContent().build();
    }
}
