package academy.devdojo.estruturasderepeticao.estruturawhile;

/*Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e senha corretos devem estar armazenados em constantes no seu programa.
Se o usuário acertar o usuário e senha exibir a mensagem ACESSO CONCEDIDO, caso contrário exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha
essa condição deve-se repetir até o que o usuário acerte a combinação.*/

import java.util.Objects;
import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("   CADASTRO DE USUÁRIO   ");
        System.out.println("-------------------------");
        System.out.print("Informe um nome de usuário: ");
        final String usuario = scanner.next();
        System.out.print("Informe uma senha: ");
        final String senha = scanner.next();

        boolean acessoConcedido = false;

        while (!acessoConcedido) {
            System.out.println("-------------------------");
            System.out.println("         LOGIN           ");
            System.out.println("-------------------------");
            System.out.print("Informe seu nome de usuário: ");
            String usuarioInformado = scanner.next();
            System.out.print("Informe sua senha: ");
            String senhaInformada = scanner.next();

            if ((usuarioInformado.equals(usuario)) && (senhaInformada.equals(senha))) {
                System.out.println("ACESSO CONCEDIDO");
                acessoConcedido = true;
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
    }
}
