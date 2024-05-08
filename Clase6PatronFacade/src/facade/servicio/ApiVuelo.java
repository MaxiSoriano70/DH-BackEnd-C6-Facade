package facade.servicio;

import facade.model.Hotel;
import facade.model.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApiVuelo {

    List<Vuelo> vuelos;

    public ApiVuelo() {
        this.vuelos = new ArrayList<>();
        cargarVuelos();
    }

    public void cargarVuelos(){
        vuelos.add(new Vuelo("Buenos Aires","Los Angeles" , LocalDate.of(2024,06,15),LocalDate.of(2024,06,20) ));
        vuelos.add(new Vuelo("Santiago", "Paris", LocalDate.of(2024,07,10),LocalDate.of(2024,07,15) ));
        vuelos.add(new Vuelo("Buenos Aires", "Los Angeles", LocalDate.of(2024,06,15),LocalDate.of(2024,06,20)));
        vuelos.add(new Vuelo("Santiago", "Los Angeles", LocalDate.of(2024,06,16),LocalDate.of(2024,06,21)));
        vuelos.add(new Vuelo("Buenos Aires", "Los Angeles",LocalDate.of(2024,06,17),LocalDate.of(2024,06,22)));
        vuelos.add(new Vuelo("Santiago", "Los Angeles",LocalDate.of(2024,06,18),LocalDate.of(2024,06,23)));
        vuelos.add(new Vuelo("Buenos Aires", "Los Angeles",LocalDate.of(2024,06,19),LocalDate.of(2024,06,24)));
        vuelos.add(new Vuelo("Santiago", "Los Angeles",LocalDate.of(2024,06,20),LocalDate.of(2024,06,25)));
    }
    public List<Vuelo> buscarVuelo(LocalDate fechaIngreso, LocalDate fechaEgreso, String origen, String destino){
        List<Vuelo> vuelosResultados = new ArrayList<>();
        Vuelo vueloABuscar = new Vuelo(origen, destino, fechaIngreso, fechaEgreso);
        for (Vuelo vuelo : vuelos) {
            if(vuelo.equals(vueloABuscar)){
                System.out.println("El vuelo esta disponible");
                vuelosResultados.add(vuelo);
            }
        }
        return vuelosResultados;
    }
}
