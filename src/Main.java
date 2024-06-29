import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso cursoJS = new Curso(
                "JavaScript tem suas dificuldades, porem vendo bem de perto percebe que ele não é tão complicado assim",
                3,
                "JavaScript ao pé da letra",
                80);
        cursoJS.setCargaHoraria(50);

        Curso cursoCSS = new Curso(
                "Diplay flex nunca foi tão fácil com esse curso",
                1,
                "CSS desmistificando display flex",
                20);
        cursoCSS.setCargaHoraria(80);

        Curso cursoHTML = new Curso(
                "HTML5 com suas tags semânticas",
                5,
                "HTML5 semântico",
                100);
        cursoHTML.setCargaHoraria(20);

        Mentoria mentoriaComJoao = new Mentoria(
                "Mentoria de front end",
                37,
                "Mentoria completa com o professor João ensinando o que tem de melhor no front end, fazendo uma página de compras"
        );

        Dev devJoao = new Dev();
        devJoao.setNome("João victor");

        ArrayList<Curso> cursosJoao = new ArrayList<Curso>();
        cursosJoao.add(cursoJS);
        cursosJoao.add(cursoCSS);
        cursosJoao.add(cursoHTML);
        devJoao.setAtividades(cursosJoao);

        ArrayList<Mentoria> mentoriasJoao = new ArrayList<Mentoria>();
        mentoriasJoao.add(mentoriaComJoao);
        devJoao.setMentorias(mentoriasJoao);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp de front end completo: do 0 até publicar um site");
        bootcamp1.setDescricao("Nesse bootcamp você será responsável para fazer um site completo de compras usando o que temos de melhor no mercado para front end");
        bootcamp1.setDataInicial(LocalDate.of(2024, 6, 29));
        bootcamp1.setDataFinal(LocalDate.of(2024, 7, 14));

        ArrayList<Curso> cursosBootcamp1 = new ArrayList<Curso>();
        cursosBootcamp1.add(cursoJS);
        cursosBootcamp1.add(cursoCSS);
        cursosBootcamp1.add(cursoHTML);
        bootcamp1.setAtividadesCursos(cursosBootcamp1);

        ArrayList<Mentoria> mentoriasBootcamp1 = new ArrayList<Mentoria>();
        mentoriasBootcamp1.add(mentoriaComJoao);
        bootcamp1.setMentorias(mentoriasBootcamp1);

        devJoao.inscreverNoBootCamp(bootcamp1);

        ArrayList<Dev> devs = new ArrayList<Dev>();
        devs.add(devJoao);
        bootcamp1.setDevs(devs);

        devJoao.calcularTotalXp();
        devJoao.exibirCursos();
        devJoao.progredir();
    }
}
