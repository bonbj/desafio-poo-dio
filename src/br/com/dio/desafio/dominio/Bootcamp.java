package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
     private LocalDate dataInicial;
     private LocalDate dataFinal;
     private String nome;
     private String descricao;
     private ArrayList<Mentoria> mentorias = new ArrayList<Mentoria>();
     private ArrayList<Dev> devs = new ArrayList<Dev>();
     private ArrayList<Curso> atividadesCursos = new ArrayList<Curso>();

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(ArrayList<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public ArrayList<Dev> getDevs() {
        return devs;
    }

    public void setDevs(ArrayList<Dev> devs) {
        this.devs = devs;
    }

    public ArrayList<Curso> getAtividadesCursos() {
        return atividadesCursos;
    }

    public void setAtividadesCursos(ArrayList<Curso> atividadesCursos) {
        this.atividadesCursos = atividadesCursos;
    }
}
