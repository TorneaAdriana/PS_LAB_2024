package com.masini.Masini.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Masina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String marca;

    @ManyToOne
    private Proprietar proprietar;
}
