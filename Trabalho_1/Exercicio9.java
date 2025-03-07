import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        class Pedido {

            List produto = new ArrayList<>();

            void Adicionar_produtos() {
                produto.add("File");
                produto.add(60.00);
                produto.add("Arroz");
                produto.add(39.80);
                produto.add("CAFÈ");
                produto.add(499.00);

            }

            void Ver_produtos() {
                int tamnaho_produtos = produto.size();

                System.out.println("*******  Cardapio  *******");
                for (int i = 0; i < tamnaho_produtos; i++) {

                    if (i % 2 == 0) {

                        System.out.println(i + " - Nome: " + produto.get(i));

                    } else {
                        System.out.println("Preço: " + produto.get(i));
                    }
                }
            }

            void Fazer_pedido() {

                Scanner ler_dados = new Scanner(System.in);
                List<Integer> numeros_dos_pratos = new ArrayList<>();
                List<Integer> indices_dos_precos = new ArrayList<>();
                List<Double> precos = new ArrayList<>();

                double valor = 0.0;
                double soma = 0.0;
                char parada = 'n';
                

                while (parada == 'n') {
                    System.out.println("Digite o numero do prato: ");
                    int num_prato = ler_dados.nextInt();
                    numeros_dos_pratos.add(num_prato);
                    indices_dos_precos.add(num_prato + 1);

                    System.out.println("Desejar finalizar o pedido  ?");
                    System.out.println("Sim[s]  Não[n]");
                    parada = ler_dados.next().charAt(0);
                }
                
                for (int y = 0; y < produto.size(); y++) {

                    for (int p = 0; p < numeros_dos_pratos.size(); p++) {

                        if (y == numeros_dos_pratos.get(p)) {
                            System.out.println("Voce Escolheu: " + produto.get(y));
                        }
                    }
                }

                for (int h = 0; h < indices_dos_precos.size(); h++) {

                    precos.add((double) produto.get(indices_dos_precos.get(h)));
                    valor = precos.get(h);
                    soma = soma + valor;
                }

                
                System.out.println("Valor Total: " + soma);

            }

        }

        Pedido p1 = new Pedido();

        p1.Adicionar_produtos();
        p1.Ver_produtos();
        p1.Fazer_pedido();

    }
}
