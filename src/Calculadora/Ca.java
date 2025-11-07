package Calculadora;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ca{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação que você quer fazer: 1-'+' / 2-'-' / 3-'*'");
        double escolha = scanner.nextInt();
        if (escolha == 1){
            System.out.println("Escolha um número para somar: ");
            double n1 = scanner.nextDouble();
            System.out.println("Escolha um número para somar: ");
            double n2 = scanner.nextDouble();

            double resultado = n1 + n2;

            System.out.println(resultado);


        } else if (escolha == 2) {
            System.out.println("Escolha um número para subitrair: ");
            double n1 = scanner.nextDouble();
            System.out.println("Escolha um número para subitrair: ");
            double n2 = scanner.nextDouble();

            double resultado = n1 - n2;
            System.out.println(resultado);
        }
        else {
            System.out.println("Escolha um número para multiplicar: ");
            double n1 = scanner.nextDouble();
            System.out.println("Escolha um número para multiplicar: ");
            double n2 = scanner.nextDouble();

            double resultado = n1 * n2;
            System.out.println(resultado);
        }
    }
}
