package SistemaNotificacaoCanais;

    public class ServiçoDenotificacao {


       public void enviar( Usuario usuario, String Mensagem) throws Exception {

            boolean enviado = false;

            for (CanalDeNotificacao canal : usuario.getCanais()) {

                try {
                    canal.enviar(usuario.getEmail(), Mensagem);
                    enviado = true;
                    break;
                } catch (Exception e) {

                }
            }

            if (enviado == false) {
                throw new Exception("Falha ao mandar mensagem!");
            }

        }


        }












