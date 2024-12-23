package academy.devdojo.estruturascondicionais.switchcase;

/*
Receba um número inteiro do usuário e imprima o dia da semana correspondente.
*/

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe em número (de 1 até 7) para saber seu correspondente em dias da semana: ");
        int dia = scanner.nextInt();


/*     - Permite condições personalizadas para cada caso (when).
       - Se precisar de lógica adicional em cada caso, como validações ou condições especiais.

        String diaDaSemanaCorrespondenteAlternativo = switch (dia) {
            case int d when d == 1 -> "Domingo";
            case int d when d == 2 -> "Segunda-feira";
            case int d when d == 3 -> "Terca-feira";
            case int d when d == 4 -> "Quarta-feira";
            case int d when d == 5 -> "Quinta-feira";
            case int d when d == 6 -> "Sexta-feira";
            case int d when d == 7 -> "Sábado";
            default -> throw new IllegalStateException("Valor não esperado: " + dia);
        };*/

        String diaDaSemanaCorrespondente = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Dia inválido";
        };

        System.out.println("O dia correspondente é " + diaDaSemanaCorrespondente + ".");
    }
}
