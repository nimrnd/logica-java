package academy.devdojo.arraymultidimensional;

import java.util.Scanner;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][3];
        Scanner scanner = new Scanner(System.in);

//        arrayMulti[0][0] = 22;
//        arrayMulti[0][1] = 11;
//        arrayMulti[0][2] = 54;
//        arrayMulti[1][0] = 44;
//        arrayMulti[1][1] = 56;
//        arrayMulti[1][2] = 76;

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.print("Digite o valor da posição ["+i+"]["+j+"] = ");
                arrayMulti[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arrayMulti.length; i++) { //Para percorrer a base [2]
            for (int j = 0; j < arrayMulti[i].length; j++) { //Para percorrer os elementos da base[3]
                System.out.println("["+i+"]["+j+"] = " +arrayMulti[i][j]);
            }
        }
    }
}


//int[][] arrayMulti = new int[2][3];
//Aqui, arrayMulti é um array de 2 linhas, onde cada linha contém um array de 3 colunas. Então, temos:
//Linha 0: [22, 11, 54]
//Linha 1: [44, 56, 76]
//
//for (int i = 0; i < arrayMulti.length; i++) {
//arrayMulti.length retorna 2, pois o array tem duas linhas.
//Esse loop itera sobre as linhas.
//
//for (int j = 0; j < arrayMulti[i].length; j++) {
//arrayMulti[i] representa uma linha do array.
//        arrayMulti[i].length retorna 3, pois cada linha tem três colunas.
//Esse loop itera sobre as colunas dentro da linha atual.
//
//Sendo assim:
//arrayMulti[0]:  [22, 11, 54]
//arrayMulti[1]:  [44, 56, 76]
//O motivo de usarmos arrayMulti[i].length é que cada linha do array é um array separado. Então, isso permite que cada linha possa ter um tamanho diferente,
//tornando o código mais flexível para arrays de tamanhos irregulares (arrays "jagged").