package cl.duoc.salmontt.model;

public class PlantaProceso extends UnidadOperativa {

    private int capacidadToneladas;

    public PlantaProceso(String nombre, String ubicacion, int capacidadToneladas) {
        super(nombre, ubicacion);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Planta de Proceso ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ubicación: " + getUbicacion());
        System.out.println("Capacidad (toneladas/día): " + capacidadToneladas);
        System.out.println("------------------------------");
    }
}
