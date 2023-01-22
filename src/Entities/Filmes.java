package Entities;

public class Filmes extends Produto {
    String estudio, diretores, generos, produtores;

    public Filmes(int id, String nome, double preco, int quantidade, String estudio, String diretores, String generos, String produtores) {
        super(id, nome, preco, quantidade);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                "estudio='" + estudio + '\'' +
                ", diretores='" + diretores + '\'' +
                ", generos='" + generos + '\'' +
                ", produtores='" + produtores + '\'' +
                '}';
    }
}
