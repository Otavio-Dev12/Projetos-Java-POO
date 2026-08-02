package SistemaDeEstacionamento;

     public class Moto extends  Veiculo{


    public Moto(String cor, String modelo , String placa , int ano) {
        super(cor, placa, modelo, ano);

    }


    public void exibirInformacao(){
        System.out.println("Cor da moto: " + getCor());
        System.out.println("Modelo da moto: " + getModelo());
        System.out.println("Placa da moto: " + getPlaca());
        System.out.println("Ano da moto: " + getAno());
    }

    @Override
         public int getVagasNecessarias(){
        return 1;
}



}
