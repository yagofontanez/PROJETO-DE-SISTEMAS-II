import java.util.Scanner;

public class Produto {

    private int id_produto;
    private String nome_produto;
    private int quantidade_produto;
    private int categoria_produto;

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public int getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    public int getCategoria_produto() {
        return categoria_produto;
    }

    public void setCategoria_produto(int categoria_produto) {
        this.categoria_produto = categoria_produto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira o id do produto que será colocado no estoque: ");
        int id_produto = scanner.nextInt();
        scanner.nextLine();
        System.out.println("insira o nome do produto que será colocado no estoque: ");
        String nome_produto = scanner.nextLine();
        System.out.println("insira a quantidade do produto que será colocada no estoque: ");
        int quantidade_produto = scanner.nextInt();
        System.out.println("insira a categoria do produto(em nº) que será colocada no estoque: ");
        int categoria_produto = scanner.nextInt();
        if (categoria_produto == 1) {
            System.out.println("o id do produto cadastrado é: " + id_produto);
            System.out.println("o nome do produto cadastrado é: " + nome_produto);
            System.out.println("a quantidade de produtos cadastrado é: " + quantidade_produto);
            System.out.println("a categoria do produto é: consoles");
        } else if (categoria_produto == 2) {
            System.out.println("o id do produto cadastrado é: " + id_produto);
            System.out.println("o nome do produto cadastrado é: " + nome_produto);
            System.out.println("a quantidade de produtos cadastrado é: " + quantidade_produto);
            System.out.println("a categoria do produto é: jogos");
        } else if (categoria_produto == 3) {
            System.out.println("o id do produto cadastrado é: " + id_produto);
            System.out.println("o nome do produto cadastrado é: " + nome_produto);
            System.out.println("a quantidade de produtos cadastrado é: " + quantidade_produto);
            System.out.println("a categoria do produto é: hardwares");
        } else if (categoria_produto == 4) {
            System.out.println("o id do produto cadastrado é: " + id_produto);
            System.out.println("o nome do produto cadastrado é: " + nome_produto);
            System.out.println("a quantidade de produtos cadastrado é: " + quantidade_produto);
            System.out.println("a categoria do produto é: peças unicas");
        } else if (categoria_produto == 5) {
            System.out.println("o id do produto cadastrado é: " + id_produto);
            System.out.println("o nome do produto cadastrado é: " + nome_produto);
            System.out.println("a quantidade de produtos cadastrado é: " + quantidade_produto);
            System.out.println("a categoria do produto é: outros");
        }

        else {
            System.out.println("categoria nao encontrada, repita o processo");
        }

    }

}
