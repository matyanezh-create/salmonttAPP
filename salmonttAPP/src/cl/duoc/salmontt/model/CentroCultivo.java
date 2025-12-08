package cl.duoc.salmontt.model;

/**
 * Representa un centro de cultivo dentro de la empresa Salmontt.
 * Es una subclase de UnidadOperativa y define atributos y comportamientos
 * específicos de este tipo de unidad.
 */
public class CentroCultivo extends UnidadOperativa {

    // Número de jaulas disponibles en el centro de cultivo
    private int numeroJaulas;

    //Constructor que inicializa los datos de un centro de cultivo.
    public CentroCultivo(String nombre, String ubicacion, int numeroJaulas) {
        super(nombre, ubicacion); // Inicializa los atributos heredados
        this.numeroJaulas = numeroJaulas;
    }

    /**
     * Sobrescritura del método abstracto definido en UnidadOperativa.
     * Muestra por consola la información correspondiente a un centro de cultivo.
     * Este método será invocado polimórficamente.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("=== Centro de Cultivo ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ubicación: " + getUbicacion());
        System.out.println("Número de jaulas: " + numeroJaulas);
        System.out.println("------------------------------");
    }
}
