package SistemaNotificacaoCanais;

  public class Principal {

  public void main()  {


      Usuario usuario1 = new Usuario("Otavio", "(34)998893149", "tata12@gmail.com");

      Email email1 = new Email(true);
      usuario1.AdicionarCanais(email1);
      SMS sms1 = new SMS(true);
      usuario1.AdicionarCanais(sms1);
      Push push1 = new Push(true);
      usuario1.AdicionarCanais(push1);

      ServiçoDenotificacao serviçoDenotificacao1 = new ServiçoDenotificacao();

      try {
          serviçoDenotificacao1.enviar( usuario1, "Mensagem enviada! ");
      }catch (Exception e ){
          System.out.println("Falha ao mandar mensagem! "+ e.getMessage());
      }

  }
















}
