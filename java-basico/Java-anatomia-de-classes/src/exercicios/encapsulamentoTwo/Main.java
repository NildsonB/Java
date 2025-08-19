package exercicios.encapsulamentoTwo;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static Atm atm = new Atm();

    public static void main(String[] args) {

        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Consultar cheque especial");
            System.out.println("4 - Depositar dinheiro");
            System.out.println("5 - Sacar dinheiro");
            System.out.println("6 - Pagar um boleto");
            System.out.println("7 - Verificar se a conta está usando cheque especial");
            System.out.println("8 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> createCount();
                case 2 -> verifyBalance();
                case 3 -> verifySpecialCheck();
                case 4 -> deposit();
                case 5 -> cashOut();
            }

        }while (true);
    }

    private static void createCount() {
        String titular = null;
        while (titular == null || titular.isEmpty()) {
            System.out.println("Insira o nome do titular da conta.");
            titular = scanner.next();
        }
        System.out.println("Insira o valor de depósito para abertura.");
        double valorAbertura = scanner.nextInt();
        var count = new Count(valorAbertura);
        System.out.println(titular + ", sua conta foi criada com sucesso!");
        double check = 0;
        if (valorAbertura > 500) {
            check = ((double) valorAbertura / 2);
        }
        atm.setSpecialCheck(check);
        atm.setCount(count);
    }

    private static void verifyBalance() {
        var balance = atm.balanceTotal();
        System.out.println("O saldo total da sua conta é de R$" + balance);
    }

    private static void verifySpecialCheck() {
        double verify = atm.getSpecialCheck();
        System.out.println("O valor de cheque especial liberado para sua conta é de R$" + verify);
    }

    private static void deposit() {
        System.out.println("Insira o valor de depósito.");
        double valueDeposit = scanner.nextDouble();
        var balance = atm.getCount();
        var countTotal = balance + valueDeposit;
        var count = new Count(countTotal);
        atm.setCount(count);
        System.out.println("Valor depositado com sucesso!");
    }

    private static void cashOut() {
        System.out.println("Insira o valor a ser sacado.");
        double valueCashOut = scanner.nextDouble();
        var balance = atm.getCount();
        var specialCheck = atm.getSpecialCheck();
        double countTotal = 0;
        if (balance > valueCashOut) {
            countTotal = balance - valueCashOut;
            var count = new Count(countTotal);
            atm.setCount(count);
            System.out.println("Valor sacado com sucesso!");
        }else if ((balance + specialCheck) > valueCashOut){
            countTotal = 0;
            var sCheck = (balance + specialCheck) - valueCashOut;
            var count = new Count(countTotal);
            atm.setSpecialCheck(sCheck);
            atm.setCount(count);
            System.out.println("Valor sacado com sucesso!");
        }else{
            System.out.println("Você não possui saldo suficiente para sacar o valor inserido.");
        }
    }



}
