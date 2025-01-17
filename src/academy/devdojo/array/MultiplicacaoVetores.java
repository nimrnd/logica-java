package academy.devdojo.array;

/*Armazenar em dois vetores V1 e V2 nove valores numéricos inteiros e exibir o resultado da multiplicação dos números do V1 com os correspondentes em V2.*/

import java.util.Scanner;

public class MultiplicacaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[9];
        int[] v2 = new int[9];
        int[] vr = new int[9];

        for (int i = 0; i < v1.length; i++) {
            System.out.print("Informe nove valores para o primeiro vetor: ");
            v1[i] = scanner.nextInt();
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.print("Informe nove valores para o segundo vetor: ");
            v2[i] = scanner.nextInt();
        }

        for (int i = 0; i < vr.length; i++) {
            vr[i] = v1[i] * v2[i];
            System.out.print(vr[i] + " ");
        }
    }
}
