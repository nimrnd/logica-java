package academy.devdojo.variaveis;/*
Dado um determinado salário, se o salário for maior que R$4500.00, imprima 30% do valor.
Se não, imprima 15% do valor.
Utilize apenas uma variável para guardar o resultado e imprimir no final.
*/

import java.util.Scanner;

public class PorcentagemDoSalarioFixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu salário: ");
        double salario = scanner.nextDouble();
        double porcentagem;
        double valorDaPorcentagemDoSalario;

        if (salario > 4500) {
            porcentagem = 30;
        } else {
            porcentagem = 15;
        }
        valorDaPorcentagemDoSalario = (porcentagem / 100) * salario;

        System.out.println("O valor final é R$ " + valorDaPorcentagemDoSalario + " da porcentagem de " + porcentagem + "%");
    }
}
