package cl.duoc.salmontt.model;

public abstract class UnidadOperativa {

    private String nombre;
    private String ubicacion;

    public UnidadOperativa(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public abstract void mostrarInformacion();
}
