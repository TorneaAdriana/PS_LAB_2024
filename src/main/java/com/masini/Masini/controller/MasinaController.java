package com.masini.Masini.controller;

import com.masini.Masini.exceptions.ApiExceptionsResponse;
import com.masini.Masini.service.MasinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/masina")
public class MasinaController {

    @Autowired
    private MasinaService masinaService;

    @GetMapping()
    public ResponseEntity findAllCars(){
        return ResponseEntity.status(HttpStatus.OK).body(masinaService.findAll());
    }

    @GetMapping("/{marca}")
    public ResponseEntity findMasinaByMarca(@PathVariable String marca) throws ApiExceptionsResponse {
        return ResponseEntity.status(HttpStatus.OK).body(masinaService.findByMarca(marca));
    }

    @GetMapping("/{id}/{marca}")
    public ResponseEntity findMasinaByIdAndMarca(@PathVariable Long id, @PathVariable String marca)   throws ApiExceptionsResponse {
        return ResponseEntity.status(HttpStatus.OK).body(masinaService.findFirstByIdAndMarca(id,marca));
    }

    @GetMapping("/find")
    public ResponseEntity findByMarcaReqParam(@RequestParam String marca)  throws ApiExceptionsResponse {
        return ResponseEntity.status(HttpStatus.OK).body(masinaService.findByMarca(marca));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteMasinaById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(masinaService.deleteCar(id));
    }

}
