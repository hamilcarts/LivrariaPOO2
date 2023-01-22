import Entities.Cliente;
import Entities.Livraria;

public class Main {
    public static void main(String[] args) {
        Livraria ada = new Livraria();
        Cliente cliente = new Cliente("Hamilcar", "124444555","01563949513","13/07/1993");
        ada.cadastrarProduto();
        ada.cadastrarProduto();
        ada.vender(cliente);
        ada.consultarEstoque();
        System.out.println(ada.getCaixa());
        ada.consultarEstoque();
    }
}