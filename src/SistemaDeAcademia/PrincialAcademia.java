package SistemaDeAcademia;
import java.time.LocalDate;

public class PrincialAcademia {


    public void main() {

        Academia academia = new Academia();
        Aluno aluno1 = new Aluno("Caio", "145256987", "caiozin@gmail.com", "34998893149"
                , LocalDate.of(2010, 2, 10),
                LocalDate.of(2015, 4, 2), "plano a ", 80.5, 160.0);

        try {
            academia.cadastrarAluno(aluno1);
        } catch (Exception e) {
            System.out.println("Não foi possivel cadastrar: " + e.getMessage());
        }

        System.out.println("---------------------------");
        aluno1.exibirInformacao();


        System.out.println("----------------------------------");
        Exercicio exercicio = new Exercicio("Treinamneto de costas", 14, 3, 10, 15);
        System.out.println("Nome do exercicio: " + exercicio.getNomedoExercicio());
        System.out.println("Quantidade de series: " + exercicio.getSeries());
        System.out.println("Quantidade de repetição: " + exercicio.getRepeticao());
        System.out.println("Peso usado nos exercicios: " + exercicio.getPesoUsado());
        System.out.println("Tempo de descanso: " + exercicio.getTempoDescanso());

        System.out.println("------------------------------------");
        Instrutor instrutor = new Instrutor("Tulio","14536978514", "tulio90@gmail.com.br",
                "34998893749",LocalDate.of(2000,12,12),"Fisucultorismo",
                "CRF-1458", 10, 4000.0);

        System.out.println("Nome do instrutor: " + instrutor.getNome());
        System.out.println("CPF: " + instrutor.getCpf());
        instrutor.exibirInformacao();

        System.out.println("-----------------------------------");

       Treino treino = new Treino("Treino de costas", LocalDate.of(2026,8,14),"Nivel medio" ,
                 aluno1 , instrutor );

       treino.adicionarexercicio(exercicio);
        System.out.println("Nome do treino: " + treino.getNomedoTreino());
        System.out.println("Criação do treino: " + treino.getDataCriacao());
        System.out.println("Dificuldade do treino: " + treino.getNivelDifuculdade());
        System.out.println("Aluno: " + treino.getAluno());
        System.out.println("Instrutor: " + treino.getInstrutor());






    }

}