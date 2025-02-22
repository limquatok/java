import java.util.Scanner;

public class Exercicio4_Aula1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");

        int numero = entrada.nextInt();

        for(int i = 1; i <= 10; i++){
            
            int resultado = numero * i;

            System.out.println(resultado);

        }
    }
}
