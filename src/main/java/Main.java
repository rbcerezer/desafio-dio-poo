import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("DescriçãoCurso Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Kotlin");
        curso2.setDescricao("DescriçãoCurso Kotlin");
        curso2.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Orientação a Objetos");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição do BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devRafael.getConteudosInscritos());
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devRafael.getConteudosConcluidos());
        System.out.println("XP" + devRafael.calcularTotalXp());

        System.out.println("-----------");

        Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devDiego.getConteudosInscritos());
        devDiego.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devDiego.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devDiego.getConteudosConcluidos());
        System.out.println("XP" + devDiego.calcularTotalXp());



    }
}
