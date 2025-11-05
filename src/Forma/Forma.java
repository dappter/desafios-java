//    Crie uma interface Forma
//    com um métod calcularArea()
//    Implemente a interface em duas classes, por exemplo, Circulo e Quadrado.
//    Em seguida, crie uma lista de formas (objetos da interface Forma)
//    e utilize um loop para calcular e imprimir a área de cada forma.



package Forma;

public interface Forma {

    double calcularArea();

}

class Circulo implements Forma {
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Quadrado implements Forma {
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
