package com.masini.Masini.mapper;

import com.masini.Masini.DTO.ProprietarDTO;
import com.masini.Masini.exceptions.ApiExceptionsResponse;
import com.masini.Masini.model.Proprietar;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProprietarMapper {

    public static List<ProprietarDTO> mapOwnerToDetails(List<Proprietar> owners) throws ApiExceptionsResponse {
        List<ProprietarDTO> dtos=new LinkedList<>();
        for(Proprietar owner:owners){
            if(owner.getId()==null){
                throw ApiExceptionsResponse.builder().status(HttpStatus.NOT_FOUND).message("No contact for owner: "+owner.getNume()).errors(Collections.singletonList("error.email.not_found")).build();
            }
            dtos.add(ProprietarDTO.builder().name(owner.getNume()).build());
        }
        return dtos;
    }
}
