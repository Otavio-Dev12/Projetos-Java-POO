package Ecomerce;

import java.util.ArrayList;

public class Carrinho {

   ArrayList<Produto> produtos;


   public Carrinho(){
       this.produtos = new ArrayList<Produto>();
   }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList produtos){
       this.produtos = produtos;
    }


    public void  adicionarproduto (Produto produto){
      produtos.add(produto);

   }

   public double calcularTotal(){
     double total = 0;
      for (Produto produto:produtos){
          total = total + produto.calcularPrecoFinal();
      }
         return total;













   }



























}
