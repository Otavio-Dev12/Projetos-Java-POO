package Exerciciotrycatchthrow;


public class Principal {

  public static void main () throws Exception {

      ValidadorIdade validadorIdade1 = new ValidadorIdade();

      try {
          validadorIdade1.validar(-5);
      } catch (Exception e) {
          System.out.println("Erro: " + e.getMessage());
      }

     try {
         validadorIdade1.validar(150);
     } catch (Exception e) {
         System.out.println("Erro: " + e.getMessage());
     }

     try {
         validadorIdade1.validar(25);
     }catch (Exception e ){
         System.out.println("Erro: " + e.getMessage());
     }

}

}
