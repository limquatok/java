public class Exercicio5 {
    public static void main(String[] args){
 
       class ContaBancaria{
          double saldo;
          double saldo_atual;
       
          void Depositar(double depositar_alario){
            System.out.println("saldo Anterior: " + saldo);
            saldo = depositar_alario;
            System.out.println("VOCE DEPOSITOU: " + depositar_alario);
          }

          void Sacar( double sacar){
            
            if(sacar <= saldo){
                saldo_atual = saldo - sacar;
                System.out.println("Voce sacou da sua conta: " + sacar);
                
            }else{
                saldo_atual = saldo;
                System.out.println("O valor que voce quer sacar: " + sacar +" Esse valor é maior que o seu saldo!");
                System.out.println("Tente um valor menor!");
            }

            
          }

          void GetSaldo(){
            System.out.println("Seu saldo: " + saldo_atual);
          }


    }

    ContaBancaria cont1 = new ContaBancaria();
       
    
    cont1.Depositar(1550.50);
    cont1.Sacar(1550.50);
    cont1.GetSaldo();
    
 }
}