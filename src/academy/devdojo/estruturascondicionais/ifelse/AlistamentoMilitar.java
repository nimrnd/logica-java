package academy.devdojo.estruturascondicionais.ifelse;

/*
Como secretário de alistamento militar, eu gostaria que meu sistema aceitasse os seguintes parâmetros para que eu possa agilizar o processo de cadastramento:
Sexo, sendo válido apenas M ou F e idade.
Se o sexo for Masculino e a idade maior ou igual a 18 o sistema deve imprimir alistamento obrigatório.
Se o sexo for Masculino e a idade for menor que 18 o sistema deve imprimir alistamento não permitido.
Se o sexo for Feminino e a idade for maior ou igual a 18 o sistema deve imprimir alistamento opcional.
Se o sexo for Feminino e a idade for menor que 18 o sistema deve imprimir alistamento não permitido.
*/

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu gênero (M ou F): ");
        String genero = scanner.next();

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Alistamento não permitido.");
        } else if (genero.equals("M")){
            System.out.println("Alistamento obrigatório.");
        } else if (genero.equals("F")) {
            System.out.println("Alistamento opcional.");
        }
    }
}
