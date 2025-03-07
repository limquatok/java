import java.util.ArrayList;
import java.util.List;

public class Exercicio8 {
    public static void main(String[] args){

        class Agenda {
            List<String> nomes = new ArrayList<>();
            List<String> telefones = new ArrayList<>();

            void Adicionar_nomes(String novo_nome){
                nomes.add(novo_nome);
            }
            void Adicionar_telefones(String novo_telefone){
                telefones.add(novo_telefone);
            }
            void Remover_nomes(String r_nome){
                nomes.remove(r_nome);
            }
            void Remover_telefones(String r_telefone){
                telefones.remove(r_telefone);
            }
           
            void Mostrar_Lista(){
                int tamanho_nomes = nomes.size();
                int tamanho_telefones = telefones.size();
                //int total = tamanho_nomes + tamanho_telefones;

                if(tamanho_nomes != tamanho_telefones){
                    System.out.println("O Quantidade de nomes e diferente da quantidade de Telefones");
                    System.out.println("Adicione mais um nome ou numero!");

                    for(int y = 0; y < tamanho_nomes; y++){
                        System.out.println(nomes.get(y));

                    }for(int h = 0; h < tamanho_telefones; h++){
                        System.out.println(telefones.get(h));
                    }



                }else{
                    for(int i = 0; i < tamanho_nomes; i++){
                        System.out.println(nomes.get(i));
                        System.out.println(telefones.get(i));
                
                    }
                }
            
            }
            
        }


        Agenda pessoa = new Agenda();
        pessoa.Adicionar_nomes("jose");
        pessoa.Adicionar_telefones("(62)95654654654");

        pessoa.Mostrar_Lista();

        pessoa.Remover_nomes("jose");

        pessoa.Mostrar_Lista();

        pessoa.Adicionar_nomes("Leticia");
        pessoa.Adicionar_nomes("Mendes");
        pessoa.Adicionar_telefones("(68)9458667845");

        pessoa.Mostrar_Lista();
    }
}      
    



