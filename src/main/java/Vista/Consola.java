package Vista;

import Controlador.TodaysDate;

public class Consola {

    public void mostrarFechaHora() {
        TodaysDate fecha = new TodaysDate();
        fecha.printDateAndTime();
    }
}
