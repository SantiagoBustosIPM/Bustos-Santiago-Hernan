

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private int dni;
    private int telefono;
    private int cantVisitas;

    public Persona (String nombre, String apellido, int edad, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.cantVisitas = 0;
    }

    public Persona(){
        this.nombre = "Manuel";
        this.apellido = "Huapi";
        this.edad = 45;
        this.dni = 483124124;
        this.cantVisitas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public int getCantVisitas() {
        return cantVisitas;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCantVisitas(int cantVisitas) {
        this.cantVisitas = cantVisitas;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}





