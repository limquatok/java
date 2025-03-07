public class Exercicio6 {
    public static void main(String[] args){
 
        class Produto{
          
            String nome;
            double preco;
            double desconto;

            void CalcularPrecoFinal(){
                System.out.println("nome Produto: " + nome);
                System.out.println("Preço Produto: " + preco);
                System.out.println("O desconto desse produto é de: " + desconto );
                
                double preco_final = preco - desconto;
                System.out.println("o preco final é: " + preco_final);

            }
          


    }

        Produto p1 = new Produto();

        p1.nome = "controle remoto";
        p1.preco = 109.60;
        p1.desconto = 10.80;
    
        p1.CalcularPrecoFinal();
 }
}