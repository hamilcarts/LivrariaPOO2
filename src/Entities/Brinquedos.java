package Entities;

public class Brinquedos extends Produto {
    String tipo;

    public Brinquedos(int id, String nome, double preco, int quantidade, String tipo) {
        super(id, nome, preco, quantidade);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedos{" +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
