package mx.com.animales;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = {
                new Perro("Firulais", 2),
                new Gato("Michi", 4),
                new Vaca("Lola", 5)
        };

        for (Animal animal: animales){
            animal.mostrarInfromacion();
            animal.hacerSonido();

            Movible m = (Movible) animal;
            m.moverse();
            System.out.println("\n");
        }
    }
}
