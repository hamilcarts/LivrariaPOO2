package Entities;

public class Produto {
    int id;
    String nome;
    double preco;
    int quantidade;
    int classificacaoIndicativa;

    public Produto(int id, String nome, double preco, int quantidade, int classificacaoIndicativa) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.classificacaoIndicativa = classificacaoIndicativa;


}

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }
}
