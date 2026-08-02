package SistemaDeAcademia;
import java.time.LocalDate;
import  java.time.Period;


    public abstract class Pessoa {

   private String nome;
   private LocalDate dataNascimento ;
   private String cpf;
   private String email;
   private String telefone;

   public Pessoa(String nome, String cpf, String email, String telefone, LocalDate dataNascimento){
      this.nome = nome;
      this.cpf = cpf;
      this.email = email;
      this.telefone = telefone;
      this.dataNascimento = dataNascimento;

   }
 //metodos
  public int  calcularIdade(){
  LocalDate hoje =  LocalDate.now();
  Period diferenca = Period.between(dataNascimento,hoje);
  int idade = diferenca.getYears();

     return idade;

  }

  public abstract void exibirInformacao();

 public String getNome(){
     return nome;
 }

 public void setNome(String Nome){
     this.nome = nome;
 }

 public String getCpf(){
     return cpf;

 }

 public void setCpf(String cpf){
     this.cpf = cpf;
 }

 public LocalDate getDataNascimento(){
     return dataNascimento;

 }

 public void setDataNascimento(LocalDate dataNascimento){
     this.dataNascimento = dataNascimento;

 }

 public String getEmail(){
     return email;

 }

 public void setEmail(String email){
     this.email = email;

 }

 public String getTelefone(){
     return telefone;

 }

 public void setTelefone(String telefone){
     this.telefone = telefone;

 }










 }


