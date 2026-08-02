package ContaBancaria;

public abstract class Conta {

    // atributos
        private int numero;
        private String titular;
        private double saldo;

        // construtor
        public Conta(int numero , String titular, double saldo) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = saldo;
        }

        // método depositar
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito realizado com sucesso!");

            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }

        // método abstrato
        public abstract void sacar(double valor);

        // exibir dados
        public void exibirDados() {
            System.out.println("\n----------MOSTRAR DADOS!-----------");
            System.out.println("Número: " + numero);
            System.out.println("Titular: " + titular);
            System.out.println("Saldo: R$ " + saldo);
        }

        // getters e setters
        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    }



































