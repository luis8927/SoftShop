
package clases;


public class Opcion {
    private final String valor;
    private final String descripcion;

    public Opcion(String valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
   
    
    
}
