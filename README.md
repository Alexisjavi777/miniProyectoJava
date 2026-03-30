# Sistema de Refugio de Animales - Bootcamp POO

## Descripción
Este proyecto marca la transición del paradigma estructurado (C++) hacia la Programación Orientada a Objetos (POO) utilizando Java. En esta etapa, el sistema de gestión evoluciona para utilizar clases, objetos, encapsulamiento, herencia y polimorfismo, permitiendo un código más organizado y escalable en comparación con proyectos anteriores en C++.

## Objetivo
El propósito de este desarrollo es aplicar los pilares de la POO en un entorno real dentro de Visual Studio Code, buscando resolver la organización de datos mediante **Clases y Objetos** (`Animal`, `Perro`, `Gato`), junto con el uso de **Herencia y Polimorfismo** para definir comportamientos específicos según la especie además de la gestión de colecciones dinámicas mediante `ArrayList`y el manejo de errores en tiempo de ejecución mediante **Excepciones** (`try/catch`).

## Contenido / Funcionalidades
El sistema implementa las siguientes capacidades de Java:

### Clase Animal
Definición de la plantilla base con atributos protegidos y métodos comunes.

### Encapsulamiento
Uso de modificadores de acceso (`private`) y métodos `get/set` para proteger la integridad de los datos.

### Herencia
Creación de clases especializadas (`Perro` y `Gato`) que extienden de la clase padre.

### Polimorfismo
Sobrescritura del método `mostrarAccion()` para que cada animal responda de forma única.

### Interacción por Consola
Uso de la clase `Scanner` para gestionar un menú interactivo de 7 opciones.

### Lógica de Adopción
Método especializado para buscar animales por ID y cambiar su estado a **"ADOPTADO"** automáticamente.

## Estructura
El proyecto en VS Code está organizado siguiendo las convenciones de Java:

- **App.java:** Clase principal, menú interactivo y manejo de excepciones.
- **Refugio.java:** Clase gestora que administra el `ArrayList<Animal>` y la lógica de búsqueda.
- **Animal.java, Perro.java, Gato.java:** Definición de la jerarquía de clases y comportamientos.
- **Atributos:** ID, Nombre, Edad, Tipo y Estado.

## Herramientas utilizadas
- **Lenguaje:** Java (JDK 17 o superior)
- **IDE:** Visual Studio Code
- **Extensiones:** Extension Pack for Java (Microsoft)
- **Control de Versiones:** Git y GitHub

## Autor
**Alexis Javier Liquinchana Cayo**  
Estudiante del Bootcamp "Programación de Cero a POO"  

## Observaciones

- El sistema incluye validaciones para evitar edades negativas y errores por entradas incorrectas.
- Se implementa una lógica de estados donde un animal adoptado mantiene su registro pero cambia su disponibilidad.