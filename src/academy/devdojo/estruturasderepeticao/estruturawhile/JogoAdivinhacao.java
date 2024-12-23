package academy.devdojo.estruturasderepeticao.estruturawhile;

/*Peça para o jogador um digitar um número, em seguida o jogador dois vai digitar outro número. O intuito é ver se o jogador dois conseguiu adivinhar qual o número que o
jogador um informou. Se sim, mostrar a mensagem "VOCÊ CONSEGUIU", caso não, mostrar a mensagem "NÚMERO INCORRETO. TENTAR NOVAMENTE?"*/

import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean desejaContinuar = false;

        do {
            System.out.print("JOGADOR 1 - Escolha um número aleatório: ");
            int numeroJogadorUm = scanner.nextInt();
            System.out.print("JOGADOR 2 - Tente adivinhar o número informado pelo jogador um: ");
            int numeroJogadorDois = scanner.nextInt();

            if (numeroJogadorUm != numeroJogadorDois){
                System.out.print("Número incorreto. Tentar novamente? (S/N) ");
                String tentativa = scanner.next();
                if (tentativa.equals("S")) {
                    desejaContinuar = true;
                } else if (tentativa.equals("N")) {
                    desejaContinuar = false;
                }
            } else {
                System.out.println("Você conseguiu!");
                desejaContinuar = false;
            }
        } while (desejaContinuar);
    }
}
