package SISTEMADELOJAVIRTUAL;

    public class ItemPedido {

    private  String produto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String produto, int quantidade, double precoUnitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // metodos

    public double getSubtotal(){
         return quantidade * precoUnitario;
    }

    // getters e setters

    public String getProduto(){
        return produto;

    }

    public void setProduto(String produto){
        this.produto = produto;
    }

    public int getQuantidade(){
        return quantidade;

    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }

}
