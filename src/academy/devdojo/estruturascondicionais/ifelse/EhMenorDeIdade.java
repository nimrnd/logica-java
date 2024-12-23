package academy.devdojo.estruturascondicionais.ifelse;

/*
Receba uma idade como entrada
Se idade for maior que 18 imprima "Maior de idade"
Se idade for menor que 18 imprima "Menor de idade"
*/

import java.util.Scanner;

public class EhMenorDeIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
