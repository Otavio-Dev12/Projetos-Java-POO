package Ecomerce;

   public class EcomercePrincipal {

       public static void main(String[] args) {

       Carrinho carrinho = new Carrinho();

       Produto Chinelo =  new Produto("Chinelo", 50,1,new DescontoFixo(10));
       carrinho.adicionarproduto(Chinelo);
       System.out.println("Esse foi o valor final do chinelo: "  + carrinho.calcularTotal());

       System.out.println("-------------------------");

       Carrinho carrinho1 = new Carrinho();
       Produto Tenis =  new Produto("Tenis",100,3,new DescontoPercentual(0.20));
       carrinho1.adicionarproduto(Tenis);
       System.out.println("Esse foi o valor final do tenis : " + carrinho1.calcularTotal());


       System.out.println("----------------------");

       Carrinho carrinho2 = new Carrinho();
       Produto camisa = new Produto("Camisa galo", 500,3,new DescontoLeve3pague2());
       carrinho2.adicionarproduto(camisa);
       System.out.println("Esse foi o valor final da camisa: " + carrinho2.calcularTotal());

       System.out.println("--------------------------");

       Carrinho carrinho3 = new Carrinho();
       Produto meia  = new Produto("Meia", 20,10,new SemDesconto());
       carrinho3.adicionarproduto(meia);
           System.out.println("Esse foi o valor final das Meias: " + carrinho3.calcularTotal());








 }

}
