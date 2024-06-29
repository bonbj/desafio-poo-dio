package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    public Curso(String descricao, int modulos, String name, int xp) {
        this.descricao = descricao;
        this.modulos = modulos;
        this.name = name;
        this.xp = xp;
    }

    private String Titulo;
    private int cargaHoraria;

    public int calcularXP(int cargaHoraria) {
        return this.xp * (cargaHoraria | this.cargaHoraria) * this.modulos;
    }

    public int calcularXP() {
        return this.xp * this.cargaHoraria * this.modulos;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
