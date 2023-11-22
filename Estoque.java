import java.util.ArrayList;
import java.util.List;

//Definição da classe Estoque
public class Estoque {
	private List<Produto> produtos;
	private List<Venda> vendas;

	// Construtor que inicializa as listas de produtos e vendas
	public Estoque() {
		this.produtos = new ArrayList<>();
		this.vendas = new ArrayList<>();
	}

	// Método para cadastrar um produto no estoque
	public void cadastrarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto cadastrado com sucesso!");
	}

	// Método para realizar uma venda
	public void realizarVenda(Produto produto, int quantidade) {
		if (produtos.contains(produto)) {
			if (produto.getQuantidade_produto() >= quantidade) {
				produto.setQuantidade_produto(produto.getQuantidade_produto() - quantidade);
				Venda venda = new Venda(produto, quantidade);
				vendas.add(venda);
				System.out.println("Venda realizada com sucesso!");
			} else {
				System.out.println("Quantidade insuficiente em estoque.");
			}
		} else {
			System.out.println("Produto não encontrado no estoque.");
		}
	}

	// Método para exibir o estoque de produtos
	public void exibirEstoque() {

		for (Produto produto : produtos) {
			System.out.println("ID: " + produto.getId_produto() +
					"\tNome: " + produto.getNome_produto() +
					"\tQuantidade: " + produto.getQuantidade_produto() +
					"\tCategoria: " + getCategoriaNome(produto.getCategoria_produto()));
		}
	}

	// Método para exibir as vendas realizadas
	public void exibirVendas() {
		System.out.println("Vendas realizadas:");
		if (vendas.isEmpty()) {
			System.out.println("Nenhuma venda realizada.");
		} else {
			for (Venda venda : vendas) {
				// Verifica se a venda ou o produto vendido é nulo antes de acessar métodos
				if (venda != null && venda.getProdutoVendido() != null) {
					System.out.println("Produto: " + venda.getProdutoVendido().getNome_produto() +
							"\tQuantidade: " + venda.getQuantidadeVendida());
				}
			}
		}
	}

	// Método auxiliar para obter o nome da categoria com base no número
	private String getCategoriaNome(int categoria) {
		switch (categoria) {
			case 1:
				return "Consoles";
			case 2:
				return "Jogos";
			case 3:
				return "Hardwares";
			case 4:
				return "Peças Especiais";
			case 5:
				return "Outros";
			default:
				return "Categoria não encontrada";
		}
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}