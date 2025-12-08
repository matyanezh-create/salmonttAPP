package cl.duoc.salmontt.data;

import cl.duoc.salmontt.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar y almacenar las distintas unidades operativas
 * de la empresa Salmontt.
 * Permite centralizar la carga, acceso y recorrido de los objetos,
 * aplicando polimorfismo mediante el uso de la superclase UnidadOperativa.
 */
public class GestorUnidades {

    // Lista polimórfica que almacena diferentes tipos de unidades operativas
    private List<UnidadOperativa> lista;

    /**
     * Constructor del gestor.
     * Inicializa la colección y carga los datos de ejemplo.
     */
    public GestorUnidades() {
        lista = new ArrayList<>();
        cargarDatos();
    }

    /**
     * Método interno que carga datos estáticos en la colección.
     * Agrega instancias de CentroCultivo y PlantaProceso para demostrar
     * el funcionamiento polimórfico solicitado en la actividad.
     */
    private void cargarDatos() {
        lista.add(new CentroCultivo("Centro A", "Chiloé", 12));
        lista.add(new CentroCultivo("Centro B", "Aysén", 15));
        lista.add(new PlantaProceso("Planta Sur", "Puerto Montt", 80));
        lista.add(new PlantaProceso("Planta Norte", "Calbuco", 65));
        lista.add(new CentroCultivo("Centro C", "Quell
