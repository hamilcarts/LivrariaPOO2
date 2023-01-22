package Entities;

public class Jogos extends Produto {
    String distribuidora, genero, estudio;

    public Jogos(int id, String nome, double preco, int quantidade, String distribuidora, String genero, String estudio, int classificacaoIndicativa) {
        super(id, nome, preco, quantidade, classificacaoIndicativa);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Jogos{" +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                "distribuidora='" + distribuidora + '\'' +
                ", genero='" + genero + '\'' +
                ", estudio='" + estudio + '\'' +
                '}';
    }
}
