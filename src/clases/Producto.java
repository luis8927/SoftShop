
package clases;

/**
 * Clase Producto donde se encuentran todos los datos para ser almacenados 
 * @author LUISFERNANDO
 * @version 1.0
 */
public class Producto {
    private String idProducto;
	private String descripcion;
	private int precio;
	private int iva;
	private String nota;
	
/**
 * aqui se declaran todos los parametros de la clase Producto
 * @param idProducto
 * @param descripcion
 * @param precio
 * @param iva
 * @param nota 
 */	
	public Producto(String idProducto, String descripcion, int precio, int iva, String nota ) {
		this.idProducto  = idProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.iva = iva;
		this.nota = nota;
	}
	
	/**
         * Este es el get para obtener los datos del idProducto
         * @return 
         */
	public String getIdProducto() {
		return 	idProducto;
		
	}	
	/**
         * Este es el get para obtener los datos de la descripcion
         * @return 
         */	
	public String getDescripcion() {
		return 	descripcion;
	}	
		
	/**
         * Este es el get para obtener los datos del Precio
         * @return 
         */	
	public int  getPrecio() {
		return  precio;
	}	
	
	/**
         * Este es el get para obtener los datos del Iva
         * @return 
         */
	public int  getIva() {
		return 	iva;
	}
	
	/**
         * Este es el get para obtener los datos de la Nota
         * @return 
         */
	public String getNota() {
		return 	nota;
	}
	
	/**
         * Este es el set para inicializar la variable IdProducto
         * @param idProducto 
         */
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	/**
         * Este es el set para inicializar la variable Descripcion
         * @param descripcion 
         */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
         * Este es el set para inicializar la variable Precio
         * @param precio 
         */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
         * Este es el set para inicializar la variable Iva
         * @param iva 
         */
	public void setIva(int iva) {
		this.iva = iva;
	}
	/**
         * Este es el set para inicializar la variable Nota
         * @param nota 
         */
	public void setNota(String nota) {
		this.nota = nota;
	}
    
        /**
         * Retorna los datos ingresados a las variables
         * @return 
         */
        @Override
        public String toString() {
        return idProducto + "|"
                + descripcion + "|"
                + precio + "|"
                + iva + "|"
                + nota;
    }
}
