package com.company;

import java.util.HashSet;

public class EquipoDeFutbol {
    private String nombre;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int goles;
    private int puntosDelTorneo;
    private String estadio;

    public EquipoDeFutbol(String nombre,int partidosGanados, int partidosPerdidos, int partidosEmpatados,int goles, int puntosDelTorneo,String estadio){
        this.nombre=nombre;
        this.partidosGanados=partidosGanados;
        this.partidosPerdidos=partidosPerdidos;
        this.partidosEmpatados=partidosEmpatados;
        this.goles=goles;
        this.puntosDelTorneo=puntosDelTorneo;
        this.estadio=estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public int getGoles() {
        return goles;
    }

    public int getPuntosDelTorneo() {
        return puntosDelTorneo;
    }

    public String getEstadio() {
        return estadio;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public void setPuntosDelTorneo(int puntosDelTorneo) {
        this.puntosDelTorneo = puntosDelTorneo;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
}
