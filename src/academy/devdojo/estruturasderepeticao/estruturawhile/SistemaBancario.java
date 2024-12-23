package academy.devdojo.estruturasderepeticao.estruturawhile;

/*
Como usuário eu gostaria de ter um menu visual que seja navegável através de números. O menu deve ser exibido da seguinte forma:

1 - CALCULAR IMPOSTO
2 - DEPOSITAR SALÁRIO
3 - SAIR

O menu deve ficar disponível enquanto eu não digitar o número 3. Dessa forma, o sistema ficará em execução evitando ter que ser reiniciado a cada operação.
 */

import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        double valorConta = 0;

        exibirMenu();
        opcao = scanner.nextInt();

        while (opcao != 3) {
            if (opcao == 1) {
                System.out.print("Informe a base de cálculo (R$): ");
                double baseDeCalculo = scanner.nextDouble();

                String resultado = switch (baseDeCalculo) {
                    case double c when c <= 2259.20 -> "Isento";
                    case double c when c <= 2826.65 -> "Alíquota de 7.5%";
                    case double c when c <= 3751.05 -> "Alíquota de 15%";
                    case double c when c <= 4664.68 -> "Alíquota de 22.5%";
                    default -> "Aliquota de 27.5%";
                };

                System.out.println("Sua alíquota do imposto de renda será de " + resultado);
            } else if (opcao == 2) {
                System.out.print("Informe o valor que deseja depositar (R$): ");
                double valorDeposito = scanner.nextDouble();
                valorConta = valorConta + valorDeposito;
                System.out.println("O valor depositado foi de R$" + valorDeposito + " e o valor total na conta é de R$" + valorConta);
            }

            exibirMenu();
            opcao = scanner.nextInt();
        }

        System.out.println("Sistema encerrado.");
    }

    private static void exibirMenu() {
        System.out.println("-------------------------");
        System.out.println("          MENU           ");
        System.out.println("1 - CALCULAR IMPOSTO");
        System.out.println("2 - DEPOSITAR SALÁRIO");
        System.out.println("3 - SAIR");
        System.out.println("-------------------------");
        System.out.print("Digite a opção desejada: ");
    }
}
