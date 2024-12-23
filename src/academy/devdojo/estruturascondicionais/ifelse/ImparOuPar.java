package academy.devdojo.estruturascondicionais.ifelse;

/*
Dado um determinado número inteiro defina se ele é ímpar ou par.
*/

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para descobrir se ele é ímpar ou par: ");
        int numeroImparOuPar = scanner.nextInt();
        String resultado;

        if (numeroImparOuPar % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        System.out.println("O número informado é " + resultado);
    }
}
