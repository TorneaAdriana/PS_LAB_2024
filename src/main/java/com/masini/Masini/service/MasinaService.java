package com.masini.Masini.service;

import com.masini.Masini.exceptions.ApiExceptionsResponse;
import com.masini.Masini.model.Masina;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface MasinaService {

    Masina findByMarca(String marca)  throws ApiExceptionsResponse;
    Masina updateMasina(Masina masina);
    List<Masina> findAll();
    Masina findById(Long id);
    Masina findFirstByIdAndMarca(Long id, String marca)  throws ApiExceptionsResponse;
    Masina deleteCar(Long id);

}
