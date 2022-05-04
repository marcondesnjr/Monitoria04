import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Supermercado sm = new Supermercado("Supermercado");
        Produto produto = new Produto("prod1",50,100);
        sm.addProduto(produto);
        Cliente cliente = new Cliente("client1");
        sm.addCliente(cliente);

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.addProduto(produto,12);
        pedido.setPagamento(Pedido.TipoPagamento.DINHEIRO);
        sm.concluirPedido(pedido);

        System.out.println(sm.getProdutos());
        System.out.println(sm.getClientes());
        System.out.println(sm.getPedidos());

    }

}
