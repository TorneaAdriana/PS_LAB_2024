package com.masini.Masini.service.impl;

import com.masini.Masini.model.Masina;
import com.masini.Masini.repository.MasinaRepository;
import com.masini.Masini.service.MasinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public List<Masina> findAll() {
        List<Masina> masinaList = (List<Masina>) masinaRepository.findAll();
        return masinaList;
    }

    @Override
    public Masina findById(Long id)  {
        return masinaRepository.findById(id).get();
    }

    @Override
    public Masina findFirstByIdAndMarca(Long id, String marca) {
        return masinaRepository.findFirstByIdAndMarca(id, marca);
    }

    @Override
    public Masina deleteCar(Long id) {
        Masina masina = masinaRepository.findById(id).get();
        masinaRepository.delete(masina);

        return masina;
    }
}
