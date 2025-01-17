package academy.devdojo.arraymultidimensional;

public class CalculoMatrizDiagonal {
    public static void main(String[] args) {
        int[][] matrizQuadrada = new int[3][3];
        int multiplicacao = 1;

        matrizQuadrada[0][0] = 22;
        matrizQuadrada[0][1] = 11;
        matrizQuadrada[0][2] = 4;
        matrizQuadrada[1][0] = 44;
        matrizQuadrada[1][1] = 55;
        matrizQuadrada[1][2] = 9;
        matrizQuadrada[2][0] = 2;
        matrizQuadrada[2][1] = 5;
        matrizQuadrada[2][2] = 21;

        for (int i = 0; i < matrizQuadrada.length; i++) {
           for (int j = 0; j < matrizQuadrada[i].length; j++){

               if (i == j) {
                   multiplicacao *= matrizQuadrada[i][j];
               }
           }
        }

        System.out.println(multiplicacao);
    }
}
