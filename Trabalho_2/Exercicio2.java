import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){

        Scanner lerdados = new Scanner(System.in);
        double salario;
        double percentual;

        
        System.out.println("Digite seu salario ");
        salario = (double) lerdados.nextInt();
        System.out.println("Digite o percentual (somente o numero inteiro) ");
        percentual =  (double) lerdados.nextInt();

        double novo_percentual = percentual / 100;
        
        double mais = salario * novo_percentual;

        double salario_final = salario + mais;

        

        System.out.println(salario_final);

    }
}