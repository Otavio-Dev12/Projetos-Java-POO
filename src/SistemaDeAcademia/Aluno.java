package SistemaDeAcademia;
import java.time.LocalDate;

  public class Aluno extends Pessoa {

   private LocalDate dataMatricula;
   private String planoTreino;
   private double peso;
   private double altura;


   public Aluno(String nome, String cpf, String email, String telefone , LocalDate dataNascimento, LocalDate dataMatricula,
                String planoTreino, double peso, double altura) {
    super(nome, cpf, email, telefone , dataNascimento);

    this.dataMatricula = dataMatricula;
    this.planoTreino = planoTreino;
    this.peso = peso;
    this.altura = altura;

   }

 @Override
   public  void exibirInformacao(){
    System.out.println("Nome: " + getNome());
    System.out.println("CPF: " + getCpf());
    System.out.println("Email: " + getEmail());
    System.out.println("Telefone: " + getTelefone());
    System.out.println("Data de Nascimento: " + getDataNascimento());
    System.out.println("Data de matricula: " + getDataMatricula());
    System.out.println("plano de treino: " + getPlanoTreino());
    System.out.println("Peso: " + getPeso());
    System.out.println(" Altura: " + getAltura());

   }

   public LocalDate getDataMatricula(){
    return dataMatricula;

   }

   public void setDataMatricula(LocalDate dataMatricula){
    this.dataMatricula = dataMatricula;

   }

   public String getPlanoTreino(){
    return planoTreino;

   }

   public void setPlanoTreino(String planoTreino){
     this.planoTreino = planoTreino;

   }

   public double getPeso(){
    return peso;

   }

   public void setPeso(double peso){
    this.peso = peso;

   }

   public double getAltura(){
     return altura;

   }

   public void setAltura(double altura){
    this.altura  = altura;
   }









 }









