
public class Exercicio2 {
    public static void main(String[] args){
 
       class Livro{
          String titulo;
          String autor;
       
          void Apresentar(){
               System.out.println("Titulo: " + titulo);
               System.out.println("Autor " + autor);
          }
       }
       
       
       Livro p1 = new Livro();
       
       p1.titulo = "Pão Careca";
       p1.autor = "desconhecido";
 
       p1.Apresentar();
    }
 
    
 }
 