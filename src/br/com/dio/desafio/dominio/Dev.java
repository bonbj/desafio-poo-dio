package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;

    private ArrayList<Mentoria> mentorias = new ArrayList<Mentoria>();
    private ArrayList<Curso> atividades = new ArrayList<Curso>();

    public void inscreverNoBootCamp(Bootcamp bootcamp) {
        ArrayList<Dev> devs = bootcamp.getDevs();
        devs.add(this);
        bootcamp.setDevs(devs);
        System.out.println("Inscrito do bootcamp: " + bootcamp.getNome());
    }

    public void progredir() {
        System.out.println("Avançar nos cursos");
    }

    public void calcularTotalXp(){
        int totalXP = 0;

        for (Mentoria mentoria : this.mentorias) {
            totalXP += mentoria.calcularXP();
        }
        for (Curso atividade : this.atividades) {
            totalXP += atividade.calcularXP();
        }

        System.out.println("Total XP: " + totalXP);
    }

    public void exibirCursos() {
        System.out.println("Aluno: " + this.nome + " está inscrito no(s) curso(s) abaixo");
        for (Mentoria mentoria : this.mentorias) {
            System.out.println(mentoria.name);
        }
        for (Curso atividade : this.atividades) {
            System.out.println(atividade.name);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(ArrayList<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public ArrayList<Curso> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<Curso> atividades) {
        this.atividades = atividades;
    }
}
