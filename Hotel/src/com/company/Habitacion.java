package com.company;

public class Habitacion {

    private int numhabitacion;
    private int cantidaddeusos;
    private boolean libres;

    /*
    Olvidé aclarar: cuando el atributo tiene más de una palabra,
    sí se pueden usar mayúsculas. La primera sí o sí debe ir en minúsculas
    pero a partir de la segunda, deben comenzar con mayúsculas.

    Disculpas por haber olvidado aclararlo!
     */

    public Habitacion (int numHabitacion){
        this.numHabitacion = numHabitacion;
        this.cantidaddeusos = 0;
        this.libres = true;
    }

    public int getCantidaddeusos() {
        return cantidaddeusos;
    }

    public int getNumHabitacion() {
        return numhabitacion;
    }

    public boolean isLibre() {
        return libres;
    }

    public void setNumHabitacion(int numeroHabitacion) {
        this.numhabitacion = numeroHabitacion;
    }

    public void setCantidaddeusos(int cantUsos) {
        this.cantidaddeusos = cantidaddeusos;
    }

    public void s(boolean libres) {
        this.libres = libre;
    }
    /*
    este método debe tener un nombre declarativo
     */
}