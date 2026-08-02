package SISTEMADELOJAVIRTUAL;

  public class Produto {
  // atributos
  private  int ID;
  private String nome;
  private float preco;
  private int estoque;

  public Produto(int ID, String nome, float preco, int estoque){
      this.ID = ID;
      this.estoque = estoque;
      this.nome = nome;
      this.preco = preco;
  }


// metodos

  public void adicionarEstoque(int quantidade ){
    this.estoque += quantidade;
  }

  public void removerEstoque(int quantidade){
    if (quantidade< this.estoque){
      throw new IllegalArgumentException("estoque insuficiente");
    }
      this.estoque -= quantidade;
  }

  // metodos getter e setters

    public String getNome(){
      return nome;
    }

    public void setNome( String nome){
      this.nome = nome;
    }

    public int getID(){
      return ID;

    }

    public void setID(int ID){
      this.ID = ID;

    }

    public int getEstoque(){
      return estoque;

    }

    public void setEstoque(int Estoque ){
      this.estoque = estoque;
    }

    public float getPreco(){
      return preco;

    }

    public void setPreco(float preco){
      this.preco = preco;

    }







}
