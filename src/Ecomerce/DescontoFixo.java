package Ecomerce;

  public  class DescontoFixo implements Desconto{

  double descontofixo;

  public DescontoFixo(double descontofixo){
      this.descontofixo = descontofixo;

  }

  @Override
  public double aplicar(double precoUnitario, int unidade) {

      double total = precoUnitario * unidade;
      double totalDesconto = total - descontofixo;
      return totalDesconto;


  }


}
