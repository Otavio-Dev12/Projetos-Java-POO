package SistemaDeAcademia;
import java.time.LocalDate;

    public  class Instrutor extends Pessoa implements Avaliavel {

    private String especializacao;
    private String registroProfissional;
    private int anosExperiencia;
    private double salario;
    private int nota;

    public Instrutor (String nome, String cpf, String email, String telefone, LocalDate dataNascimento,
             String especializacao, String registroProfissional, int anosExperiencia, double salario){
        super(nome,cpf,email,telefone,dataNascimento);

      this.especializacao = especializacao;
      this.anosExperiencia = anosExperiencia;
      this.salario  = salario;
      this.registroProfissional = registroProfissional;

    }

    @Override
        public void exibirInformacao(){
        System.out.println("Especializaçao: " + getEspecializacao());
        System.out.println("Registro do profissional: " + getRegistroProfissional());
        System.out.println("Anos de experiencia: " + getAnosExperiencia());
        System.out.println("Salario: " + getSalario());

    }

    public String getEspecializacao(){
        return especializacao;

    }

    public void setEspecializacao(String especializacao){
        this.especializacao = especializacao;

    }

    public String getRegistroProfissional(){
        return registroProfissional;

    }

    public void setRegistroProfissional(String registroProfissional){
        this.registroProfissional = registroProfissional;

    }

    public int getAnosExperiencia(){
        return anosExperiencia;

    }

    public void setAnosExperiencia(int anosExperiencia){
        this.anosExperiencia = anosExperiencia;

    }

    public double getSalario(){
        return salario;

    }

    public void setSalario(double salario){
        this.salario = salario;
    }


    public int getNota(){
        return nota;
    }

    public void  setNota(int nota){
        this.nota = nota;

    }

    @Override
        public void avaliar(int nota) {
            this.nota = nota;
        }
    }
