//Clase hija que representa un Gato.
public class Gato extends Animal {
    public Gato(int id, String nombre, int edad) {
        // Llamamos al constructor de la clase Animal
        super(id, nombre, edad, "Gato");
    }

    @Override
    public void mostrarAccion() {
        System.out.println("El gato " + getNombre() + " dice: Miau miau (Ronronea)");
    }
}