package Collections.Set.Exercicios.Ex002;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
        Set<LinguagemFavorita> linguagem = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
            add(new LinguagemFavorita("SQL", 1970, "MySql"));
            add(new LinguagemFavorita("PHP", 1994, "PhpStorm"));
        }};

        System.out.println("A - Ordem de inserção:");
        linguagem.forEach(System.out::println);

        System.out.println("B - Ordem natural(nome):");
        Set<LinguagemFavorita> linguagem1 = new TreeSet<>(linguagem);
        linguagem1.forEach(System.out::println);

        System.out.println("C - IDE:");
        Set<LinguagemFavorita> linguagem2 = new TreeSet<>(new CompareIde());
        linguagem2.addAll(linguagem);
        linguagem2.forEach(System.out::println);

        System.out.println("D - Ano de criação e nome");
        Set<LinguagemFavorita> linguagem3 = new TreeSet<>(new CompareAnoNome());
        linguagem3.addAll(linguagem);
        linguagem3.forEach(System.out::println);

        System.out.println("E - Nome, ano de criação e IDE:");
        Set<LinguagemFavorita> linguagem4 = new TreeSet<>(new CompareNomeAnoIde());
        linguagem4.addAll(linguagem);
        linguagem4.forEach(System.out::println);

    }

    static class CompareIde implements Comparator<LinguagemFavorita> {

        @Override
        public int compare(LinguagemFavorita a1, LinguagemFavorita a2) {
            return a1.getIde().compareTo(a2.getIde());
        }
    }

    static class CompareAnoNome implements Comparator<LinguagemFavorita> {

        @Override
        public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

            int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
            if (ano != 0) return ano;

            int nome = l1.getNome().compareTo(l2.getNome());
            return nome;

        }
    }

    static class CompareNomeAnoIde implements Comparator<LinguagemFavorita> {

        @Override
        public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
            int nome = l1.getNome().compareTo(l2.getNome());
            if (nome != 0) return nome;

            int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
            if (ano != 0) return ano;

            int ide = l1.getIde().compareTo(l2.getIde());
            return ide;
        }
    }
}
