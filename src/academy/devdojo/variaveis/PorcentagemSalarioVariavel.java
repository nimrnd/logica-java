package academy.devdojo.variaveis;

import java.util.Scanner;

public class PorcentagemSalarioVariavel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Infome seu salario: ");
        float salario = scanner.nextFloat();

        System.out.print("Informe a porcentagem: ");
        float porcentagem = scanner.nextFloat();

        float porcentagemDoSalario = (porcentagem / 100) * salario;

        System.out.println("A porcentagem do salário é: " + porcentagemDoSalario);
        scanner.close();
    }
}
