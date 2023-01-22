package Entities;

import java.util.ArrayList;

public class Estoque {
    ArrayList<Livros> livros = new ArrayList<>();
    ArrayList<Jogos> jogos = new ArrayList<>();
    ArrayList<Filmes> filmes = new ArrayList<>();
    ArrayList<AlbunsDeMusica> albunsDeMusicas = new ArrayList<>();
    ArrayList<Brinquedos> brinquedos = new ArrayList<>();

    public void adicionarLivro(Livros livros) {
        this.livros.add(livros);
    }

    public void adicionarJogo(Jogos jogos) {
        this.jogos.add(jogos);
    }

    public void adicionarFilmes(Filmes filmes) {
        this.filmes.add(filmes);
    }

    public void adicionarAlbunsDeMusica(AlbunsDeMusica albunsDeMusica) {
        this.albunsDeMusicas.add(albunsDeMusica);
    }

    public void adicionarBrinquedo(Brinquedos brinquedos) {
        this.brinquedos.add(brinquedos);
    }

    public ArrayList<Livros> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livros> livros) {
        this.livros = livros;
    }

    public ArrayList<Jogos> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogos> jogos) {
        this.jogos = jogos;
    }

    public ArrayList<Filmes> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filmes> filmes) {
        this.filmes = filmes;
    }

    public ArrayList<AlbunsDeMusica> getAlbunsDeMusicas() {
        return albunsDeMusicas;
    }

    public void setAlbunsDeMusicas(ArrayList<AlbunsDeMusica> albunsDeMusicas) {
        this.albunsDeMusicas = albunsDeMusicas;
    }

    public ArrayList<Brinquedos> getBrinquedos(int produto) {
        return brinquedos;
    }

    public void setBrinquedos(ArrayList<Brinquedos> brinquedos) {
        this.brinquedos = brinquedos;
    }
}
