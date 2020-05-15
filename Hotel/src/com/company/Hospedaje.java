package com.company;
import java.util.Date;

public class Hospedaje {


    private Date fechadeEntrada;
    private Date fechadeSalida;
    private Huesped huesped1;
    private Huesped huesped2;
    private Habitacion habitacion;
    private int cantidaddeDias;
    private double costo;

    public Hospedaje(Date fechadeEntrada, Date fechadeSalida, Huesped huesped1, Habitacion habitacion, int cantidaddeDias){
        Huesped huesped2 = new Huesped("NULL", "NULL", 0, 0);
        this.fechadeEntrada = fechadeEntrada;
        this.fechadeSalida = fechadeSalida;
        this.huesped1 = huesped1;
        this.huesped2 = huesped2;
        this.habitacion = habitacion;
        this.cantidaddeDias = cantidaddeDias;
        if (cantidaddeDias>30){
            this.costo = (cantidaddeDias*545)*0.75;
        }
        else{
            this.costo = cantidaddeDias*545;
        }
        this.habitacion.setLibre(false);
        /*
        falta definir este método
         */
    }

    public Hospedaje(Date fechaEntrada, Date fechaSalida, Huesped huesped1, Huesped huesped2, Habitacion habitacion, int cantidaddeDias){
        this.fechadeEntrada = fechaEntrada;
        this.fechadeSalida = fechaSalida;
        this.huesped1 = huesped1;
        this.huesped2 = huesped2;
        this.habitacion = habitacion;
        this.cantidaddeDias = cantidaddeDias;
        if (cantidaddeDias>30){
            this.costo = (cantidaddeDias*785)*0.75;
        }
        else{
            this.costo = cantidaddeDias*785;
        }
        this.habitacion.setLibre(false);
    }

    public Date getFechadeEntrada() {
        return fechadeEntrada;
    }

    public Date getFechadeSalida() {
        return fechadeSalida;
    }

    public Huesped gethuesped1() {
        return huesped1;
    }

    public Huesped gethuesped2() {
        return huesped2;
    }

    public Habitacion gethabitacion() {
        return habitacion;
    }

    public int getcantidaddeDias() {
        return cantidaddeDias;
    }

    public double getcosto() {
        return costo;
    }
    public void setcantidaddeDias(int cantDias) {
        this.cantidaddeDias = cantDias;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechadeEntrada = fechaEntrada;
    }

    public void setFechadeSalida(Date fechaSalida) {
        this.fechadeSalida = fechaSalida;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setHuesped1(Huesped huesped1) {
        this.huesped1 = huesped1;
    }

    public void setHuesped2(Huesped huesped2) {
        this.huesped2 = huesped2;
    }

    /*
    bien!
     */
}
