package com.universidade.sistemauniversitario.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String endereco;

    @Column(unique = true, nullable = false)

    private String matricula;
    private LocalDate dataIngresso;

    @ManyToMany
    @JoinTable(name = "aluno_materias", joinColumns = @JoinColumn(name = "aluno_id"), inverseJoinColumns = @JoinColumn(name = "materia_id"))

    private List<Materia> materias = new ArrayList<>();

    public Aluno() {

    }

    public Aluno(Long id, String nome, String endereco, String matricula, LocalDate dataIngresso) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
        this.dataIngresso = dataIngresso;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
 }
