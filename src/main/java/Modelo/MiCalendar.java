package Modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MiCalendario{

    private Calendar fecha;

    // Constructor: inicializa con la fecha y hora actual
    public Calendar() {
        fecha = new GregorianCalendar();
    }

    // Obtener día
    public int obtenerDia() {
        return fecha.get(Calendar.DAY_OF_MONTH);
    }

    // Obtener mes (nota: enero = 0, por eso se suma 1)
    public int obtenerMes() {
        return fecha.get(Calendar.MONTH) + 1;
    }

    // Obtener año
    public int obtenerAnio() {
        return fecha.get(Calendar.YEAR);
    }

    // Obtener hora
    public int obtenerHora() {
        return fecha.get(Calendar.HOUR_OF_DAY);
    }

    // Obtener minuto
    public int obtenerMinuto() {
        return fecha.get(Calendar.MINUTE);
    }

    // Obtener segundo
    public int obtenerSegundo() {
        return fecha.get(Calendar.SECOND);
    }

    // Mostrar fecha y hora completa
    public void mostrarFechaYHora() {
        System.out.println("Fecha: " + obtenerDia() + "/" + obtenerMes() + "/" + obtenerAnio());
        System.out.println("Hora: " + obtenerHora() + ":" + obtenerMinuto() + ":" + obtenerSegundo());
    }
}

