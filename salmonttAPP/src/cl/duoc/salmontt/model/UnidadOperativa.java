package cl.duoc.salmontt.model;

/**
 * Clase abstracta que representa una unidad operativa dentro de la empresa Salmontt.
 * Actúa como la superclase de todas las unidades específicas, permitiendo aplicar
 * polimorfismo y extender el sistema de manera flexible.
 */
public abstract class UnidadOperativa {

    // Nombre de la unidad operativa (centro de cultivo, planta de proceso, etc.)
    private String nombre;

    // Ubicación geográfica donde se encuentra la unidad
    private String ubicacion;

    //Constructor base para todas las unidades operativas.
    public UnidadOperativa(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    //Obtiene el nombre de la unidad operativa.
    public String getNombre() {
        return nombre;
    }

    //Obtiene la ubicación de la unidad operativa.
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Método abstracto que debe ser sobrescrito por todas las subclases.
     * Permite mostrar la información correspondiente según el tipo de unidad.
     * Se invocará de forma polimórfica desde referencias del tipo UnidadOperativa.
     */
    public abstract void mostrarInformacion();
}
