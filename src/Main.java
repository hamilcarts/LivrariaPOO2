import Entities.Livraria;

public class Main {
    public static void main(String[] args) {
        Livraria ada = new Livraria();
        ada.cadastrarProduto();
        ada.cadastrarProduto();
        ada.vender();
        ada.consultarEstoque();
        System.out.println(ada.getCaixa());
        ada.consultarEstoque();
    }
}