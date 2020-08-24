import java.util.HashSet;


package ***;


public class Madre extends Persona {
	
    private String Empresa;
	
    private HashSet<Hijos> Lista_hijos;

    public Madre() {
        super();
        Empresa = "Movistar";
        Lista_hijos = new HashSet<Hijos>();
    }


    public Madre(String Empresa, HashSet<Hijos> Lista_hijos, String nombre,String apellido,int edad,int dni) {
        super(nombre,apellido,edad,dni);
        this.Empresa = Empresa;
        this.Lista_hijos = Lista_hijos;
    }


    public String getEmpresa() {
        return this.Empresa;
    }


    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }


    public HashSet<Hijos> getLista_hijos() {
        return this.Lista_hijos;
    }


    public void setLista_hijos(HashSet<Hijos> Lista_hijos) {
        this.Lista_hijos = Lista_hijos;
    }


    public ArrayList<> hijos_menores(){
		
        ArrayList<Hijos> lista_de_hijos_menores = new ArrayList<>();
		
        for(Hijo hijo_aux : this.getLista_hijos()){
			
            if(hijo_aux.getEdad() < 18){
				
                lista_de_hijos_menores.add(hijo_aux);
				
            }
        }
        return lista_de_hijos_menores;
    }

}