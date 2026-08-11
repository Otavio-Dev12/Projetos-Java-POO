package Exerciciotrycatchthrow;

public class PrincipalSague {

  public static void main(){

      ValidadorSague validadorSague1 = new ValidadorSague();

     try {
         validadorSague1.sacar(500);
     } catch (Exception e) {
         System.out.println("Erro: " + e.getMessage());
     }

     try {
         validadorSague1.sacar(2000);
     } catch (Exception e) {
         System.out.println("Erro: " + e.getMessage());
     }

     try {
         validadorSague1.sacar(-500);
     } catch (Exception e) {
         System.out.println("Erro: " + e.getMessage());
     }

     try {
         validadorSague1.sacar(100);
     } catch (Exception e) {
         System.out.println("Erro: " + e.getMessage());
     }

      try {
          validadorSague1.sacar(100);
      } catch (Exception e) {
          System.out.println("Erro: " + e.getMessage());
      }









  }




}
