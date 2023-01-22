package Entities;

public class Livros extends Produto {
    String genero, escritor, editora;

    public Livros(int id, String nome, double preco, int quantidade, String genero, String escritor, String editora, int classificacaoIndicativa) {
        super(id, nome, preco, quantidade,classificacaoIndicativa);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livros{" +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                "genero='" + genero + '\'' +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
