import java.util.Scanner;

public class Exercicio2_Aula_1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float num1;
        float num2;
        float num3;
// Ao Colocar numeros decimais usar "," ao invés de "."
        System.out.println("Digite 1 Numeros");
        num1 = entrada.nextFloat();

        System.out.println("Digite 2 Numero");
        num2 = entrada.nextFloat();

        System.out.println("Digite 3 Numero");
        num3 = entrada.nextFloat();

        System.out.println("A Media dos 3 Numeros é: ");
        
        float media = (num1 + num2 + num3) / 3;

        System.out.println(media);

        
    }
}
