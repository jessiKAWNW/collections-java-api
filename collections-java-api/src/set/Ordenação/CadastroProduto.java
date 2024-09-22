package set.Ordenação;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigoProduto, String nomeProduto, double precoProduto, int quantidadeProduto){
        produtoSet.add(new Produto(codigoProduto,nomeProduto,precoProduto,quantidadeProduto));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProduto cadastroProduto = new CadastroProduto();

        // Adicionando produtos ao cadastro
        cadastroProduto.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProduto.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProduto.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProduto.adicionarProduto(4L, "Teclado", 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProduto.produtoSet);

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProduto.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }

}
