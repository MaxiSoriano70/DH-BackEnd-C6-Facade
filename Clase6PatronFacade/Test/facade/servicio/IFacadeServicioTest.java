package facade.servicio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class IFacadeServicioTest {

    @Test
    @DisplayName("Testar que exista el servicio")
    void existeServicio(){

        IFacadeServicio facadeServicio = new FacadeServicio();
        boolean respuesta = facadeServicio.buscarServicios("Buenos Aires","Los Angeles" , LocalDate.of(2024,06,15),LocalDate.of(2024,06,20));

        assertTrue(respuesta);
    }

}