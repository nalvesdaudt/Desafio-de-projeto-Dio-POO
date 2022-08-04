import br.com.dio.desafio.dominio.Booltcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Booltcamp booltcamp = new Booltcamp();
        booltcamp.setNome("Bootcamp Java Developer");
        booltcamp.setDescricao("Descricao Bootcamp Java Developer");
        booltcamp.getConteudos().add(curso1);
        booltcamp.getConteudos().add(curso2);
        booltcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(booltcamp);
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("--------");

        Dev devJoana = new Dev();
        devJoana.setNome("Joana");
        devJoana.inscreverBootcamp(booltcamp);
        System.out.println("Conteudos Inscritos Joana" + devJoana.getConteudosInscritos());
        devJoana.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joana" + devJoana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joana" + devJoana.getConteudosConcluidos());
        System.out.println("XP:" + devJoana.calcularTotalXp());





    }
}
