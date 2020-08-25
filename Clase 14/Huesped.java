package ***;

public class Huesped extends Persona {
    private int cantidad_de_visitas;
    
    public Huesped() {
        super();
        cantidad_de_visitas = 1;
    }

    public Huesped(int cantidad_de_visitas,String nombre,String apellido,int edad,int dni) {
        super(nombre,apellido,edad,dni);
        this.cantidad_de_visitas = cantidad_de_visitas;
    }

    public int getCantidad_de_visitas() {
        return this.cantidad_de_visitas;
    }

    public void setCantidad_de_visitas(int cantidad_de_visitas) {
        this.cantidad_de_visitas = cantidad_de_visitas;
    }

    public puedeEstarSolo(){
        boolean resultado = this.mayorDeEdad();
        return resultado;
    }

}