# MundoAnimal

Reto individual de Generation México: herencia, polimorfismo y diseño de clases en Java.

## Descripción

MundoAnimal es una aplicación de consola que muestra la información de distintos animales (nombre y edad), el sonido que hace cada uno y su forma de desplazarse.

El proyecto aplica estos conceptos de programación orientada a objetos:

- **Clase abstracta:** `Animal` es la base común y no se puede instanciar directamente.
- **Herencia:** `Perro`, `Gato`, `Vaca` y `Caballo` extienden de `Animal`.
- **Sobrescritura:** cada clase hija implementa su propio `hacerSonido()` con `@Override`.
- **Interfaz:** `Movible` define el método `moverse()`, que cada animal implementa a su manera.
- **Polimorfismo:** `Main` recorre un arreglo `Animal[]` e invoca los mismos métodos sin usar `if/else` para decidir el comportamiento de cada animal.

## Estructura del proyecto

```
MundoAnimal/
├── .gitignore
├── README.md
└── src/
    └── mx/com/animales/
        ├── Animal.java    (clase abstracta base)
        ├── Perro.java
        ├── Gato.java
        ├── Vaca.java
        ├── Caballo.java   (reto extra)
        ├── Movible.java   (interfaz)
        └── Main.java      (punto de entrada)
```

## Cómo ejecutarlo

1. Verifica que tengas instalado un JDK (Java 8 o superior).
2. Clona el repositorio:
   ```bash
   git clone https://github.com/DiegoY2do/MundoAnimal.git
   ```
3. Abre la carpeta del proyecto en tu IDE (IntelliJ IDEA, Eclipse o VS Code).
4. Ejecuta la clase `Main` del paquete `mx.com.animales`.

También puedes compilar y ejecutar desde la terminal, estando en la carpeta del proyecto:

```bash
javac -d out src/mx/com/animales/*.java
java -cp out mx.com.animales.Main
```

## Ejemplo de salida

```
El nombre es: Firulais y su edad es 2
Wuau Wuau
Corre

El nombre es: Michi y su edad es 4
Miiiaauuu
Camina sigilosamente

El nombre es: Lola y su edad es 5
Muuuuuuu
Camina muy lento

El nombre es: Pepe y su edad es 3
Hiiiiiiiiiieeee
Galopa
```
