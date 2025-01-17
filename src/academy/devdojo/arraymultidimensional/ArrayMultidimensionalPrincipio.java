package academy.devdojo.arraymultidimensional;

public class ArrayMultidimensionalPrincipio {
    public static void main(String[] args) {
        int[][] arrayDuasDimensoes = new int[2][2];
        arrayDuasDimensoes[0][0] = 22;
        arrayDuasDimensoes[0][1] = 11;
        arrayDuasDimensoes[1][0] = 44;
        arrayDuasDimensoes[1][1] = 55;

        System.out.println(arrayDuasDimensoes[0]); //quando se tenta imprimir assim mostra-se apenas a referência da memória
        System.out.println(arrayDuasDimensoes[0][0]);
    }
}
