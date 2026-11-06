package mx.com.animales;

public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfromacion(){
        System.out.println("El nombre es: " + nombre + " y su edad es " +edad);
    }

    public abstract void hacerSonido();
}
