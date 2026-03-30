// Clase que administra la coleccion de animales del refugio.
import java.util.ArrayList;

public class Refugio {
    // Lista dinamica para almacenar animales (Perros o Gatos)
    private ArrayList<Animal> listaAnimales;

    public Refugio() {
        this.listaAnimales = new ArrayList<>();
    }

    // Metodo para agregar un perro
    public void registrarPerro(int id, String nombre, int edad) {
        listaAnimales.add(new Perro(id, nombre, edad));
        System.out.println("Perro registrado correctamente");
    }

    // Metodo para agregar un gato
    public void registrarGato(int id, String nombre, int edad) {
        listaAnimales.add(new Gato(id, nombre, edad));
        System.out.println("Gato registrado correctamente");
    }

    // Metodo para mostrar todos los animales 
    public void mostrarAnimales() {
        if (listaAnimales.isEmpty()) {
            System.out.println("No hay animales registrados en el refugio.");
            return;
        }

        for (Animal animal : listaAnimales) {
            animal.mostrarInfo(); 
            System.out.println("-----------------------");
        }
    }

    // Metodo fundamental: buscar un animal por su ID
    public Animal buscarPorId(int id) {
        for (Animal animal : listaAnimales) {
            if (animal.getId() == id) {
                return animal;
            }
        }
        return null;
    }

    public void adoptarAnimal(int id) {
        Animal animal = buscarPorId(id);

        if (animal == null) {
            System.out.println("Error: No existe un animal con ese ID");
            return;
        }

        if (animal.getEstado().equals("ADOPTADO")) {
            System.out.println("Este animal ya ha sido adoptado previamente.");
            return;
        }

        // Fijamos el estado automaticamente 
        animal.setEstado("ADOPTADO");
        System.out.println("Operacion exitosa: El animal " + animal.getNombre() + " ha sido ADOPTADO.");
    }
}