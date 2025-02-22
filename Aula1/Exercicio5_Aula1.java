import java.util.Scanner;

public class Exercicio5_Aula1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");

        int numero = entrada.nextInt();

        for(int i = numero; i >= 1; i--){
            
            System.out.println(i);

        }
        System.out.println("Fogo!");
    }
}