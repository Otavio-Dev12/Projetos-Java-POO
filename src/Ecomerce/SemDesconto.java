package Ecomerce;

   public class SemDesconto implements Desconto{


       @Override
       public double aplicar(double precoUnitario, int quantidade) {
           return precoUnitario * quantidade;
       }
   }
