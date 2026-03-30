// Clase que administra la coleccion de animales del refugio.
import java.util.ArrayList;
public class Refugio {
    private ArrayList<Animal> listaAnimales;

    public Refugio() {
        this.listaAnimales = new ArrayList<>();
    }

    // Operaciones requeridas
    public void registrarPerro(int id, String nombre, int edad) {
        listaAnimales.add(new Perro(id, nombre, edad));
        System.out.println("Perro registrado con exito.");
    }

    public void registrarGato(int id, String nombre, int edad) {
        listaAnimales.add(new Gato(id, nombre, edad));
        System.out.println("Gato registrado con exito.");
    }

    public void mostrarAnimales() {
        if (listaAnimales.isEmpty()) {
            System.out.println("El refugio esta vacio.");
            return;
        }
        for (Animal a : listaAnimales) {
            a.mostrarInfo();
        }
    }

    public Animal buscarPorId(int id) {
        for (Animal a : listaAnimales) {
            if (a.getId() == id) return a;
        }
        return null;
    }

    public void cambiarEstado(int id, String nuevoEstado) {
        Animal a = buscarPorId(id);
        if (a != null) {
            a.setEstado(nuevoEstado);
            System.out.println("Estado actualizado correctamente.");
        } else {
            System.out.println("Error: No se encontro el animal con ID " + id);
        }
    }
}