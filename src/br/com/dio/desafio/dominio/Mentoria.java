package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    public Mentoria(String name, int xp, String descricao) {
        this.name = name;
        this.xp = xp;
        this.descricao = descricao;
        this.modulos = 1;
    }

    private String titulo;
    private LocalDate dataDaMentoria;
    private int carcaHoraria;

    public int calcularXP(){
        return this.xp * this.carcaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataDaMentoria() {
        return dataDaMentoria;
    }

    public void setDataDaMentoria(LocalDate dataDaMentoria) {
        this.dataDaMentoria = dataDaMentoria;
    }
}
