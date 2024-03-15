package com.masini.Masini.service;

import com.masini.Masini.model.Masina;
import org.springframework.stereotype.Component;


@Component
public interface MasinaService {

    Masina findByMarca(String marca);
    Masina updateMasina(Masina masina);
}
