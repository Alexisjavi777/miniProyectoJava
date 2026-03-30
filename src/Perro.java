// Clase hija que representa a un perro
public class Perro extends Animal {
    public Perro(int id, String nombre, int edad) {
        // Llamamos al constructor de la clase Animal
        super(id, nombre, edad, "Perro");
    }

    @Override
    public void mostrarAccion() {
        System.out.println("El perro " + getNombre() + " dice: Guau guau (Mueve la cola)");
    }
}