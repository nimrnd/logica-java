package academy.devdojo.estruturasderepeticao.estruturawhile;

public class DoWhile {
    public static void main(String[] args) {
        boolean condicao = false;

        while (condicao) { //como a condição é falsa essa parte do código não será executada
            System.out.println("Dentro do while");
        }

        do { //como é executado linha por linha mesmo a condição sendo falsa pelo menos uma vez será exibida a mensagem
            System.out.println("Dentro do do-while");
        } while (condicao);
    }
}
