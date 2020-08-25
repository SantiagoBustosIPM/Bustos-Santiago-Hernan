

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Materia {
    private String nombre;
    private String profesor;
    private HashMap<Alumno,ArrayList<Double>> listaNotas ;

    public Materia(){
        this.nombre     = "Ingles";
        this.profesor   = "Maneto";
        this.listaNotas = new HashMap<Alumno,ArrayList<Double>>();
    }

    public Materia(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaNotas = new HashMap<Alumno,ArrayList<Double>>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return this.profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public HashMap<Alumno,ArrayList<Double>> getListaNotas() {
        return this.listaNotas;
    }

    public void setListaNotas(HashMap<Alumno,ArrayList<Double>> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public String toString(Alumno alumno) {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", profesor='" + getProfesor() + "'" +
                ", listaNotas='" + getListaNotas().get(alumno) + "'" +
                "}";
    }

    /*-----*/

    public void agregarNota(Alumno alumno, Double nota){
        ArrayList<Double> listaNueva = new ArrayList<>();
        for (HashMap.Entry <Alumno,ArrayList<Double>> aux : listaNotas.entrySet()) {
            if(aux.getKey() == alumno){
                listaNueva  = aux.getValue();
                listaNueva.add(nota);
                listaNotas.put(alumno, listaNueva);
            }
        }
    }

    public void menorNota(Alumno alumno){
        Double menorNota = 11.0;
        for(HashMap.Entry <Alumno,ArrayList<Double>> aux : listaNotas.entrySet()){
            if(aux.getKey() == alumno){
                for(Double nota_aux : aux.getValue()){
                    if(nota_aux < menorNota) menorNota = nota_aux;
                }
                System.out.println("Peor nota de " + alumno.getApellido() + " en " + this.getNombre() + ": " + menorNota);
            }
        }
    }

    public void mayorNota(Alumno alumno){
        Double mayorNota = 0.0;
        for(HashMap.Entry <Alumno,ArrayList<Double>> aux : listaNotas.entrySet()){
            if(aux.getKey() == alumno){
                for(Double nota_aux : aux.getValue()){
                    if(nota_aux > mayorNota) mayorNota = nota_aux;
                }
                System.out.println("Mejor nota de " + alumno.getApellido() + " en " + this.getNombre() + ": " + mayorNota);
            }
        }
    }


}

