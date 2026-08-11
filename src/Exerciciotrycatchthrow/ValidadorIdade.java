package Exerciciotrycatchthrow;

  public class ValidadorIdade {

  public void validar(int idade)throws Exception{

      if (idade < 0){
          throw new Exception("Idade não pode ser negativa!");
      } else if (idade > 120){
          throw new Exception("Idade invalida, muito alta!");
      } else  {
          System.out.println("Idade valida! "  + idade);
      }

}

}
