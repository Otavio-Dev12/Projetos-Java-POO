package SISTEMADELOJAVIRTUAL;

public class  Boleto implements Pagamento{

    public boolean pendente;

    @Override
    public boolean realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " Realizado no Boleto!, Porem o boleto" +
                " leva alguns dias para ser compensado!");
        return pendente;
    }
}
