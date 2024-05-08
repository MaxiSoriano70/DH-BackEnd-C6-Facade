package facade.servicio;

import java.time.LocalDate;

public interface IFacadeServicio {
    boolean buscarServicios(String origen, String destino, LocalDate fechaInicio, LocalDate fechaFin);
}
