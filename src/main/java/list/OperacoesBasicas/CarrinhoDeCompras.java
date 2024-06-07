package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> compraList;

    public CarrinhoDeCompras() {
        this.compraList = new ArrayList<>();
    }

    public void adicionarItem(String descricao){
        compraList.add(new Item(descricao));
    }

    public void removerItem(String descricao){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : compraList){
            if (i.getDescricao().equalsIgnoreCase(descricao)){
                itensParaRemover.add(i);
            }
        }

        compraList.removeAll(itensParaRemover);
    }

    public int obterNumeroTotalItens(){
        return compraList.size();
    }

    public void obterDescricoesItens(){
        System.out.println(compraList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("O número total de itens no carrinho é: " + carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.adicionarItem("Refrigerante");
        carrinhoDeCompras.adicionarItem("Refrigerante");
        carrinhoDeCompras.adicionarItem("Suco");
        carrinhoDeCompras.adicionarItem("Salgadinho");
        carrinhoDeCompras.adicionarItem("Arroz");
        System.out.println("O número total de itens no carrinho é: " + carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.removerItem("Refrigerante");
        System.out.println("O número total de itens no carrinho é: " + carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.obterDescricoesItens();
    }
}
