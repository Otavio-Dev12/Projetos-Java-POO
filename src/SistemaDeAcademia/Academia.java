package SistemaDeAcademia;

import java.util.ArrayList;

     public class Academia {

    ArrayList<Aluno>alunos;
    ArrayList<Treino> treinos;
    ArrayList<Instrutor>instrutors;



    public Academia(){
        this.instrutors = new ArrayList<>();
        this.treinos = new ArrayList<>();
        this.alunos = new ArrayList<>();
}


    public void cadastrarAluno(Aluno aluno) throws Exception {
       boolean cpfjaexisti = false;
    for (Aluno a : alunos){
        if (a.getCpf().equals(aluno.getCpf())) {
            cpfjaexisti = true;
    }
}
     if (cpfjaexisti) {
             throw new Exception("Erro: esse cpf ja esta cadastrado!");
         }

        else{
        alunos.add(aluno);
        System.out.println("cpf adicionado com sucesso! ");
    }

}

    public void cadastrarInstrutor(Instrutor instrutor) throws Exception{
     instrutors.add(instrutor);
        System.out.println("Cadastrar Instrutores: " + instrutor.getNome());
}

    public void cadastrarTreino(Treino treino){
      treinos.add(treino);
        System.out.println("Cadastrar Treino: " + treino.getNomedoTreino());
}


}
