package Entities;

public class AlbunsDeMusica extends Produto {
    String musicosBandas, generos, selos;

    public AlbunsDeMusica(int id, String nome, double preco, int quantidade, String musicosBandas, String generos, String selos) {
        super(id, nome, preco, quantidade);
        this.musicosBandas = musicosBandas;
        this.generos = generos;
        this.selos = selos;
    }

    @Override
    public String toString() {
        return "AlbunsDeMusica{" +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                "musicosBandas='" + musicosBandas + '\'' +
                ", generos='" + generos + '\'' +
                ", selos='" + selos + '\'' +
                '}';
    }

}
