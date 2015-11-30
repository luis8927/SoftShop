
package clases;

import java.util.Date;
/**
 * Esta clase define el formulario cliente
 * @author LUISFERNANDO
 * @version 1.0.
 */

public class Cliente {
    private String idCliente;
	private int idTipo;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	private int ciudad;
	private Date fechaNacimiento;
	private Date fechaIngreso;

        /**
         * Aqui se generan los parametros de la clase cliente
         * @param idCliente
         * @param idTipo
         * @param nombres
         * @param apellidos
         * @param direccion
         * @param telefono
         * @param ciudad
         * @param fechaNacimiento
         * @param fechaIngreso 
         */
    public Cliente(String idCliente, int idTipo, String nombres, String apellidos, String direccion, String telefono, int ciudad, Date fechaNacimiento, Date fechaIngreso) {
        this.idCliente = idCliente;
        this.idTipo = idTipo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }
/**
 * Este es el get para obtener datos de la variable cliente 
 * @return 
 */
    public String getIdCliente() {
        return idCliente;
    }
/**
 * Este es el set para inicializar la variable cliente
 * @param idCliente 
 */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
/**
 * Este es el get para obtener datos de la variable IdTipo
 * @return 
 */
    public int getIdTipo() {
        return idTipo;
    }
/**
 * Este es el set para inicializar  los datos del parametro idTipo
 * @param idTipo 
 */ 
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
/**
 * Este es el get para obtener datos de la variable Nombres
 * @return 
 */
    public String getNombres() {
        return nombres;
    }
/**
 * Este es el set para inicializar los datos del parametro nombres
 * @param nombres 
 */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
/**
 * Este es el get para obtener datos de la variable Apellidos
 * @return 
 */
    public String getApellidos() {
        return apellidos;
    }
/**
 * Este es el set para inicializar los datos del parametro apellidos
 * @param apellidos 
 */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
/**
 * Este es el get para obtener datos de la variable Direccion
 * @return 
 */
    public String getDireccion() {
        return direccion;
    }
/**
 * Este es el set para inicializar los datos del parametro direccion
 * @param direccion 
 */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
/**
 * Este es el get para obtener datos de la variable telefono
 * @return 
 */
    public String getTelefono() {
        return telefono;
    }
/**
 * Este es el set para inicializar los datos del parametro Telefono
 * @param telefono 
 */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
/**
 * Este es el get para obtener datos de la variable Ciudad
 * @return 
 */
    public int getCiudad() {
        return ciudad;
    }
/**
 * Este es el set para inicializar los datos del parametro ciudad
 * @param ciudad 
 */
    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }
/**
 * Este es el get para obtener datos de la variable FechaNacimiento
 * @return 
 */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
/**
 * Este es el set para inicializar los datos del parametro fechaNacimiento
 * @param fechaNacimiento 
 */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
/**
 * Este es el get para obtener datos de la variable FechaIngreso
 * @return 
 */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }
/**
 * Este es el set para inicializar los datos de la variable fechaIngreso
 * @param fechaIngreso 
 */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
/**
 * Este retorna todos los datos de la clase
 * @return 
 */    
     @Override
        public String toString() {
        return idCliente + "|"
                + idTipo + "|"
                + nombres + "|"
                + apellidos + "|"
                + direccion + "|"
                + telefono + "|"
                + ciudad + "|"
                + Utilidades.formatDate(fechaNacimiento) + "|"
                + Utilidades.formatDate(fechaIngreso);
           
    }
}
