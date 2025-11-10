package Exception;

public class DivisaoPorZero extends ArithmeticException {
    private int num1;
    private int num2;

    public DivisaoPorZero(int num1, int num2){
        super("Tentativa de divisão por zero");
        this.num1 = num1;
        this.num2 = num2;

        if (num2 == 0) {
            System.out.println("Erro detectado: denominador = 0");
        }
    }
}

