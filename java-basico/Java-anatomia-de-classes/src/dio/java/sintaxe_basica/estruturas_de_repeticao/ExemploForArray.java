package dio.java.sintaxe_basica.estruturas_de_repeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Jonas", "Juliana", "Marcos"};

        
        //For com Arrays
        /*
        for (int x = 0; x < alunos.length; x ++){
          System.out.println("O aluno no indice " + x + " é " + alunos[x]);   
        }
        */

        //Exemplo de For Each
        for(String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
