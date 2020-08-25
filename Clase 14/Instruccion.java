package ***;

public class Instruccion {
    private String operacion;
    
    public Instruccion() {  
        operacion = "+";
    }

    public Instruccion(String operacion) {
        this.operacion = operacion;
    }

    public String getOperacion() {
        return this.operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
}
