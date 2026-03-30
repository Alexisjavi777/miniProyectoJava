import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Refugio refugio = new Refugio();
        int opcion = 0;

        do {
            try {
                System.out.println("\n--- MENU REFUGIO DE ANIMALES ---");
                System.out.println("1. Registrar perro");
                System.out.println("2. Registrar gato");
                System.out.println("3. Mostrar animales");
                System.out.println("4. Buscar animal por id");
                System.out.println("5. Cambiar estado de un animal");
                System.out.println("6. Ejecutar accion o sonido de un animal");
                System.out.println("7. Salir");
                System.out.print("Seleccione una opcion: ");
                
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("ID: "); int idp = sc.nextInt();
                        System.out.print("Nombre: "); String nomp = sc.next();
                        System.out.print("Edad: "); int edadp = sc.nextInt();
                        if (edadp >= 0) refugio.registrarPerro(idp, nomp, edadp);
                        else System.out.println("Error: Edad no puede ser negativa."); 
                        break;
                    case 2:
                        System.out.print("ID: "); int idg = sc.nextInt();
                        System.out.print("Nombre: "); String nomg = sc.next();
                        System.out.print("Edad: "); int edadg = sc.nextInt();
                        if (edadg >= 0) refugio.registrarGato(idg, nomg, edadg);
                        else System.out.println("Error: Edad no puede ser negativa.");
                        break;
                    case 3:
                        refugio.mostrarAnimales();
                        break;
                    case 4:
                        System.out.print("Ingrese ID a buscar: ");
                        Animal buscado = refugio.buscarPorId(sc.nextInt());
                        if (buscado != null) buscado.mostrarInfo();
                        else System.out.println("Animal no encontrado."); 
                        break;
                    case 5: 
                        System.out.print("Ingrese el ID del animal que va a ser adoptado: ");
                        int idAdop = sc.nextInt();
                        refugio.adoptarAnimal(idAdop); 
                        break;
                    case 6:
                        System.out.print("ID del animal para accion: ");
                        Animal accion = refugio.buscarPorId(sc.nextInt());
                        if (accion != null) accion.mostrarAccion(); 
                        else System.out.println("ID inexistente.");
                        break;
                    case 7:
                        System.out.println("Cerrando sistema...");
                        break;
                    default:
                        System.out.println("Opcion invalida."); 
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada no valida. Ingrese solo numeros.");
                sc.nextLine(); // Limpiar buffer
            }
        } while (opcion != 7);
        sc.close();
    }
}