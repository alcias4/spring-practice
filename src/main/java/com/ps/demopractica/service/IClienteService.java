package com.ps.demopractica.service;

import com.ps.demopractica.model.Cliente;

import java.util.List;

public interface IClienteService {

    public Cliente resgistrar(Cliente cliente);

    Cliente getClientById(Long id);

    Cliente createClient(Cliente cliente);

    Cliente createUpdateClient(Cliente cliente);

    void deleteClient(Long id);

    List<Cliente> getClientByName(String nombre);
}
