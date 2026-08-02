package SISTEMADELOJAVIRTUAL;

import java.util.ArrayList;

public class Loja {

 ArrayList<Produto> produtos;
 ArrayList<Cliente>clientes;
 ArrayList<Pedido>pedidos;

 // metodos

  private void cadastrarProduto(Produto produto){
   produtos.add(produto);
   System.out.println("Produto cadastrado: " + produto.getNome());
  }

  private void cadastrarCliente(Cliente cliente){
   clientes.add(cliente);
   System.out.println("Cliente cadastrado: " + cliente.getNome());
  }

  private void cadastrarPedido(Pedido pedido){
  pedidos.add(pedido);
   System.out.println("Pedido cadastrado: " + pedido.getNumero());
  }

   private void FinalizarPedido(int numero){
   for (Pedido pedido: pedidos){
   int numeroDoPedidoAtual= pedido.getNumero();
      if (numeroDoPedidoAtual == numero){
       System.out.println(" Pedido encontrado!");
       pedido.setFinalizado(true);
      }

   }
}




}
