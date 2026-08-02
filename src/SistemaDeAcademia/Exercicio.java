package SistemaDeAcademia;



  public class Exercicio {

   private String nomedoExercicio;
   private int series;
   private int repeticao;
   private double pesoUsado;
   private int tempoDescanso;

   public Exercicio(String nomedoExercicio, int series, int repeticao,
                    double pesoUsado, int tempoDescanso){
      this.nomedoExercicio = nomedoExercicio;
      this.pesoUsado = pesoUsado;
      this.repeticao = repeticao;
      this.tempoDescanso = tempoDescanso;
      this.series = series;

   }


   public String getNomedoExercicio(){
      return nomedoExercicio;

   }

   public void setNomedoExercicio(String nomedoExercicio){
      this.nomedoExercicio = nomedoExercicio;
   }

   public int getSeries(){
      return series;

   }

   public void setSeries(int series){
      this.series = series;

   }

   public int getRepeticao(){
      return repeticao;

   }

   public void setRepeticao(int repeticao){
      this.repeticao = repeticao;

   }

   public double getPesoUsado(){
      return pesoUsado;

   }

   public void setPesoUsado(double pesoUsado){
      this.pesoUsado = pesoUsado;

   }

   public int getTempoDescanso(){
      return tempoDescanso;

   }

   public void setTempoDescanso(int tempoDescanso){
      this.tempoDescanso = tempoDescanso;
   }







}
