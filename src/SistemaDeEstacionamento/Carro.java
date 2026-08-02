package SistemaDeEstacionamento;

import java.time.LocalDate;

public class Carro extends Veiculo {

 private  String nomeMotorista;
 private LocalDate dataDareserva;

 public Carro(String cor, String modelo , String placa , int ano){
     super(cor,placa ,modelo,ano);
      this.nomeMotorista = nomeMotorista;
      this.dataDareserva = dataDareserva;
 }

 public void  exibirInformacao(){
  System.out.println("Cor do carro: " + getCor());
  System.out.println("Modelo do carro: " + getModelo());
  System.out.println("Placa do carro: " + getPlaca());
  System.out.println("Ano do carro: " + getAno());
 }



 @Override
    public int getVagasNecessarias(){
     return 1;
 }


}
