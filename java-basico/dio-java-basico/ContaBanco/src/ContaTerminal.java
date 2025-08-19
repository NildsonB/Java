import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criação do objeto scanner para entrada de dados
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu primeiro nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor digite o numero da agência bancária");
        String agencia = scanner.next();

        System.out.println("Insira o nomero da sua conta bancária");
        int conta = scanner.nextInt();

        System.out.println("Por favor, insira o saldo da conta");
        double saldo = scanner.nextDouble();


        //Criação da saída de dados com quebra de linha para melhor visualização do código
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado pro criar um conta em nosso banco," + 
            " sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
