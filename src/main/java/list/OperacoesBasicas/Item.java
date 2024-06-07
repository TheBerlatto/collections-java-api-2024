package main.java.list.OperacoesBasicas;

public class Item {
    //atributos
    public String descricao;

    public Item(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
