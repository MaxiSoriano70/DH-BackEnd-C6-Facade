package facade.model;

import java.time.LocalDate;
import java.util.Objects;

public class Hotel {
    private LocalDate fachaSalida;
    private LocalDate fechaSalida;
    private String ciudad;

    public Hotel(LocalDate fachaSalida, LocalDate fechaSalida, String ciudad) {
        this.fachaSalida = fachaSalida;
        this.fechaSalida = fechaSalida;
        this.ciudad = ciudad;
    }

    public LocalDate getFachaSalida() {
        return fachaSalida;
    }

    public void setFachaSalida(LocalDate fachaSalida) {
        this.fachaSalida = fachaSalida;
    }

    public LocalDate getFechaLlegada() {
        return fechaSalida;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaSalida = fechaLlegada;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(fachaSalida, hotel.fachaSalida) && Objects.equals(fechaSalida, hotel.fechaSalida) && Objects.equals(ciudad, hotel.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fachaSalida, fechaSalida, ciudad);
    }
}
