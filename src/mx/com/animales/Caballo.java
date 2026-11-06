package mx.com.animales;

public class Caballo extends Animal implements Movible{
    public Caballo(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Hiiiiiiiiiieeee");
    }

    @Override
    public void moverse() {
        System.out.println("Galopa");
    }
}
