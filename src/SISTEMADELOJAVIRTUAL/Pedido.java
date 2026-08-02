package SISTEMADELOJAVIRTUAL;

import java.util.ArrayList;

public class Pedido {

   private int numero;
   private String cliente;
   ArrayList<ItemPedido> itens ;
   private boolean finalizado;
   public Pedido( int numero, String cliente, boolean finalizado){
       this.cliente = cliente;
       this.numero = numero;
       this.itens = new ArrayList<ItemPedido>();
       this.finalizado = finalizado;
   }

   public void adicionarItem(ItemPedido itemPedido ){
       itens.add(itemPedido);
   }

   public void removerItem(ItemPedido item ){
     itens.remove(item);
   }

   public double calcularTotal(){
     double total = 0;
       for ( ItemPedido ItemPedido: itens) {
           total = total + ItemPedido.getSubtotal();
       }
        return total;
   }

   public boolean isFinalizado(){
     return finalizado;
   }


    public String getCliente(){
       return cliente;
   }

   public void setCliente(String cliente){
       this.cliente = cliente;

   }

   public int getNumero(){
       return  numero;

   }

   public void setNumero(int numero){
       this.numero = numero;
   }

  public ArrayList<ItemPedido> getitens(){
       return itens;
  }

  public void setItens(ArrayList itens){
       this.itens = itens;
  }


  public void setFinalizado( boolean finalizado){
       this.finalizado = finalizado;
  }





}
