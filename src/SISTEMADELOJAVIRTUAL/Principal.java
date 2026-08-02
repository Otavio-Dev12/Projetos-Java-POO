package SISTEMADELOJAVIRTUAL;


public class Principal {

   public static void main(String[] args) {

  ItemPedido p1 = new ItemPedido("Tenis nike", 2 , 300.0);


  Pedido pe1 = new Pedido(25, "Flavio" , true);
  pe1.adicionarItem(p1);


  double total = pe1.calcularTotal();

  Pix pix = new Pix();
  boolean aprovado =  pix.realizarPagamento(total);
  if (aprovado){
      System.out.println("Pedido Confirmado");
  } else {
      System.out.println("Pedido cancelado, pagamento recusado!");
  }



   ItemPedido p2 = new ItemPedido("Camisa adidas", 2, 1000.0);

   Pedido pe2  =new Pedido(21, "carlos", true);
   pe2.adicionarItem(p2);

   double total2 = pe2.calcularTotal();

   CartaoCredito cartaoCredito = new CartaoCredito( 1000.0f);
       aprovado = cartaoCredito.realizarPagamento(total2);

   if (aprovado){
       System.out.println("Limite suficiente, pagamento confirmado!");
   }else {
       System.out.println("Limite insuficiente, pagamento recusado!");
   }

  ItemPedido p3 = new ItemPedido("Chuteira nike", 2, 500.0 );

  Pedido pe3 = new Pedido( 588, "tutu", false);
  pe3.adicionarItem(p3);

  double total3 = pe3.calcularTotal();

  Pix Pix2 = new Pix();
  boolean Aprovadopix = pix.realizarPagamento(total3);
  if (Aprovadopix){
      System.out.println("Pagamento aprovado, pix feito!");
  }else{
      System.out.println("Pix cancelado!");
  }




   }
}
