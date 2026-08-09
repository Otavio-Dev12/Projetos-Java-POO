package SistemaNotificacaoCanais;

   public class Push implements CanalDeNotificacao{

  private boolean simularfalha;

  public Push( boolean simularfalha){
      this.simularfalha = simularfalha;
  }

       @Override
       public void enviar(String destinatario, String mensagem) throws Exception {

           if (simularfalha == true){
               throw new Exception("Falha ao enviar push");
           }else {
               System.out.println("Mensagem do Push enviada com sucesso para " +  destinatario + ":" + mensagem);
           }
       }
   }
