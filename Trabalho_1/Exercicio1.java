
public class Exercicio1 {
   public static void main(String[] args){

      class Pessoa{
         String   nome;
         int  idade;
      
         void Apresentar(){
              System.out.println("Meu nome: " + nome);
              System.out.println("Minha idade " + idade);
         }
      }
      
      
      Pessoa p1 = new Pessoa();
      
      p1.nome = "Pedro";
      p1.idade = 20;

      p1.Apresentar();
   }

   
}
