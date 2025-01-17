package academy.devdojo.array;

import java.util.Scanner;

public class MultiplicacaoVetoresSimplificado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[9];
        int[] v2 = new int[9];
        int[] vr = new int[9];
        String resultadoMultiplicacao = "";

        for (int i = 0; i < vr.length; i++) {
            System.out.print("Infome nove números para o primeiro vetor: ");
            v1[i] = scanner.nextInt();
            System.out.print("Informe nove números para o segundo vetor: ");
            v2[i] = scanner.nextInt();
            vr[i] = v1[i] * v2[i];
            resultadoMultiplicacao += " " + vr[i];
        }

        System.out.println(resultadoMultiplicacao);
    }
}
