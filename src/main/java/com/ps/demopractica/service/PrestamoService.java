package com.ps.demopractica.service;


import com.ps.demopractica.model.Prestamo;
import com.ps.demopractica.repository.PrestamoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
@RequiredArgsConstructor
public class PrestamoService implements  IPrestamoService{

    private  final PrestamoRepository prestamoRepository;
    @Override
    public Prestamo createPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public void deletePrestamo(Long id) {
       prestamoRepository.deleteById(id);
    }

    @Override
    public List<Prestamo> findAllPrestamo(Long id) {
        return prestamoRepository.findAllClientById(id);
    }

    @Override
    public Prestamo updatePrestamo(Prestamo prestamo) {

        return prestamoRepository.save(prestamo);
    }

    @Override
    public List<Prestamo> allPrestamos() {
        return prestamoRepository.findAll();
    }
}
