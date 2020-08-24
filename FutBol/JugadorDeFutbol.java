package com.company;

public class JugadorDeFutbol {
    private String nombre;
    private String apellido;
    private int edad;
    private int numeroDeRemera;
    private String posicionJugador;

    public JugadorDeFutbol(String nombre, String apellido, int edad,int numeroDeRemera, String posicionJugador){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.numeroDeRemera=numeroDeRemera;
        this.posicionJugador=posicionJugador;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroDeRemera() {
        return numeroDeRemera;
    }

    public String getPosicionJugador() {
        return posicionJugador;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroDeRemera(int numeroDeRemera) {
        this.numeroDeRemera = numeroDeRemera;
    }

    public void setPosicionJugador(String posicionJugador) {
        this.posicionJugador = posicionJugador;
    }
}
