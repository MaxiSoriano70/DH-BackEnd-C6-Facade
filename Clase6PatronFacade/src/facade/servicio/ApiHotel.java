package facade.servicio;

import facade.model.Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApiHotel {

    List<Hotel> hoteles;

    public ApiHotel() {
        this.hoteles = new ArrayList<>();
        cargarHoteles();
    }

    public void cargarHoteles(){
        hoteles.add(new Hotel(LocalDate.of(2024,06,15),LocalDate.of(2024,06,20), "Los Angeles" ));
        hoteles.add(new Hotel(LocalDate.of(2024,07,10),LocalDate.of(2024,07,15), "Paris" ));
        hoteles.add(new Hotel(LocalDate.of(2024,06,15),LocalDate.of(2024,06,20),"Los Angeles"));
        hoteles.add(new Hotel(LocalDate.of(2024,06,16),LocalDate.of(2024,06,21),"Paris"));
        hoteles.add(new Hotel(LocalDate.of(2024,06,17),LocalDate.of(2024,06,22),"Los Angeles"));
        hoteles.add(new Hotel(LocalDate.of(2024,06,18),LocalDate.of(2024,06,23),"Paris"));
        hoteles.add(new Hotel(LocalDate.of(2024,06,19),LocalDate.of(2024,06,24),"Los Angeles"));
        hoteles.add(new Hotel(LocalDate.of(2024,06,20),LocalDate.of(2024,06,25),"Paris"));
    }

    public List<Hotel> buscarHotel(LocalDate fechaIngreso, LocalDate fechaEgreso, String ciudad){
        List<Hotel> hotelesResultados = new ArrayList<>();
        Hotel hotelABuscar = new Hotel(fechaIngreso, fechaEgreso, ciudad);
        for (Hotel hotel : hoteles) {
            if(hotel.equals(hotelABuscar)){
                System.out.println("El Hotel esta disponible");
                hotelesResultados.add(hotel);
            }
        }
        return hotelesResultados;
    }
}
