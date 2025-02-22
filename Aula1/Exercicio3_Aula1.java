import java.util.Scanner;

public class Exercicio3_Aula1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite Um numero Inteiro: ");
        int numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.println("O numero é PAR");

        }else{
            System.out.println("O numero é Impar");
        }

    }
}
