

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Alumno extends Persona {
	
    private HashMap<Materia, Double> listaPromedios;

    public Alumno() {
		
        this.listaPromedios = new HashMap<Materia, Double>();
    }

    public Alumno(String nombre, String apellido, int edad, int dni) {
		
        super(nombre, apellido, edad, dni);
        this.listaPromedios = new HashMap<Materia, Double>();
    }

    public HashMap<Materia, Double> getListaPromedios() {
		
        return this.listaPromedios;
    }

    public void setListaPromedios(HashMap<Materia, Double> listaPromedios) {
		
        this.listaPromedios = listaPromedios;
    }

    public String toString() {
		
        String lista_promedios = "";
        for (HashMap.Entry<Materia, Double> promedio_aux : listaPromedios.entrySet()){
            lista_promedios += promedio_aux.getKey().getNombre() + "= " + promedio_aux.getValue() + ";";
        }
        return "{" +
                " Apellido='" + getApellido() + "'" +
                " Listado Promedios ='" + lista_promedios + "'" +
                "}";
    }

    public void promedioFinal(){
        Double promedioFinal = 0.0;
        for (HashMap.Entry <Materia, Double> aux : listaPromedios.entrySet()){
            promedioFinal += aux.getValue();
        }
        promedioFinal /= listaPromedios.size();
        System.out.println("Promedio de " + this.getApellido() + ": " + promedioFinal);
    }

    public void menorPromedio(){
        Double menorPromedio = 11.0;
        String nombreMateria = "";
        for(HashMap.Entry <Materia, Double> aux : listaPromedios.entrySet()){
            if(aux.getValue() < menorPromedio) {
                menorPromedio = aux.getValue();
                nombreMateria = aux.getKey().getNombre();
            }
        }
        System.out.println("Peor promedio " + this.getApellido() + ": " +  menorPromedio + "(" + nombreMateria + ")");
    }

    public void mayorPromedio(){
        Double mayorPromedio = 0.0;
        String nombreMateria = "";
        for(HashMap.Entry <Materia, Double> aux : listaPromedios.entrySet()){
            if(aux.getValue() > mayorPromedio) {
                mayorPromedio = aux.getValue();
                nombreMateria = aux.getKey().getNombre();
            }
        }
        System.out.println("Mejor promedio " + this.getApellido() + ": " +  mayorPromedio + "(" + nombreMateria + ")");
    }

    public void promediar(Materia materia){
        Double promedio = 0.0;
        ArrayList<Double> listaNotas_aux = new ArrayList<>();
        listaNotas_aux = materia.getListaNotas().get(this);
        for(Double nota_aux : listaNotas_aux){
            promedio += nota_aux;
        }
        listaPromedios.replace(materia, promedio /= listaNotas_aux.size());
    }

    public void calcularPromedios(){
        for (HashMap.Entry<Materia, Double> aux : this.listaPromedios.entrySet()){
            this.promediar(aux.getKey());
        }
    }

}