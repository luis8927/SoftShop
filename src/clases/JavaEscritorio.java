
package clases;

import formularios.frmLogin;

public class JavaEscritorio {

    
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
