import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());



        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devJoanira = new Dev();
        devJoanira.setNome("Joanira");
        devJoanira.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJoanira.getConteudosInscritos());
        devJoanira.progredir();
        devJoanira.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos" + devJoanira.getConteudosConcluidos());
        System.out.println("XP" + devJoanira.calcularTotalXp());

        System.out.println("----");

        Dev devMichel = new Dev();
        devMichel.setNome("Michel");
        devMichel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devMichel.getConteudosInscritos());
        devMichel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos" + devMichel.getConteudosConcluidos());
        System.out.println("XP" + devMichel.calcularTotalXp());



    }

}