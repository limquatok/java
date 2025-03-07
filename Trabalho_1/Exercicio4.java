public class Exercicio4 {
    public static void main(String[] args){
 
       class Funcionario{
          String nome;
          double salario;
       
          void AumentarSalario(double percentual){

            double valor =  percentual * salario;
            double per = (valor / 100);
            double salario_final = per + salario;

           System.out.println("Seu nome: " + nome);
           System.out.println("Seu salario: " + salario);
           System.out.println("Mais %" + percentual +" sobre o salario de "+ salario);
           System.out.println("Salario + o Percentual = " + salario_final);

       }
        
    }

    Funcionario fu1 = new Funcionario();
       
    fu1.nome = "pedro";
    fu1.salario = 2000;

    fu1.AumentarSalario(50);
 
    
 }
}