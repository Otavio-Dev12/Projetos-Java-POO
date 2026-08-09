package SistemaNotificacaoCanais;

import java.util.ArrayList;

public class Usuario  {


    private ArrayList<CanalDeNotificacao> canais ;
    private String nome;
    private String telefone;
    private  String email;

    public Usuario( String nome, String telefone, String email){

        this.canais = new ArrayList<>();
        this.nome = nome;
        this.telefone =  telefone;
        this.email = email;
    }

    void AdicionarCanais(CanalDeNotificacao Canal){
        canais.add(Canal);
    }

    public ArrayList<CanalDeNotificacao> getCanais(){
        return canais;

    }

    public void setCanais(ArrayList canais){
        this.canais = canais;

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getTelefone(){
        return telefone;

    }

    public void setTelefone(String telefone){
        this.telefone = telefone;

    }

    public String getEmail(){
        return email;

    }

    public void setEmail(String email){
        this.email = email;
    }


    public void AdicionarCanais() {
    }
}
