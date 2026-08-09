package SistemaNotificacaoCanais;

   public interface CanalDeNotificacao {

      void enviar(String destinatario, String mensagem) throws Exception;



   }
