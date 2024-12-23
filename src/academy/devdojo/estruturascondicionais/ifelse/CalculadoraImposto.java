package academy.devdojo.estruturascondicionais.ifelse;

/*
    Utilizando Switch-Case ficaria:

        String resultado = switch (baseDeCalculo) {
            case double v when v < 2259.20 -> "Isento";
            case double v when v >= 2259.21 && v < 2826.65 -> "Alíquota de 7.5%";
            case double v when v >= 2826.66 && v < 3751.05 -> "Alíquota de 15%";
            case double v when v >= 3751.05 && v < 4664.68 -> "Alíquota de 22.5%";
            default -> "Aliquota de 27.5%";
*/

import java.util.Scanner;

public class CalculadoraImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base de cálculo (R$): ");
        double baseDeCalculo = scanner.nextDouble();
        String resultado;

        if (baseDeCalculo <= 2259.20) {
            resultado = "Isento";
        } else if (baseDeCalculo >= 2259.21 && baseDeCalculo <= 2826.65) {
            resultado = "Alíquota de 7.5%";
        } else if (baseDeCalculo >= 2826.66 && baseDeCalculo <= 3751.05) {
            resultado = "Alíquota de 15%";
        } else if (baseDeCalculo >= 3751.05 && baseDeCalculo <= 4664.68) {
            resultado = "Alíquota de 22.5%";
        } else {
            resultado = "Aliquota de 27.5%";
        }

        System.out.println("Sua alíquota do imposto de renda será de " + resultado);
    }
}
