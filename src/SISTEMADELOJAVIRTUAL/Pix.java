package SISTEMADELOJAVIRTUAL;

   public  class Pix implements Pagamento{

       @Override
   public boolean realizarPagamento(double valor){
       System.out.println("Pagamento R$ " + valor + " Realizado via PIX.");
       return true;

   }
}
