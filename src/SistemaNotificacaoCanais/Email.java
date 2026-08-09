package SistemaNotificacaoCanais;

public class Email implements CanalDeNotificacao{

   private boolean simularfalha;

   public Email (boolean simularfalha){
       this.simularfalha = simularfalha;
   }


    @Override
    public void enviar(String destinatario, String mensagem) throws Exception {

        if (simularfalha == true){
         throw new Exception("Falha ao enviar email!");
        }else {
            System.out.println("Mensagem enviada para " + destinatario + " :" + mensagem);
        }
    }
    }

