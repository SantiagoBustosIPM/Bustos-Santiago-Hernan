

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Colegio{

    HashSet<Materia> listaMaterias = new HashSet<>();
    HashSet<Alumno>  listaAlumnos  = new HashSet<>();

    public static void main(String[] args) {

        HashMap<Alumno,ArrayList<Double>> listaNotas     = new HashMap<Alumno,ArrayList<Double>>();
        HashMap<Alumno,ArrayList<Double>> listaNotas2    = new HashMap<Alumno,ArrayList<Double>>();
        ArrayList<Double>                 notas          = new ArrayList<Double>();
        ArrayList<Double>                 notas2         = new ArrayList<Double>();

        
        Materia materia  = new Materia("Ingles","Maneto");
        Materia materia2 = new Materia("Biologia","Manuel");
        
        Alumno alumno1 = new Alumno("Manuel","Rodriguez",17,123456789);

        alumno1.getListaPromedios().put(materia,0.0);
        alumno1.getListaPromedios().put(materia2,0.0);

        notas.add(6.0);
        notas.add(8.0);
        notas.add(9.0);

        notas2.add(3.0);
        notas2.add(5.0);
        notas2.add(8.0);

        listaNotas.put(alumno1, notas);
        materia.setListaNotas(listaNotas);
        materia.agregarNota(alumno1,10.0);

        listaNotas2.put(alumno1, notas2);
        materia2.setListaNotas(listaNotas2);
        materia2.agregarNota(alumno1,2.0);


        alumno1.calcularPromedios();

        System.out.println(alumno1.getApellido() + " " + materia.toString(alumno1));
        System.out.println(alumno1.getApellido() + " " + materia2.toString(alumno1));
        materia.mayorNota(alumno1);
        materia.menorNota(alumno1);
        materia2.mayorNota(alumno1);
        materia2.menorNota(alumno1);

        /*----------------------------------------------------------------------------*/
        notas.clear();
        notas.add(2.0);
        notas.add(4.0);
        notas.add(5.5);

        Alumno   alumno2 = new Alumno("Rossana","Manolarga",17,987654321);
                 alumno2.getListaPromedios().put(materia,0.0);
        listaNotas.put(alumno2, notas);
        materia.setListaNotas(listaNotas);
        materia.agregarNota(alumno1,1.0);

        alumno2.calcularPromedios();

        System.out.println(alumno2.getApellido() + " " + materia.toString(alumno2));
        materia.mayorNota(alumno2);
        materia.menorNota(alumno2);

        
        System.out.println("Alumnos de Ingles: " +  materia.getListaNotas().size());
        
        System.out.println(alumno1.getNombre() + ": " + alumno1.toString());
        System.out.println(alumno2.getNombre() + ": " + alumno2.toString());

        alumno1.menorPromedio();
        alumno1.mayorPromedio();

        alumno2.menorPromedio();
        alumno2.mayorPromedio();

        alumno1.promedioFinal();
        alumno2.promedioFinal();



    }

}