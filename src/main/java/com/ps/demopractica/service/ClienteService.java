package com.ps.demopractica.service;


import com.ps.demopractica.model.Cliente;
import com.ps.demopractica.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ClienteService implements  IClienteService{

    private final   ClienteRepository clienteRepository;
    @Override
    public Cliente resgistrar(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente getClientById(Long id) {
        return clienteRepository.getReferenceById(id);
    }

    @Override
    public Cliente createClient(Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente createUpdateClient(Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteClient(Long id) {
        clienteRepository.deleteById(id);
    }
}
