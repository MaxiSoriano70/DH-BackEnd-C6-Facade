package facade.model;

import java.time.LocalDate;
import java.util.Objects;

public class Vuelo {
    private String origen;
    private String destino;
    private LocalDate fachaSalida;
    private LocalDate fechaLlegada;

    public Vuelo(String origen, String destino, LocalDate fachaSalida, LocalDate fechaLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.fachaSalida = fachaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFachaSalida() {
        return fachaSalida;
    }

    public void setFachaSalida(LocalDate fachaSalida) {
        this.fachaSalida = fachaSalida;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(origen, vuelo.origen) && Objects.equals(destino, vuelo.destino) && Objects.equals(fachaSalida, vuelo.fachaSalida) && Objects.equals(fechaLlegada, vuelo.fechaLlegada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origen, destino, fachaSalida, fechaLlegada);
    }
}
