public class Animal {
    // Atributos privados para mantener el encapsulamiento
    private int id;
    private String nombre;
    private int edad;
    private String tipo;
    private String estado;

    // Constructor
    public Animal(int id, String nombre, int edad, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.estado = "ACTIVO"; 
    }

    // Getters y Setters para encapsulamiento
    public int getId() { 
        return id; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public int getEdad() { 
        return edad; 
    }
    public String getTipo() { 
        return tipo; 
    }
    public String getEstado() { 
        return estado; 
    }
    public void setEstado(String estado) { 
        this.estado = estado; 
    }

    // Metodo para ser sobrescrito (Polimorfismo) 
    public void mostrarAccion() {
        System.out.println("El animal realiza una accion general.");
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad + " | Tipo: " + tipo + " | Estado: " + estado);
    }
}