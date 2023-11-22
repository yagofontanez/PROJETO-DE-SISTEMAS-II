import java.util.Scanner;

//Classe principal que contém o método main (ponto de entrada do programa)
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();// Cria uma instância de Estoque

        System.out.println("Insira o número de produtos a cadastrar: ");
        int numProdutos = scanner.nextInt();

        // Loop para cadastrar produtos no estoque
        for (int i = 0; i < numProdutos; i++) {
            Produto produto = new Produto();

            System.out.println("Insira o ID do produto: ");
            produto.setId_produto(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Insira o nome do produto: ");
            produto.setNome_produto(scanner.nextLine());

            System.out.println("Insira a quantidade do produto: ");
            produto.setQuantidade_produto(scanner.nextInt());

            System.out.println("Insira a categoria do produto (em número): ");
            produto.setCategoria_produto(scanner.nextInt());

            estoque.cadastrarProduto(produto);
        }

        // Exibe o estoque inicial
        System.out.println("\nEstoque inicial:");
        estoque.exibirEstoque();

        // Realiza uma venda
        System.out.println("\nRealizar venda - Insira o ID do produto: ");
        int idVenda = scanner.nextInt();
        System.out.println("Insira a quantidade a ser vendida: ");
        int quantidadeVenda = scanner.nextInt();

        // Encontra o produto com o ID informado
        Produto produtoParaVenda = null;
        for (Produto produto : estoque.getProdutos()) {
            if (produto.getId_produto() == idVenda) {
                produtoParaVenda = produto;
                break;
            }
        }

        // Realiza a venda se o produto for encontrado
        if (produtoParaVenda != null) {
            estoque.realizarVenda(produtoParaVenda, quantidadeVenda);
        } else {
            System.out.println("Produto não encontrado para venda.");
        }

        // Exibe o estoque após a venda
        System.out.println("\nEstoque após a venda:");
        estoque.exibirEstoque();

        scanner.close();
    }
}
