package ContaBancaria;

public class ContaBancaria {
    private int numConta;
    private double saldo;

    //Criando construtores e Getters (para settar e ver propiedades)

    public ContaBancaria(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
