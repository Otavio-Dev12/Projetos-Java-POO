package Ecomerce;

   public class DescontoPercentual implements Desconto {

   double percentual;

   public DescontoPercentual(double percentual){
       this.percentual = percentual;
   }

  @Override
  public double  aplicar(  double precoUnitario , int quantidade ){

       double total = precoUnitario * quantidade;
       double totalComDesconto  = total - (total * percentual);
       return totalComDesconto;
   }

}
