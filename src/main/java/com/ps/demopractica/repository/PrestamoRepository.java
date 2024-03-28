package com.ps.demopractica.repository;

import com.ps.demopractica.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrestamoRepository extends JpaRepository<Prestamo,Long> {
    @Query("SELECT p FROM Prestamo p WHERE p.cliente.id = ?1")
    List<Prestamo> findAllClientById(Long id);
}
