package academy.devdojo.estruturascondicionais.switchcase;

/*
Como gerente eu gostaria que meus usuários pudessem digitar o tipo da conta e o sistema imprima qual a porcentagem de juros que aquela conta irá oferecer para o cliente
para agilizar o acesso as informações. Os tipos de contas são:
CONTA_POUPANCA 0.05%
CONTA_CORRENTE 0.02%
CONTA_INVESTIMENTO 0.1%
*/

import java.util.List;
import java.util.Scanner;

public class PorcentagemJurosConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("DIGITE O NÚMERO QUE CORRESPONDE À CONTA QUE VOCÊ DESEJA ABRIR:");
        System.out.println("1 - CONTA POUPANÇA \n2- CONTA CORRENTE \n3- CONTA INVESTIMENTO");
        System.out.println("------------------------");
        System.out.print("Opção: ");
        int tipoConta = scanner.nextInt();


        List<String> contaCorrespondente = switch (tipoConta) {
            case 1 -> List.of("Conta poupança", "0.05%");
            case 2 -> List.of("Conta corrente", "0.02%");
            case 3 -> List.of("Conta investimento", "0.1%");
            default -> List.of("Tipo de conta inválido");
        };

        System.out.println("O tipo de conta escolhido foi " + contaCorrespondente.get(0) + " e a porcetagem de juros é de " + contaCorrespondente.get(1));
    }
}
