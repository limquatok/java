import java.util.Scanner;

public class Exercicio1 {
        

        static void calcular_salario() {

            Scanner lerdados = new Scanner(System.in);
            double salario;

            System.out.println("Digite seu salario ");
            salario = (double) lerdados.nextInt();

            double mais = salario * 0.25;

            double salario_final = salario + mais;

            System.out.println(salario_final);
        }
        
    
    public static void main(String[] args){

        calcular_salario();
    }
}