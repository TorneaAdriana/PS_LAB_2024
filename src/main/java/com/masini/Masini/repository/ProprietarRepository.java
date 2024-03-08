package com.masini.Masini.repository;

import com.masini.Masini.model.Proprietar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarRepository extends CrudRepository<Proprietar, Long> {
}
