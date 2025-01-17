package academy.devdojo.estruturasderepeticao.estruturafor;

/*Elaborar um programa que apresente os quadrados dos números inteiros existentes na faixa de valores de 15 até 200.*/

public class QuadradoDosNumeros {
    public static void main(String[] args) {
        int i;
        for (i = 15; i <= 200; i++) {
            int quadradoDoNumero = ((i - 1) * (i + 1)) + 1;
            System.out.println(quadradoDoNumero);
        }
    }
}
