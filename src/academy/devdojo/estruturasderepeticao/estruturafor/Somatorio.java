package academy.devdojo.estruturasderepeticao.estruturafor;

/*Elaborar um programa que apresente o somatório dos números na faixa de 1 até 500.*/

public class Somatorio {
    public static void main(String[] args) {
        int soma = 0;

        for(int i = 1; i <= 500; i++) {
            soma += i;
        }
        System.out.println(soma);

    }
}
