package com.esm.apisimple.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_department")
public class Department {
    //atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //Construtor vazio para a classe poder se instanciada sem passar nenhum argumento
    public Department(){
    }

    /**
     * Getters and Setters(encapsulamento)
     *
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

