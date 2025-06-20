package Modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MiCalendario {

    private Calendar fecha;

    // Constructor
    public MiCalendario() {
        fecha = new GregorianCalendar();
    }

    public int obtenerDia() {
        return fecha.get(Calendar.DAY_OF_MONTH);
    }

    public int obtenerMes() {
        return fecha.get(Calendar.MONTH) + 1; // enero = 0
    }

    public int obtenerAnio() {
        return fecha.get(Calendar.YEAR);
    }

    public int obtenerHora() {
        return fecha.get(Calendar.HOUR_OF_DAY);
    }

    public int obtenerMinuto() {
        return fecha.get(Calendar.MINUTE);
    }

    public int obtenerSegundo() {
        return fecha.get(Calendar.SECOND);
    }

    public void mostrarFechaYHora() {
        System.out.println("Fecha: " + obtenerDia() + "/" + obtenerMes() + "/" + obtenerAnio());
        System.out.println("Hora: " + obtenerHora() + ":" + obtenerMinuto() + ":" + obtenerSegundo());
    }
}
