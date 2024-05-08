package facade.servicio;

import facade.model.Hotel;
import facade.model.Vuelo;

import java.time.LocalDate;
import java.util.List;

public class FacadeServicio implements IFacadeServicio{
    ApiHotel apiHotel;
    ApiVuelo apiVuelo;

    public FacadeServicio() {
        this.apiHotel = new ApiHotel();
        this.apiVuelo = new ApiVuelo();
    }

    @Override
    public boolean buscarServicios(String origen, String destino, LocalDate fechaInicio, LocalDate fechaFin) {
        boolean respuesta = false;
        List<Hotel> respuestaHoteles = apiHotel.buscarHotel(fechaInicio,fechaFin,destino);
        List<Vuelo> respuestaVuelos = apiVuelo.buscarVuelo(fechaInicio,fechaFin,origen,destino);
        if (!respuestaVuelos.isEmpty() && !respuestaHoteles.isEmpty()){
            respuesta = true;
        }
        return respuesta;
    }
}
