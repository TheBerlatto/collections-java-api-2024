package main.java.set.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade) {
        produtosSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidade() {
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtosPorQuantidade.addAll(produtosSet);
        return produtosPorQuantidade;
    }

    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto("Smartphone", 1L, 1000d, 10);
        cadastroProdutos.adicionarProduto("Notebook", 2L, 1500d, 5);
        cadastroProdutos.adicionarProduto("Mouse", 1L, 30d, 20);
        cadastroProdutos.adicionarProduto("Teclado", 4L, 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.produtosSet);

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

        // Exibindo produtos ordenados por quantidade
        System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());
    }
}
