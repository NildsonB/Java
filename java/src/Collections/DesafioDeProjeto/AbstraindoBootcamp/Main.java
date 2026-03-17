package Collections.DesafioDeProjeto.AbstraindoBootcamp;

import Collections.DesafioDeProjeto.AbstraindoBootcamp.Dominio.Bootcamp;
import Collections.DesafioDeProjeto.AbstraindoBootcamp.Dominio.Curso;
import Collections.DesafioDeProjeto.AbstraindoBootcamp.Dominio.Dev;
import Collections.DesafioDeProjeto.AbstraindoBootcamp.Dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Curos de Java");
        curso1.setCargaHoraria(10);

        curso2.setTitulo("PHP");
        curso2.setDescricao("Curos de PHP");
        curso2.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria sobre Java");
        mentoria1.setData(LocalDate.now());

        mentoria2.setTitulo("Mentoria de PHP");
        mentoria2.setDescricao("Mentoria sobre PHP");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcampjava = new Bootcamp();
        bootcampjava.setNome("Bootcamp Java");
        bootcampjava.setDescricao("Bootcamp sobre Java");
        bootcampjava.getConteudos().add(curso1);
        bootcampjava.getConteudos().add(curso2);
        bootcampjava.getConteudos().add(mentoria1);

        Dev devNildson = new Dev();
        devNildson.setNome("Nildson");
        devNildson.inscreverBootcamp(bootcampjava);
        System.out.println("Participante: " + devNildson.getNome());
        System.out.println("Conteúdos inscritos:" + devNildson.getConteudosInscritos());
        System.out.println("---");
        devNildson.progredir();
        System.out.println("Conteúdos inscritos:" + devNildson.getConteudosInscritos());
        System.out.println("Conteúdos concluídos:" + devNildson.getConteudosConcluidos());
        System.out.println("XP:" + devNildson.calcularTotalXp());

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+");

        Dev devIasmin = new Dev();
        devIasmin.setNome("Iasmin");
        devIasmin.inscreverBootcamp(bootcampjava);
        System.out.println("Participante: " + devIasmin.getNome());
        System.out.println("Conteúdos inscritos:" + devIasmin.getConteudosInscritos());
        System.out.println("---");
        devIasmin.progredir();
        devIasmin.progredir();
        System.out.println("Conteúdos inscritos:" + devIasmin.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devIasmin.getConteudosConcluidos());
        System.out.println("XP:" + devIasmin.calcularTotalXp());



    }
}
