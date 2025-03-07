public class Exercicio3 {
    public static void main(String[] args){
 
       class Retangulo{
          int altura;
          int base;
       
          void Apresentar(){

            int area = altura * base;
            System.out.println("A Area do retangulo é: " + area); 
          }
       }
       
       
       Retangulo p1 = new Retangulo();
       
       p1.altura = 20;
       p1.base = 12;
 
       p1.Apresentar();
    }
 
    
 }