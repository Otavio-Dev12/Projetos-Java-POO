package SistemaDeEstacionamento;

  public class Estacionamento {

      private int totalVagas;
      private int vagasOcupadas;


      public Estacionamento(int totalVagas,int vagasOcupadas){
        this.vagasOcupadas = vagasOcupadas;
        this.totalVagas = totalVagas;

    }

    public void estacionar(Veiculo veiculo){
        int VagasNecessarias = veiculo.getVagasNecessarias();

        if (totalVagas >= vagasOcupadas + VagasNecessarias){
           vagasOcupadas  = vagasOcupadas + VagasNecessarias;
           System.out.println("Vagas ocupadas com sucesso!" );
       }else {
           System.out.println("infelizmente não temos vagas disponiveis!");
       }
    }

    public void sair(Veiculo veiculo){
     int vagasNecessarias = veiculo.getVagasNecessarias();

      if (vagasOcupadas >=  vagasNecessarias){
          vagasOcupadas = vagasOcupadas - vagasNecessarias;
          System.out.println("Veiculo saiu! Vagas liberada: " +  vagasNecessarias);
      }else {
          System.out.println("Erro: não ha vagas ocupadas suficiente para liberar esse veiculos!");
      }
    }

    public int  vagasDisponiveis(){
        int resultado = totalVagas - vagasOcupadas;
        return resultado;
    }

    public int getTotalVagas(){
        return totalVagas;
    }

    public void setTotalVagas(int totalVagas){
        this.totalVagas = totalVagas;
    }

    public int getVagasOcupadas(){
        return vagasOcupadas;
    }

    public void setVagasOcupadas(int vagasOcupadas){
        this.vagasOcupadas = vagasOcupadas;
    }










}

