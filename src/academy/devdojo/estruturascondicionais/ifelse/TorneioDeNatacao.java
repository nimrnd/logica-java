package academy.devdojo.estruturascondicionais.ifelse;

/*
Eu, como usuário, gostaria de ter o nome e a idade de participantes de um torneio de natação e que o sistema imprimisse da seguinte forma:
Menor que 10 anos: <Nome> participará da categoria Infantil
Entre 11 e 15 anos: <Nome> participará da categoria Juvenil
Entre 16 e 19 anos: <Nome> participará da categoria Pré-Adulto
Acima de 20 anos: <Nome> participará da categoria Adulto
Para que eu possa rapidamente classificar todos os participantes.
*/

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        String categoria;

        if (idade <= 10) {
            categoria = "Infantil";
        } else if (idade <= 15) {
            categoria = "Juvenil";
        } else if (idade <= 19) {
            categoria = "Pré-adulto";
        } else {
            categoria = "Adulto";
        }

        System.out.println("O aluno(a) " + nome + " participará da categoria " + categoria);
    }
}
