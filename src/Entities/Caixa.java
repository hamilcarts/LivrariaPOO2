package Entities;

public class Caixa {
    double saldo = 0;

    public void adicionarDinheiro(double valor) {
        this.saldo += valor;
    }

    public void retirarDinheiro(double valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "Caixa{" +
                "saldo=" + saldo +
                '}';
    }
}
