package Controlador;

import Modelo.MiCalendario;

public class TodaysDate {


    String time;
    private int day;
    private int month;
    protected int year;


    public void printDateAndTime() {
        MiCalendario calendario = new MiCalendario();
        time = calendario.obtenerHora() + ":" + calendario.obtenerMinuto() + ":" + calendario.obtenerSegundo();
        day = calendario.obtenerDia();
        month = calendario.obtenerMes();
        year = calendario.obtenerAnio();

        System.out.println("Hora: " + time);
        System.out.println("Fecha: " + day + "/" + month + "/" + year);
    }
}
