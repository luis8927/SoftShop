
package clases;

/**
 * Esta es la clase Usuario donde se declaran las variables para el formulario 
 * @author LUISFERNANDO
 */
public class Usuario {
    private String idUsuario;
    private String nombres;
    private String apellidos;
    private String clave;
    private int perfil;
/**
 * Declarando las variables de la clase 
 * @param idUsuario
 * @param nombres
 * @param apellidos
 * @param clave
 * @param perfil 
 */
    public Usuario(String idUsuario, String nombres, String apellidos, String clave, int perfil) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.clave = clave;
        this.perfil = perfil;
    }
/**
 * Este es el get para obtener los datos de la variable IdUsuario
 * @return 
 */
    public String getIdUsuario() {
        return idUsuario;
    }
/**
 * Este es el set para inicializar la variable IdUsuario
 * @param idUsuario 
 */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
/**
 * Este es el get para obtener los datos de la variable Nombres 
 * @return 
 */
    public String getNombres() {
        return nombres;
    }
/**
 * Este es el set para inicializar la variable Nombres
 * @param nombres 
 */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
/**
 * Este es el get para obtener los datos de la variable Apellidos
 * @return 
 */
    public String getApellidos() {
        return apellidos;
    }
/**
 * Este es el set para inicializar la variable Apellidos
 * @param apellidos 
 */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
/**
 * Este es el get para obtener los datos de la variable Clave
 * @return 
 */
    public String getClave() {
        return clave;
    }
/**
 * Este es el set para inicializar la variable Clave
 * @param clave 
 */
    public void setClave(String clave) {
        this.clave = clave;
    }
/**
 * Este es el get para obtener los datos de la variable Perfil
 * @return 
 */
    public int getPerfil() {
        return perfil;
    }
/**
 * Este es el set para inicializar la variable perfil
 * @param perfil 
 */
    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
/**
 * Retorna los datos obtenidos
 * @return 
 */    
    @Override
    public String toString() {
        return idUsuario + "|"
                + nombres + "|"
                + apellidos + "|"
                + clave + "|"
                + perfil;
    }
    

    
    }

    
    