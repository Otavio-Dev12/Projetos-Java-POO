package SistemaDeEstacionamento;

    public class Onibus extends Veiculo {


   private int capacidadePassageiros;

        public Onibus (String cor, String modelo , String placa , int ano,int capacidadePassageiros) {
            super(cor, placa, modelo, ano);

            this.capacidadePassageiros = capacidadePassageiros;
        }

       public int getCapacidadePassageiros(){
            return capacidadePassageiros;

       }

       public void setCapacidadePassageiros(int capacidadePassageiros){
            this.capacidadePassageiros = capacidadePassageiros;
       }


    public void exibirInformacao(){
        System.out.println("A cor do onibus e: " + getCor());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano: " + getAno());
        System.out.println("A capacidade total do onibus e: " + getCapacidadePassageiros());

    }


 @Override
        public int getVagasNecessarias(){
            return 5;
 }




}
