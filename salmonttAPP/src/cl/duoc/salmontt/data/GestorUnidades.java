package cl.duoc.salmontt.data;

import cl.duoc.salmontt.model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorUnidades {

    private List<UnidadOperativa> lista;

    public GestorUnidades() {
        lista = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos() {
        lista.add(new CentroCultivo("Centro A", "Chiloé", 12));
        lista.add(new CentroCultivo("Centro B", "Aysén", 15));
        lista.add(new PlantaProceso("Planta Sur", "Puerto Montt", 80));
        lista.add(new PlantaProceso("Planta Norte", "Calbuco", 65));
        lista.add(new CentroCultivo("Centro C", "Quellón", 10));
    }

    public List<UnidadOperativa> obtenerUnidades() {
        return lista;
    }

    public void mostrarUnidades() {
        for(UnidadOperativa u : lista) {
            u.mostrarInformacion();
        }
    }
}
