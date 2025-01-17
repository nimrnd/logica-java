package academy.devdojo.array;

import java.util.Scanner;

public class InserirValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe sua nota " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
            media += notas[i];
        }

//        for (int i = 0; i < notas.length; i++) {
//            media += notas[i];
//            System.out.println("Nota " + (i+1) + ": " + notas[i]);
//        }

        System.out.println("Sua média final é " + (media/notas.length));
    }
}
