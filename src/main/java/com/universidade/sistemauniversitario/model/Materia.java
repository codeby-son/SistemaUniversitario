package com.universidade.sistemauniversitario.model;

import jakarta.persistence.*;

@Entity
class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;

    @Column(unique = true, nullable = false)

    private String codigo;

    @Column(nullable = false)
    private String ementa;
    private Integer cargaHoraria;

    public Materia() {

    }

    public Materia(Long id, String nome, String codigo, String ementa, Integer cargaHoraria) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
