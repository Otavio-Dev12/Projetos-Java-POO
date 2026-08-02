package SistemaDeEstacionamento;

public class principalEstacionamento {

   public void main (){

       Estacionamento estacionamento = new Estacionamento(10,0);
       Carro carro1 = new Carro("preto ", "bmw", "mku-1458", 2015);
       estacionamento.estacionar(carro1);
       carro1.exibirInformacao();
       System.out.println("Vagas necessarias para carro: " + carro1.getVagasNecessarias());
       System.out.println("Vagas disponivesi para carro: " + estacionamento.vagasDisponiveis());
       estacionamento.sair(carro1);
       System.out.println("Vagas disponiveis apos o carro sair: " + estacionamento.vagasDisponiveis());

       System.out.println("---------------------------");


       Moto moto1 = new Moto("Branca ", "1100", "mju-1458 ", 2000);
       estacionamento.estacionar(moto1);
       moto1.exibirInformacao();
       System.out.println("Vagas necesarias para motos: " + moto1.getVagasNecessarias());
       System.out.println( "Vagas disponiveis para moto: " + estacionamento.vagasDisponiveis());
       estacionamento.sair(moto1);
       System.out.println("Vagas disponivel apos moto sair: " + estacionamento.vagasDisponiveis());


       System.out.println("-----------------------------");


       Onibus onibus1 = new Onibus("Azul", "mercedes", "juy-7854 ",2010,40);
       estacionamento.estacionar(onibus1);
       onibus1.exibirInformacao();
       System.out.println("Vagas necessaria para onibus: " + onibus1.getVagasNecessarias());
       System.out.println("Vagas disponiveis para  onibus: " + estacionamento.vagasDisponiveis());
       estacionamento.sair(onibus1);
       System.out.println("vagas disponiveis apos onibus sair: " + estacionamento.vagasDisponiveis());
   }


















}
