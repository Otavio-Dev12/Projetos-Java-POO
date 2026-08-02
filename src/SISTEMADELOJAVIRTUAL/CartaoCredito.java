package SISTEMADELOJAVIRTUAL;

   public  class CartaoCredito implements Pagamento {

       private float limite;

       public CartaoCredito(float limite){
           this.limite = limite;
       }
       @Override
       public boolean realizarPagamento(double valor) {
           System.out.println("Pagamento de R$ " + valor + "Realizado no Cartão de credito.");

          if (valor <= limite ) {
              System.out.println("Limite suficiente, compra aprovada!" );
              limite -= valor;
              return true;
          } else {
              System.out.println("Limite insuficiente, compra negada!");
              return false;
          }
       }

   }
