package academy.devdojo.variaveis;/*
Crie uma variável que irá guardar o valor de um salário
Calcule a porcentagem desse salário, utilizando essas porcentagens, respectivamente: 30% / 15% / 05%
A cada calculo realizado imprima o resultado
Reutilize a variável porcentagem e resultado
*/

public class ReutilizandoVariaveis {
    public static void main(String[] args){
        double salario = 5000;

        double porcentagem = 30;
        double porcentagemDoSalario = (porcentagem / 100) * salario;
        System.out.println("A porcentagem de 30% do salário é: " + porcentagemDoSalario);

        porcentagem = 15;
        porcentagemDoSalario = (porcentagem / 100) * salario;
        System.out.println("A porcentagem de 15% do salário é: " + porcentagemDoSalario);

        porcentagem = 5;
        porcentagemDoSalario = (porcentagem / 100) * salario;
        System.out.println("A porcentagem de 5% do salário é: " + porcentagemDoSalario);
    }
}
