package SistemaNotificacaoCanais;

    public class SMS implements CanalDeNotificacao{

    private boolean simularfalha;

    public SMS(boolean simularfalha){
        this.simularfalha = simularfalha;
    }

        @Override
        public void enviar(String destinatario, String mensagem) throws Exception {
           if (simularfalha == true){
               throw new Exception("Falha ao enviar SMS!");
           }else {
               System.out.println("Mensagem SMS enviada com sucesso para " + destinatario +  ":" + mensagem);
           }
        }
    }
