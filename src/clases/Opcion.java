
package clases;
/**
 * Clase Opcion toma datos de descrpcion y valor
 * @author LUISFERNANDO
 * @version 1.0
 */

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
