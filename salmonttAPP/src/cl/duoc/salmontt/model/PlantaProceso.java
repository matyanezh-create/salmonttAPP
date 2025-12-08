package cl.duoc.salmontt.model;

/**
 * Representa una planta de proceso dentro de la empresa Salmontt.
 * Extiende la clase UnidadOperativa y sobrescribe el método mostrarInformacion()
 * para desplegar datos específicos de este tipo de unidad.
 */
public class PlantaProceso extends UnidadOperativa {

    // Capacidad de procesamiento expresada en toneladas por día
    private int capacidadToneladas;

    //Constructor que inicializa los datos de una planta de proceso.
    public PlantaProceso(String nombre, String ubicacion, int capacidadToneladas) {
        super(nombre, ubicacion);  // Llama al constructor de la superclase
        this.capacidadToneladas = capacidadToneladas;
    }

    /**
     * Sobrescritura del método abstracto definido en UnidadOperativa.
     * Muestra por consola toda la información correspondiente a esta planta.
     * Este método se invoca polimórficamente a través de referencias
     * del tipo UnidadOperativa.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("=== Planta de Proceso ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ubicación: " + getUbicacion());
        System.out.println("Capacidad (toneladas/día): " + capacidadToneladas);
        System.out.println("------------------------------");
    }
}
