package Animal;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Cachorro("dog", "vira-lata", "masculino");

        ArrayList<Animal> animaList = new ArrayList<>();
        animaList.add(animal);
        for (Animal animals : animaList){
            if (animals instanceof Cachorro){
                System.out.println("É um cachorro");
            }
            else {
                System.out.println("não é um cachorro");
            }
        }
    }
}
