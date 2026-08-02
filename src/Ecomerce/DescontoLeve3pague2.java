package Ecomerce;

    public class DescontoLeve3pague2 implements  Desconto {

        @Override
        public double aplicar(double precoUnitario, int unidade){

       int grupos = unidade /3;
       int sobra = unidade % 3;
       int unidadesPagas = ( grupos * 2 ) + sobra;
       double  total = unidadesPagas * precoUnitario;
       return total;
   }






}
