package Ecomerce;

    public class Produto {

    String nome;
    double precoUnitario;
    int quantidade;
    Desconto desconto;

   public Produto(String nome, double precoUnitario, int quantidade, Desconto desconto){
       this.desconto = desconto;
       this.quantidade = quantidade;
       this.nome = nome;
       this.precoUnitario = precoUnitario;
   }

   public void exibirInformacao(){
       System.out.println("Nome do produto: " + getNome());
       System.out.println("Preço: "  + getPrecoUnitario());
       System.out.println("Quantidade: " + getQuantidade());
       System.out.println("Desconto: " + getDesconto());
   }





 public String getNome(){
       return nome;
 }

 public void setNome(String nome){
       this.nome = nome;
 }

 public double getPrecoUnitario(){
       return precoUnitario;

 }

 public void setPrecoUnitario(double precoUnitario){
       this.precoUnitario = precoUnitario;
 }

 public int getQuantidade(){
       return quantidade;
 }

 public void setQuantidade(int quantidade){
       this.quantidade = quantidade;
 }

 public Desconto getDesconto(){
       return desconto;
 }

 public void setDesconto(Desconto desconto){
       this.desconto = desconto;

 }

 public double calcularPrecoFinal(){
   return desconto.aplicar(precoUnitario, quantidade);

 }

}
