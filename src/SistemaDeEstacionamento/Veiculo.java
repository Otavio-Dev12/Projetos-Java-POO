package SistemaDeEstacionamento;

public abstract class Veiculo {

  private String cor;
  private String placa;
  private String modelo;
  private  int ano;

  public Veiculo(String cor,String placa, String modelo, int ano){
      this.cor = cor;
      this.ano = ano;
      this.modelo = modelo;
      this.placa = placa;
  }


      public String getCor(){
      return cor;
  }

  public void setCor(String cor){
      this.cor = cor;
  }

  public String getPlaca(){
      return  placa;

  }

  public void setPlaca(String placa){
      this.placa = placa;
  }

  public String getModelo(){
      return modelo;

  }

  public void setModelo(String modelo){
      this.modelo = modelo;
  }

  public int getAno(){
      return ano;

  }

  public void setAno(int ano){
      this.ano = ano;

  }


  public abstract  int getVagasNecessarias();


 public void exibirInformacao(){

 }

 public void sair(){

 }

}
