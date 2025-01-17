package academy.devdojo.array;

import java.util.Arrays;

public class PrincipioArray {
    public static void main(String[] args) {
        double[] notas = new double[4]; //definir o tamanho do array ao inicializar a variável
        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 3;
        notas[3] = 6;

//        System.out.println(notas[0]);
//        System.out.println(notas[1]);
//        System.out.println(notas[2]);
//        System.out.println(notas[3]);

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
