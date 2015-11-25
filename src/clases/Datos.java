
package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public final class Datos {
    private final int maxUsu = 50;
    private final int maxPro = 100;
    private final int maxCli = 100;
    private final Usuario misUsuarios[] = new Usuario[maxUsu];
    private final Producto misProductos[] = new Producto[maxPro];
    private final Cliente misClientes[] = new Cliente[maxCli];
    private int conUsu = 0;
    private int conPro = 0;
    private int conCli = 0;
    private int numFac = 0;
   
    
    public Datos(){
        //Cargamos Usuarios
        cargarUsuarios();
        
        //Cargamos Productos
        cargarProductos();
	
	
	//Cargamos Clientes
        cargarClientes();
        
        //Cargamos Configuracion
        cargarConfiguracion();
    }
     
    
    public int getNumFac() {
        return numFac;
    }
    
    public void setNumFac(int numFac) {
        this.numFac = numFac;
    }
    
    public int numeroUsuarios() {
	return conUsu;
		
    }
    
     public int numeroProductos() {
	return conPro;
                                
    }
    
    public int numeroClientes() {
	return conCli;
		
    } 
    public  Usuario[] getUsuarios() {
        return misUsuarios;
    }
    
    public  Producto[] getProductos() {
        return misProductos;
    }
    
    public  Cliente[] getClientes() {
        return misClientes;
    }
    
    public boolean validarUsuario(String usuario, String clave) {
        boolean aux  = false;
        for(int i = 0; i < conUsu; i++){
            if(misUsuarios[i].getIdUsuario().equals(usuario) &&
                            misUsuarios[i].getClave().equals(clave)) {
                        return true;
            }
                    
        }
        return false;
    }
    
    public int getPerfil(String usuario) {
     
        for(int i = 0; i < conUsu; i++) {
            if(misUsuarios[i].getIdUsuario().equals(usuario)) {
                            
                        return misUsuarios[i].getPerfil() ;
            }
                    
        }
        return -1;
    }
    
    public void cambioClave(String usuario, String clave ) {
     
        for(int i = 0; i < conUsu; i++) {
            if(misUsuarios[i].getIdUsuario().equals(usuario)) {
               misUsuarios[i].setClave(clave) ;
               return;
            }
                    
        }
        
    }
    
    public int posicionUsuario(String usuario) {
        for(int i = 0; i < conUsu; i++) {
            if(misUsuarios[i].getIdUsuario().equals(usuario))  {
                        return i;
            }
                    
        }
        return -1;
    }
    
    public int posicionProducto(String producto) {
        for(int i = 0; i < conPro; i++) {
            if(misProductos[i].getIdProducto().equals(producto))  {
                        return i;
            }
                    
        }
        return -1;
    }
    
    public int posicionCliente(String cliente) {
        for(int i = 0; i < conCli; i++) {
            if(misClientes[i].getIdCliente().equals(cliente))  {
                        return i;
            }
                    
        }
        return -1;
    }
    public String agregarUsuario(Usuario miUsuario) {
        if(conUsu == maxUsu) {
            return "Se alcanzado el numero maximo de usuarios";
            
        }
        
        	misUsuarios[conUsu] = miUsuario;
		conUsu++;
		return "Usuario agregado correctamente";
    }
    
     public String agregarProducto(Producto miProducto) {
        if(conPro == maxPro) {
            return "Se alcanzado el numero maximo de productos";
            
        }
        
        	misProductos[conPro] = miProducto;
		conPro++;
		return "Producto agregado correctamente";
    }
     
      public String agregarCliente(Cliente miCliente) {
        if(conCli == maxCli) {
            return "Se alcanzado el numero maximo de clientes";
            
        }
        
        	misClientes[conCli] = miCliente;
		conCli++;
		return "Cliente agregado correctamente";
    }
    
    public String modificarUsuario(Usuario miUsuario, int pos) {
		misUsuarios[pos].setNombres(miUsuario.getNombres());
		misUsuarios[pos].setApellidos(miUsuario.getApellidos());
		misUsuarios[pos].setClave(miUsuario.getClave());
		misUsuarios[pos].setPerfil(miUsuario.getPerfil());
		return "Usuario modificado correctamente";
		
	}
    
    public String modificarProducto(Producto miProducto, int pos) {
		misProductos[pos].setDescripcion(miProducto.getDescripcion());
		misProductos[pos].setPrecio(miProducto.getPrecio());
		misProductos[pos].setIva(miProducto.getIva());
		misProductos[pos].setNota(miProducto.getNota());
		return "Producto modificado correctamente";
		
	}
    
    public String modificarCliente(Cliente miCliente, int pos) {
		misClientes[pos].setIdTipo(miCliente.getIdTipo());	
		misClientes[pos].setNombres(miCliente.getNombres());
		misClientes[pos].setApellidos(miCliente.getApellidos());
		misClientes[pos].setDireccion(miCliente.getDireccion());
		misClientes[pos].setTelefono(miCliente.getTelefono());
		misClientes[pos].setCiudad(miCliente.getCiudad());
		misClientes[pos].setFechaNacimiento(miCliente.getFechaNacimiento());
		misClientes[pos].setFechaIngreso(miCliente.getFechaIngreso());
		return "Cliente modificado correctamente";
    }
    
    	public String borrarUsuario(int pos) {
		for(int i = pos; i < conUsu - 1; i++) {
			misUsuarios[i] = misUsuarios[i + 1];
		}
		conUsu--;
		return "Usuario borrado correctamente";
	}
        
        public String borrarProducto(int pos) {
		for(int i = pos; i < conPro - 1; i++) {
			misProductos[i] = misProductos[i + 1];
		}
		conPro--;
		return "Producto borrado correctamente";
	}
        
        public String borrarCliente(int pos) {
		for(int i = pos; i < conCli - 1; i++) {
			misClientes[i] = misClientes[i + 1];
		}
		conCli--;
		return "Cliente borrado correctamente";
	}
        
        public void grabarTodo() {
            grabarUsuarios();
            grabarClientes();
            grabarProductos();
            grabarConfiguracion();
        }
        
        public void grabarUsuarios() {
            FileWriter fw = null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter("Data/usuarios.txt");
                pw = new PrintWriter(fw);
                
                for (int i = 0; 1 < conUsu; i++) {
                    pw.println(misUsuarios[i].toString());
                } 
                
            } catch (Exception e1) {
            } finally {
                try {
                    if (fw != null) {
                        fw.close();
                    }
                } catch (Exception e2) {
                }
            }      
        }
        public void grabarClientes() {
           FileWriter fw = null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter("Data/clientes.txt");
                pw = new PrintWriter(fw);
                
                for (int i = 0; 1 < conCli; i++) {
                    pw.println(misClientes[i].toString());
                } 
                
            } catch (Exception e1) {
            } finally {
                try {
                    if (fw != null) {
                        fw.close();
                    }
                } catch (Exception e2) {
                }
            }       
        }
        public void grabarProductos() {
            FileWriter fw = null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter("Data/productos.txt");
                pw = new PrintWriter(fw);
                
                for (int i = 0; 1 < conPro; i++) {
                    pw.println(misProductos[i].toString());
                } 
                
            } catch (Exception e1) {
            } finally {
                try {
                    if (fw != null) {
                        fw.close();
                    }
                } catch (Exception e2) {
                }
            }      
        }
        public void grabarConfiguracion() {
            FileWriter fw = null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter("Data/configuracion.ini");
                pw = new PrintWriter(fw);
                
                
                pw.println("[General]");
                pw.println("FacturaActual=" + numFac );
                
                
            } catch (Exception e1) {
            } finally {
                try {
                    if (fw != null) {
                        fw.close();
                    }
                } catch (Exception e2) {
                }
            }      
        }
        public void cargarUsuarios() {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            
            try {
               archivo = new File("Data/usuarios.txt");
               fr = new FileReader(archivo);
               br = new BufferedReader(fr);
               
               int pos;
               String aux;
               String linea;
               
               String idUsuario;
               String nombres;
               String apellidos;
               String clave;
                  int perfil;
    
               while ((linea = br.readLine()) != null) {
                   // Extraemos ID Usuario
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   idUsuario = aux;
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos Nombres
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   nombres = aux;
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos Apellidos
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   apellidos = aux;
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos Clave y Perfil
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   clave = aux;
                   linea = linea.substring(pos + 1);
                   perfil = new Integer(linea);
                  
                   
                   Usuario miUsuario = new Usuario(idUsuario, nombres, apellidos, clave, perfil);
                     misUsuarios[conUsu] = miUsuario;
                    conUsu++;
                   }
               
            } catch (IOException | NumberFormatException e1) {
            } finally {
                try {
                    if (fr != null){
                        fr.close();
                    }
                } catch (Exception e2) {
                }
            }
            
      }
    public void cargarProductos() {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            
            try {
               archivo = new File("Data/productos.txt");
               fr = new FileReader(archivo);
               br = new BufferedReader(fr);
               
               int pos;
               String aux;
               String linea;
               
                String idProducto;
                String descripcion;
                int precio;
                int iva;
                String nota;
    
               while ((linea = br.readLine()) != null) {
                   // Extraemos ID Producto
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   idProducto = aux;
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos Descripcion
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   descripcion = aux;
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos Precio
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   precio = new Integer(aux);
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos Iva y Nota
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   iva = new Integer(aux);
                   linea = linea.substring(pos + 1);
                   nota= linea;
                  
                   
                   Producto miProducto = new Producto(idProducto, descripcion, precio, iva, nota);
                     misProductos[conPro] = miProducto;
                    conPro++;
                   }
               
            } catch (IOException | NumberFormatException e1) {
            } finally {
                try {
                    if (fr != null){
                        fr.close();
                    }
                } catch (Exception e2) {
                }
            }
    }
          public void cargarClientes() {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            
            try {
               archivo = new File("Data/clientes.txt");
               fr = new FileReader(archivo);
               br = new BufferedReader(fr);
               
               int pos;
               String aux;
               String linea;
               
               String idCliente;
               int idTipo;
               String nombres;
               String apellidos;
               String direccion;
               String telefono;
               int ciudad;
               Date fechaNacimiento;
               Date fechaIngreso;
               
    
               while ((linea = br.readLine()) != null) {
                   // Extraemos ID Cliente
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   idCliente = aux;
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos ID Tipo
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   idTipo = new Integer (aux);
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos Nombres
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   nombres = aux;
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos Apellidos
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   apellidos = aux;
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos Direccion
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   direccion = aux;
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos Telefono
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   telefono = aux;
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos ID Ciudad
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   ciudad = new Integer (aux);
                   linea = linea.substring(pos + 1);
                   
                   // Extraemos Clave y Perfil
                   pos = linea.indexOf('|');
                   aux = linea.substring(0, pos);
                   fechaNacimiento = Utilidades.stringToDate(aux);
                   linea = linea.substring(pos + 1);
                   fechaIngreso = Utilidades.stringToDate(linea);
                  
                   
                   Cliente miCliente = new Cliente(idCliente,idTipo, nombres, apellidos, direccion, telefono, ciudad, fechaNacimiento, fechaIngreso );
                     misClientes[conCli] = miCliente;
                    conCli++;
                   }
               
            } catch (IOException | NumberFormatException e1) {
            } finally {
                try {
                    if (fr != null){
                        fr.close();
                    }
                } catch (Exception e2) {
                }
            }
            
      } 
     
     public void cargarConfiguracion() {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            
            try {
               archivo = new File("Data/configuracion.ini");
               fr = new FileReader(archivo);
               br = new BufferedReader(fr);
               
              
               String linea;
               
               
                   while ((linea = br.readLine()) != null) {
                      if(linea.startsWith("FacturaActual=")) {
                          numFac = new Integer(linea.substring(14));
                      } 
                       
                       
                       
                   
                   }
               
            } catch (IOException | NumberFormatException e1) {
            } finally {
                try {
                    if (fr != null){
                        fr.close();
                    }
                } catch (Exception e2) {
                }
            }
        }     
}    
        






