package com.ps.demopractica.service;

import com.ps.demopractica.model.Cliente;

public interface IClienteService {

    public Cliente resgistrar(Cliente cliente);

    Cliente getClientById(Long id);

    Cliente createClient(Cliente cliente);

    Cliente createUpdateClient(Cliente cliente);

    void deleteClient(Long id);
}
