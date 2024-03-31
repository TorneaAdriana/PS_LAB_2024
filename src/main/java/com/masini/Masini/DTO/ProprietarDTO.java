package com.masini.Masini.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ProprietarDTO {

    private String name;
    private String street;
    private String email;

}
