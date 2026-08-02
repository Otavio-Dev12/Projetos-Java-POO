package SistemaDeAcademia;
import java.time.LocalDate;
import java.util.ArrayList;



public class Treino implements Avaliavel {

     private String nomedoTreino;
     private LocalDate dataCriacao;
     private String nivelDifuculdade;
     private  Aluno aluno;
     private  Instrutor instrutor;
     private ArrayList<Exercicio> exercicios;
     private int nota;

    public Treino(String nomedoTreino, LocalDate dataCriacao, String nivelDifuculdade,
                  Aluno aluno, Instrutor instrutor){

           this.nomedoTreino = nomedoTreino;
           this.nivelDifuculdade = nivelDifuculdade;
           this.dataCriacao = dataCriacao;
           this.aluno = aluno;
           this.instrutor = instrutor;
           this.exercicios = new ArrayList<Exercicio>();

     }


    public void adicionarexercicio(Exercicio exercicio){
     exercicios.add(exercicio);
    }


    public String getNomedoTreino(){
         return  nomedoTreino;

     }

     public void setNomedoTreino(String nomedoTreino){
         this.nomedoTreino = nomedoTreino;

     }

     public LocalDate getDataCriacao(){
         return dataCriacao;

     }

     public void setDataCriacao(LocalDate dataCriacao){
         this.dataCriacao = dataCriacao;

     }

     public String getNivelDifuculdade(){
         return nivelDifuculdade;

     }

     public void setNivelDifuculdade(String nivelDifuculdade){
         this.nivelDifuculdade = nivelDifuculdade;
     }

     public Aluno getAluno(){
         return aluno;

     }

     public void setAluno(Aluno aluno){
        this.aluno = aluno;
     }
      public Instrutor getInstrutor(){
         return instrutor;
      }

     public void setInstrutor(Instrutor instrutor){
         this.instrutor = instrutor;

     }

     public ArrayList<Exercicio> getExercicios(){
         return exercicios;

     }

     public void setExercicios(ArrayList<Exercicio> exercicios){
        this.exercicios = exercicios;
     }

     @Override
    public void avaliar(int nota) {
      this.nota = nota;
    }

    public int getNota(){
         return nota;
    }

    public void setNota(int nota){
         this.nota = nota;
    }
}
