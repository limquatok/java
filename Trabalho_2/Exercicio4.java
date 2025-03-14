import java.util.Scanner;

public class Exercicio4 {

    static void racao(){
        Scanner lerdados = new Scanner(System.in);

        double grama_gato1;
        double grama_gato2;
        double peso_saco_racao_kg;

        System.out.println("Digite o peso da ração em Kg: ");
        peso_saco_racao_kg = lerdados.nextDouble();

        System.out.println("Coloque quantidade em gramas que o gato 1 come por dia: ");
        grama_gato1 = lerdados.nextDouble();

        System.out.println("Coloque quantidade em gramas que o gato 2 come por dia: ");
        grama_gato2 = lerdados.nextDouble();

        double grama_dia = grama_gato1 + grama_gato2;
        
        double quant_racao_5_dias = (grama_gato1 * 5) + (grama_gato2 * 5);

        double quant_final_gato_1_gramas = (grama_gato1 * 5);

        double quant_final_gato_2_gramas = (grama_gato2 * 5);

        double peso_saco_racao_kg_para_gramas = peso_saco_racao_kg * 1000;

        double peso_final_gato_1_e_2_gramas = peso_saco_racao_kg_para_gramas - (quant_final_gato_1_gramas + quant_final_gato_2_gramas) ;

        double peso_final_gato_1_e_2_kg = peso_final_gato_1_e_2_gramas / 1000;

        System.out.println("O Peso do saco de ração é: " + peso_saco_racao_kg + " Kg");
        System.out.println("Os 2 gatos consomem no dia: " + grama_dia + " Gramas");
        System.out.println("Em 5 dias os 2 gatos vão consumir " + quant_racao_5_dias + " Gramas");
        System.out.println("No final dos 5 dias o peso do saco de ração será: " + peso_final_gato_1_e_2_kg + " Kg");
        
    }
    public static void main(String[] args){

        racao();
    }
    
}
