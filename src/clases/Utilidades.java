
package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Esta es la clase Utilidades donde estan los objetos para el formato de la fecha
 * @author LUISFERNANDO
 * @version
 */
public class Utilidades {
    /**
     * Esta es una cadena del codigo para la fecha
     * @param cadena
     * @return 
     */
    	public static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
			
		} catch (NumberFormatException nfe) {
			return false;
		}
		
	}
    /**
     * Este es el formato que se le da a la fecha en un String
     * @param fecha
     * @return 
     */    
        public static Date stringToDate(String fecha) {
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
            Date aux;
                aux = null;
            try {
                aux = formatoDelTexto.parse(fecha);
            }catch (Exception ex) {
                
            }
            return aux;
        }
        /**
         * Formato de un Date a fecha normal del sistema
         * @param fecha
         * @return 
         */
        public static String formatDate(Date fecha) {
           SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
           return formatoDelTexto.format(fecha);
        }
        /**
         * Declarando un objeto entero
         * @param Obj
         * @return 
         */        
        public static int objectToInt(Object Obj)  { 
        int NumInt = Integer.parseInt(objectToString(Obj));
        
        return NumInt; 
        }
        /**
         * Obteniendo el dato del objeto 
         * @param Obj
         * @return 
         */
        public static double objectToDouble(Object Obj)  {
        String Str = Obj.toString();
        double NumDouble = Double.valueOf(Str).doubleValue();
        
        return NumDouble;
        } 
        /**
         * Convirtiendo el dato cadena a booleano
         * @param Obj
         * @return 
         */
        public static boolean objectToBoolean(Object Obj)  {
        String CadBooleana = objectToString(Obj);
        Boolean booleano = new Boolean(CadBooleana);
        
        return booleano; 
        } 
        /**
         * 
         * @param Obj
         * @return 
         */
        public static String objectToString(Object Obj)  { 
        String Str = "";
        if (Obj != null) {
        Str = Obj.toString(); 
        
        } 
        return Str; 
        
        }
       
}


