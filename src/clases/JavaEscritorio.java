
package clases;

import formularios.frmLogin;
/**
 * Esta es la clase principal JavaEscritorio
 * @author LUISFERNANDO
 * @version 
 */
public class JavaEscritorio {

    /**
     * Carga los parametros para el Login y se llama al formulario Login
     * @param args 
     */
    public static void main(String[] args) {
        //Creo el objeto datos
        Datos misDatos = new Datos();
        
        //Llamamos el formulario
        frmLogin miLogin = new frmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
    
}
