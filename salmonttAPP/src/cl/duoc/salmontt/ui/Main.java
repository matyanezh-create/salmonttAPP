package cl.duoc.salmontt.ui;

import cl.duoc.salmontt.data.GestorUnidades;

//Clase principal del sistema.
public class Main {

    //Método principal que inicia la ejecución del programa.
    public static void main(String[] args) {

        // Instancia del gestor encargado de manejar las unidades operativas
        GestorUnidades gestor = new GestorUnidades();

        System.out.println("Mostrando todas las unidades operativas:");
        System.out.println();

        // Llamada polimórfica: cada unidad ejecuta su propia versión del método
        gestor.mostrarUnidades();
    }
}
