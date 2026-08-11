package Exerciciotrycatchthrow;

  public class ValidadorSague {

      public  double saldo = 500;

      public void sacar(double valor)throws Exception{

      if (valor <= 0 ){
          throw new  Exception("Valor de sague invalido!");
      } if (valor > saldo ){
          throw new Exception("Saldo insuficiente!");
      }

       saldo -= valor;

          System.out.println("Saque realizado!");
          System.out.println("Saldo atual: " + saldo);
  }





}
