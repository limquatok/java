import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){

        Scanner lerdados = new Scanner(System.in);

        int ano_nascimento;
        int ano_atual = 2025;
        int dias_ano = 365;
        int mes = 30;
        int semanas = 7;
         

        System.out.println("Digite o ano de seu nascimento: ");
        ano_nascimento = lerdados.nextInt();

        int idade = ano_atual - ano_nascimento;
        int idade_dias = idade * dias_ano;
        int idade_em_meses = idade_dias / mes;
        int idade_em_semanas = idade_dias / semanas;

        System.out.println("idade em anos: " + idade);
        System.out.println("iadade em Dias: " + idade_dias);
        System.out.println("Idade em meses: " + idade_em_meses);
        System.out.println("idade em semanas: " + idade_em_semanas);

    }
    
}
