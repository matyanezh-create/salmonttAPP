package cl.duoc.salmontt.ui;

import cl.duoc.salmontt.data.GestorUnidades;

public class Main {
    public static void main(String[] args) {

        GestorUnidades gestor = new GestorUnidades();

        System.out.println("Mostrando todas las unidades operativas:");
        System.out.println();

        gestor.mostrarUnidades();
    }
}
