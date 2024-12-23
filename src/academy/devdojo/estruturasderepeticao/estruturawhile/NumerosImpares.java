package academy.devdojo.estruturasderepeticao.estruturawhile;

/*Eu como usuário gostaria de imprimir todos os números ímpares de zero até o valor informado na entrada.*/

import java.util.Scanner;

public class NumerosImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor desejado: ");
        int valor = scanner.nextInt();
        int i = 0;

        while (i <= valor) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i += 1;
        }
    }
}
