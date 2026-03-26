import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> produtosLista = new ArrayList<>();

        String nome;
        int opcao =-1;


        System.out.println("===================================");
        System.out.println("       SISTEMA DE ESTOQUE 1.0      ");
        System.out.println("===================================");


        while (opcao != 0) {
            System.out.println("""
                1. Cadastrar Novo Produto
                2. Listar Estoque Atual
                3. Exibir Valor Total em Mercadoria
                4. Excluir Produto
                0. Sair do Sistema
                """);
            System.out.println("-----------------------------------");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    int quantidade,id;
                    double preco;

                    System.out.println("\n[CADASTRO DE PRODUTOS]\n");
                    System.out.print(">Nome: ");
                    nome = scanner.nextLine();
                    System.out.print(">Preço unitario: ");
                    preco = scanner.nextDouble();
                    System.out.print(">Quantidade em estoque: ");
                    quantidade = scanner.nextInt();

                    produtosLista.add(new Produto(nome, preco, quantidade));
                    System.out.println("[OK] Produto cadastrado com sucesso!\n");
                    break;


                case 2:

                    System.out.println("\n [LISTAGEM DE ESTOQUE] \n");
                    for(Produto p : produtosLista){
                        System.out.println(p.toString());
                    }

                    break;
                case 3:
                    double soma = 0;
                    for (Produto p : produtosLista){

                        soma += p.getPreco() * p.getQuantidade();
                    }
                    System.out.print("\n RELATÓRIO FINANCEIRO: ");
                    System.out.printf("\nAtualmente, você possui %.2f investidos em estoque.\n",soma);
                    System.out.print("\n-------------------------------------------------------\n");
                    break;
                case 4:
                    int n;
                    boolean produtoEncontrado = false;
                    System.out.println("Selecione o Numero do produto que quer excluir: ");
                    n = scanner.nextInt();

                    for (int i = 0 ; i < produtosLista.size();i++){

                        if (produtosLista.get(i).getId() == n){
                            produtosLista.remove(i);
                            System.out.println("[OK] Produto excluido com sucesso ");
                            produtoEncontrado = true;
                            break;
                        }
                    }
                    if (!produtoEncontrado){
                        System.out.println("Produto não encontrado ou ID incorreto. Tente novamente");
                    }
                    break;
            }
        }
    }
}