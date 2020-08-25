package ***;

public class InstruccionConNumero extends Instruccion{
    int numero;

    public InstruccionConNumero() {
        super();
        numero = 5;
    }

    public InstruccionConNumero(int numero,String operacion) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public operacionAEjecutar(){
        String operacion = this.getOperacion();
        return operacion;
    }

}