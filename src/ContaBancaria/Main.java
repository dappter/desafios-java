package ContaBancaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1, 1000);
        ContaBancaria conta2 = new ContaBancaria(2, 2000);
        ContaBancaria conta3 = new ContaBancaria(3, 4000);
        ContaBancaria conta4 = new ContaBancaria(4, 3000);
        ContaBancaria conta5 = new ContaBancaria(5, 2200);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);


        //cria uma variável "contaMaiorSaldo" e coloca na primeira posição do array
        ContaBancaria contaMaiorSaldo = contas.get(0);

        for (ContaBancaria pegaConta : contas){
            //se as contas que percorre o array ter o saldo maior que
            // a contaMaiorSaldo (variável para maior conta) faça =
            if (pegaConta.getSaldo() > contaMaiorSaldo.getSaldo()){
                //a conta ser a com maior saldo ---> contaMaiorSaldo
                contaMaiorSaldo = pegaConta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
