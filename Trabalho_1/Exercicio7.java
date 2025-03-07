public class Exercicio7 {
    public static void main(String[] args){
        class Veiculo {
            double capacidade_litros_tanque;
            double tanque_litros;

            
            void Verificar_galao(){
                double capacidade_atual = capacidade_litros_tanque - tanque_litros;

                System.out.println("Seu tanque_litros atual é: " + tanque_litros + " Litros");
                System.out.println("O tamanho da capacidade total do seu carro é: " + capacidade_litros_tanque + " Litros");
                System.out.println("voce pode colocar ainda: " + capacidade_atual + " Litros");
            }

            void Abastecer(double litros){

                double capacidade_atual = capacidade_litros_tanque - tanque_litros;

                if(litros <= capacidade_atual){
                    double ainda_cabe_litros = capacidade_atual - litros;
                    System.out.println("Voce colocou " + litros + " Litros de Gasolina");
                    System.out.println("Ainda cabe: " + ainda_cabe_litros + " Litros");
                    double tanque_total = litros + tanque_litros;
                    System.out.println("Tanque total: " + tanque_total + " Litros");
                    
                }else{
                    System.out.println("Voce está tentando abastecer o valor maior de litros!");
                    System.out.println("Tente um valor menor!");
                }
            }

            
        }


        Veiculo hb20 = new Veiculo();

        hb20.capacidade_litros_tanque = 50;
        hb20.tanque_litros = 20;
        hb20.Verificar_galao();
        hb20.Abastecer(29.60);
    }
}
