package ***;

public class Hijo extends Persona {
    private String Escuela;
    private String Juego_favorito;


    public Hijo() {
        super();
        Escuela = "Moruli";
        Juego_favorito = "Gta V";
    }


    public Hijo(String Escuela, String Juego_favorito, String nombre,String apellido,int edad,int dni) {
        super(nombre,apellido,edad,dni);
        this.Escuela = Escuela;
        this.Juego_favorito = Juego_favorito;
    }


    public String getEscuela() {
        return this.Escuela;
    }


    public void setEscuela(String Escuela) {
        this.Escuela = Escuela;
    }


    public String getJuego_favorito() {
        return this.Juego_favorito;
    }


    public void setJuego_favorito(String Juego_favorito) {
        this.Juego_favorito = Juego_favorito;
    }

}