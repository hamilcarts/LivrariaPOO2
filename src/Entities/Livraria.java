package Entities;

import java.util.Scanner;

public class Livraria {
    Estoque estoque = new Estoque();
    Caixa caixa = new Caixa();

    public void cadastrarProduto() {
        System.out.println("CADASTRO DE PRODUTO");
        selecionarCategoria();
        int opcao = 0;
        do {
            opcao = scanInt();
        } while (opcao < 1 || opcao > 5);
        System.out.println("Digite o código do produto");
        int id = scanInt();
        System.out.println("Digite o nome do produto");
        String nome = scanString();
        System.out.println("Digite o preço do produto");
        Double preco = scanDouble();
        System.out.println("Digite a quantidade comprada");
        int quantidade = scanInt();

        switch (opcao) {
            case 1 -> {
                System.out.println("Digite o genero do livro");
                String genero = scanString();
                System.out.println("Digite o autor do livro");
                String escritor = scanString();
                System.out.println("Digite a editora do livro");
                String editora = scanString();
                Livros livro = new Livros(id, nome, preco, quantidade, genero, escritor, editora);
                estoque.adicionarLivro(livro);
            }
            case 2 -> {
                System.out.println("Digite a distribuidora do jogo");
                String distribuidora = scanString();
                System.out.println("Digite o genero do jogo");
                String genero = scanString();
                System.out.println("Digite o estudio do jogo");
                String estudio = scanString();
                Jogos jogos = new Jogos(id, nome, preco, quantidade, distribuidora, genero, estudio);
                estoque.jogos.add(jogos);
            }
            case 3 -> {
                System.out.println("Digite o estudio do filme");
                String estudio = scanString();
                System.out.println("Digite os diretores do filme");
                String diretores = scanString();
                System.out.println("Digite o genero do filme");
                String genero = scanString();
                System.out.println("Digite os produtores do filme");
                String produtores = scanString();
                Filmes filmes = new Filmes(id, nome, preco, quantidade, estudio, diretores, genero, produtores);
                estoque.filmes.add(filmes);
            }
            case 4 -> {
                System.out.println("Digite os musicos/banda do álbum");
                String musicos = scanString();
                System.out.println("Digite o genero do do álbum");
                String genero = scanString();
                System.out.println("Digite os selos do álbum");
                String selos = scanString();
                AlbunsDeMusica albunsDeMusica = new AlbunsDeMusica(id, nome, preco, quantidade, musicos, genero, selos);
                estoque.albunsDeMusicas.add(albunsDeMusica);
            }
            case 5 -> {
                System.out.println("Digite o tipo do brinquedo");
                String tipo = scanString();
                Brinquedos brinquedos = new Brinquedos(id, nome, preco, quantidade, tipo);
                estoque.brinquedos.add(brinquedos);
            }
        }
    }

    public void consultarEstoque() {
        System.out.println("CONSULTA DE ESTOQUE");
        selecionarCategoria();
        System.out.println("[6] - Geral");
        int opcao = 0;
        do {
            opcao = scanInt();
        } while (opcao < 1 || opcao > 6);

        switch (opcao) {
            case 1 -> {
                System.out.println(estoque.livros.toString());
            }
            case 2 -> {
                System.out.println(estoque.jogos.toString());
            }
            case 3 -> {
                System.out.println(estoque.filmes.toString());
            }
            case 4 -> {
                System.out.println(estoque.albunsDeMusicas.toString());
            }
            case 5 -> {
                System.out.println(estoque.brinquedos.toString());
            }
            case 6 -> {
                System.out.println(estoque.livros.toString());
                System.out.println(estoque.jogos.toString());
                System.out.println(estoque.filmes.toString());
                System.out.println(estoque.albunsDeMusicas.toString());
                System.out.println(estoque.brinquedos.toString());
            }
        }
    }


    public void vender() {
        System.out.println("REALIZAR VENDA");
        selecionarCategoria();
        int opcao = 0;
        do {
            opcao = scanInt();
        } while (opcao < 1 || opcao > 5);
        System.out.println("Digite o id do produto");
        int id = scanInt();
        System.out.println("Digite a quantidade vendida");
        int quantidade = scanInt();
        switch (opcao) {
            case 1 -> {
                double preco = estoque.livros.get(id).preco;
                caixa.adicionarDinheiro(preco * quantidade);
                estoque.livros.get(id).quantidade = estoque.livros.get(id).quantidade - quantidade;
            }
            case 2 -> {
                double preco = estoque.jogos.get(id).preco;
                caixa.adicionarDinheiro(preco * quantidade);
                estoque.jogos.get(id).quantidade = estoque.jogos.get(id).quantidade - quantidade;
            }
            case 3 -> {
                double preco = estoque.filmes.get(id).preco;
                if ((preco * quantidade) > 200) {
                    caixa.adicionarDinheiro(preco * quantidade * 0.85);
                } else {
                    caixa.adicionarDinheiro(preco * quantidade);
                }
                estoque.filmes.get(id).quantidade = estoque.filmes.get(id).quantidade - quantidade;
            }
            case 4 -> {
                double preco = estoque.albunsDeMusicas.get(id).preco;
                caixa.adicionarDinheiro(preco * quantidade);
                estoque.albunsDeMusicas.get(id).quantidade = estoque.albunsDeMusicas.get(id).quantidade - quantidade;
            }
            case 5 -> {
                double preco = estoque.brinquedos.get(id).preco;
                caixa.adicionarDinheiro(preco * quantidade);
                estoque.brinquedos.get(id).quantidade = estoque.brinquedos.get(id).quantidade - quantidade;
            }
        }
    }

    public int scanInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public String scanString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public Double scanDouble() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public void selecionarCategoria() {
        System.out.println("Selecione a categoria:");
        System.out.println("[1] - Livros");
        System.out.println("[2] - Jogos");
        System.out.println("[3] - Filmes");
        System.out.println("[4] - Álbuns de música");
        System.out.println("[5] - Brinquedos");
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
}
