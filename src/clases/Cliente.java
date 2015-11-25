
package clases;

import java.util.Date;
/**
 * 
 * @author sala115
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

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
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
