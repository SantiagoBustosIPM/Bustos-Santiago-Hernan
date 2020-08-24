package com.company;

public class Partido {
    private String fecha;
    private String hora;
    private String estadio;
    private String resultado;
    private String rivales;
    private String localOVisitante;

    public Partido(String fecha, String hora,String estadio, String resultado, String rivales,String localOVisitante){
        this.fecha=fecha;
        this.hora=hora;
        this.estadio=estadio;
        this.resultado=resultado;
        this.rivales=rivales;
        this.localOVisitante=localOVisitante;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getResultado() {
        return resultado;
    }

    public String getRivales() {
        return rivales;
    }

    public String getLocalOVisitante() {
        return localOVisitante;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setRivales(String rivales) {
        this.rivales = rivales;
    }

    public void setLocalOVisitante(String localOVisitante) {
        this.localOVisitante = localOVisitante;
    }
}
