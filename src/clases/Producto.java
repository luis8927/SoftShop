
package clases;


public class Producto {
    private String idProducto;
	private String descripcion;
	private int precio;
	private int iva;
	private String nota;
	
	
	public Producto(String idProducto, String descripcion, int precio, int iva, String nota ) {
		this.idProducto  = idProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.iva = iva;
		this.nota = nota;
	}
	
	
	public String getIdProducto() {
		return 	idProducto;
		
	}	
		
	public String getDescripcion() {
		return 	descripcion;
	}	
		
		
	public int  getPrecio() {
		return  precio;
	}	
	
	
	public int  getIva() {
		return 	iva;
	}
	
	
	public String getNota() {
		return 	nota;
	}
	
	
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public void setNota(String nota) {
		this.nota = nota;
	}
    
        
        @Override
        public String toString() {
        return idProducto + "|"
                + descripcion + "|"
                + precio + "|"
                + iva + "|"
                + nota;
    }
}
