package Collections.DesafioDeProjeto.AbstraindoBootcamp;

import Collections.DesafioDeProjeto.AbstraindoBootcamp.Dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
