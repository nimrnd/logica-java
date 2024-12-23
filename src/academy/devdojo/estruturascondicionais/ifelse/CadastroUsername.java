package academy.devdojo.estruturascondicionais.ifelse;

/*
Eu, como administrador do sistema, gostaria de permitir que os próprios usuários cadastrassem o nome de usuário (login) no sistema para agilizar o processo de migração do
sistema antigo para o novo. O usuário não pode deixar o login vazio "", ou criar um login como "admin" ou "administrador". Se o valor informado for válido, o sistema deverá
exibir uma mensagem <nome do usuário> cadastrado com sucesso. Senão, o sistema deverá mostrar o erro "Usuário inválido".
*/

import java.util.Objects;
import java.util.Scanner;

public class CadastroUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome de usuário que você deseja utilizar: ");
        String username = scanner.next();

        if (Objects.equals(username, "") || username.equalsIgnoreCase("admin") || username.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido");
        } else {
            System.out.println(username + " cadastrado com sucesso!");
        }
    }
}
