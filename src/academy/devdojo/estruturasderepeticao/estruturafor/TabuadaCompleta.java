package academy.devdojo.estruturasderepeticao.estruturafor;

/*Eu, como usuário, gostaria de um sistema que fizesse automaticamente a tabuada de 1 a 10.*/

public class TabuadaCompleta {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for(int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i*j));
            }
            System.out.println("-----");
        };
    }
}
