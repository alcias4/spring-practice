package com.ps.demopractica.service;

import com.ps.demopractica.model.Prestamo;

import java.util.List;
import java.util.Optional;

public interface IPrestamoService {
    Prestamo createPrestamo(Prestamo prestamo);

    void deletePrestamo(Long id);

    List<Prestamo> findAllPrestamo(Long id);

    Prestamo updatePrestamo(Prestamo prestamo);

    List<Prestamo> allPrestamos();
}
