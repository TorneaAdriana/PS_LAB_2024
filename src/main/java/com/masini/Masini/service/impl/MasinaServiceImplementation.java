package com.masini.Masini.service.impl;

import com.masini.Masini.model.Masina;
import com.masini.Masini.repository.MasinaRepository;
import com.masini.Masini.service.MasinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MasinaServiceImplementation implements MasinaService {

    @Autowired
    private MasinaRepository masinaRepository;

    @Override
    public Masina findByMarca(String marca) {
        return masinaRepository.findFirstByMarca(marca);
    }

    @Override
    public Masina updateMasina(Masina masina) {
        Optional<Masina> existingCar = masinaRepository.findById(masina.getId());
        if (existingCar.isPresent()) {
            existingCar.get().setProprietar(masina.getProprietar());
        }
        masinaRepository.save(existingCar.get());

        return existingCar.get();
    }
}
