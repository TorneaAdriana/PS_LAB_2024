package com.masini.Masini.repository;

import com.masini.Masini.model.Masina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasinaRepository extends CrudRepository<Masina, Long> {

    Masina findFirstByMarca(String marca);
}
