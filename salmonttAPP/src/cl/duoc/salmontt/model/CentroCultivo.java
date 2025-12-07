package cl.duoc.salmontt.model;

public class CentroCultivo extends UnidadOperativa {

    private int numeroJaulas;

    public CentroCultivo(String nombre, String ubicacion, int numeroJaulas) {
        super(nombre, ubicacion);
        this.numeroJaulas = numeroJaulas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Centro de Cultivo ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ubicación: " + getUbicacion());
        System.out.println("Número de jaulas: " + numeroJaulas);
        System.out.println("------------------------------");
    }
}
