
package formularios;

import clases.Datos;
import clases.Producto;
import clases.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmProductos extends javax.swing.JInternalFrame {
    
    private Datos misDatos;
    private int proAct = 0;
    private boolean nuevo = false;
    private DefaultTableModel miTabla;
    
   public void setDatos(Datos misDatos) {
       this.misDatos = misDatos;
      
   }
    public frmProductos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnPrimero = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        cmbIVA = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Productos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("ID Producto*:");

        txtIDProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtIDProducto.setEnabled(false);

        jLabel2.setText("Descripción*:");

        txtDescripcion.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtDescripcion.setEnabled(false);

        jLabel3.setText("Precio*:");

        txtPrecio.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecio.setEnabled(false);

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Primero.png"))); // NOI18N
        btnPrimero.setToolTipText("Va al primer registro");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ultimo.png"))); // NOI18N
        btnUltimo.setToolTipText("Va al ultimo registro");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Anterior.png"))); // NOI18N
        btnAnterior.setToolTipText("Va al anterior registro");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Siguiente.png"))); // NOI18N
        btnSiguiente.setToolTipText("Va al siguiente registro");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo registro");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Borrar.png"))); // NOI18N
        btnBorrar.setToolTipText("Eliminar registro");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Modificar.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar registro");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar registro");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Buscar.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar registro");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cancelar2.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancela operación");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo3.png"))); // NOI18N

        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("*Campos obligatorios");

        tblTabla.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        jLabel9.setText("IVA*:");

        cmbIVA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0%", "10%", "16%" }));
        cmbIVA.setEnabled(false);

        jLabel10.setText("Nota:");

        txtNota.setColumns(20);
        txtNota.setRows(5);
        txtNota.setEnabled(false);
        jScrollPane2.setViewportView(txtNota);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPrecio)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel9)
                                        .addGap(19, 19, 19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIDProducto)
                                            .addComponent(txtDescripcion))
                                        .addGap(49, 49, 49)))
                                .addComponent(cmbIVA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGap(111, 111, 111)
                        .addComponent(jLabel7)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(cmbIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSiguiente)
                    .addComponent(btnNuevo)
                    .addComponent(btnBorrar)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnCancelar)
                    .addComponent(btnPrimero)
                    .addComponent(btnUltimo)
                    .addComponent(btnAnterior))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       //Habilita los botones
        btnPrimero.setEnabled(false);
	btnAnterior.setEnabled(false);
	btnSiguiente.setEnabled(false);
	btnUltimo.setEnabled(false);
	btnNuevo.setEnabled(false);
	btnModificar.setEnabled(false);
	btnGuardar.setEnabled(true);
	btnCancelar.setEnabled(true);
	btnBorrar.setEnabled(false);
	btnBuscar.setEnabled(false);
        
        //Habilita los campos
        txtIDProducto.setEnabled(true);
	cmbIVA.setEnabled(true);
	txtDescripcion.setEnabled(true);
	txtPrecio.setEnabled(true);
	txtNota.setEnabled(true);
        
        //Limpia los campos
        txtIDProducto.setText("");
	txtDescripcion.setText("");
	txtPrecio.setText("");
        txtNota.setText("");
	cmbIVA.setSelectedIndex(0);
        
        //Activamos el flag del registro nuevo
        nuevo = true;
        
        //Dar foco al ID
        txtIDProducto.requestFocusInWindow();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                if (txtIDProducto.getText().equals("")) {
			JOptionPane.showMessageDialog(rootPane, "Debe ingresar un ID de Producto");
			txtIDProducto.requestFocusInWindow();
			return; 
		}
		
		
		
		if (txtDescripcion.getText().equals("")) {
			JOptionPane.showMessageDialog(rootPane,"Debe ingresar una descripcion de producto" );
			txtDescripcion.requestFocusInWindow();
			return; 
		}
                
		if (txtPrecio.getText().equals("")) {
			JOptionPane.showMessageDialog(rootPane,"Debe ingresar el precio del producto" );
			txtPrecio.requestFocusInWindow();
			return; 
		}
                if (!Utilidades.isNumeric(txtPrecio.getText())) {
			JOptionPane.showMessageDialog(rootPane, "Debe ingresar un valor numerico en el precio del producto" );
			txtPrecio.requestFocusInWindow();
			return; 
		}
		
		int precio = Integer.parseInt(txtPrecio.getText());
		if (precio <= 0) {
			JOptionPane.showMessageDialog(rootPane,"Debe ingresar un valor mayor a cero(0) en el precio del producto" );
			txtPrecio.requestFocusInWindow();
			return; 
		}
               
		
                
                //Si es nuevo validamos que el producto no exista
                int pos = misDatos.posicionProducto(txtIDProducto.getText());
                if (nuevo) {
			if(pos != -1) {
				JOptionPane.showMessageDialog(rootPane,"El producto ya existe");
				txtIDProducto.requestFocusInWindow();
				return;
			}
                        
                     }

   
                      else {
                            if (pos == -1) {
				JOptionPane.showMessageDialog(rootPane,"El producto no existe");
				txtIDProducto.requestFocusInWindow();
				return;
                        }
		}
                
//Creamos el objeto Producto y os agragamos a datos
                Producto miProducto = new Producto (
			txtIDProducto.getText(),
			txtDescripcion.getText(),
			precio,
                        cmbIVA.getSelectedIndex(),
			txtNota.getText());
                
                String msg ;
		if (nuevo) {
			msg = misDatos.agregarProducto(miProducto);
		} else {
			msg = misDatos.modificarProducto(miProducto , pos);
		}	
                
               
		JOptionPane.showMessageDialog(rootPane,msg);
		

//Desabilita los botones
        btnPrimero.setEnabled(true);
	btnAnterior.setEnabled(true);
	btnSiguiente.setEnabled(true);
	btnUltimo.setEnabled(true);
	btnNuevo.setEnabled(true);
	btnModificar.setEnabled(true);
	btnGuardar.setEnabled(false);
	btnCancelar.setEnabled(false);
	btnBorrar.setEnabled(true);
	btnBuscar.setEnabled(true);
        
        //Desabilitar los campos
        txtIDProducto.setEnabled(false);
	txtDescripcion.setEnabled(false);
	txtPrecio.setEnabled(false);
	txtNota.setEnabled(false);
	cmbIVA.setEnabled(false);
        
        llenarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Desabilita los botones
        btnPrimero.setEnabled(true);
	btnAnterior.setEnabled(true);
	btnSiguiente.setEnabled(true);
	btnUltimo.setEnabled(true);
	btnNuevo.setEnabled(true);
	btnModificar.setEnabled(true);
	btnGuardar.setEnabled(false);
	btnCancelar.setEnabled(false);
	btnBorrar.setEnabled(true);
	btnBuscar.setEnabled(true);
        
        //Desabilitar los campos
        txtIDProducto.setEnabled(false);
	txtDescripcion.setEnabled(false);
	txtPrecio.setEnabled(false);
	txtNota.setEnabled(false);
	cmbIVA.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
          //Habilita los botones
        btnPrimero.setEnabled(false);
	btnAnterior.setEnabled(false);
	btnSiguiente.setEnabled(false);
	btnUltimo.setEnabled(false);
	btnNuevo.setEnabled(false);
	btnModificar.setEnabled(false);
	btnGuardar.setEnabled(true);
	btnCancelar.setEnabled(true);
	btnBorrar.setEnabled(false);
	btnBuscar.setEnabled(false);
        
        //Habilita los campos
	txtDescripcion.setEnabled(true);
	txtPrecio.setEnabled(true);
	txtNota.setEnabled(true);
	cmbIVA.setEnabled(true);
        
        //desactivamos el flag del registro nuevo
        nuevo = false;
        
        //Dar foco al ID
        txtDescripcion.requestFocusInWindow();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
                mostrarRegistro();
                llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
                 proAct = 0;
		mostrarRegistro();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        	proAct = misDatos.numeroProductos() -1;
		mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        proAct ++;
        if (proAct == misDatos.numeroProductos()) {
		proAct = 0;
		
		}
        	mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        proAct --;
        if (proAct == - 1){
          proAct = misDatos.numeroProductos()-1;
		
		}
        	mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de borrar el registro");
	if (rta != 0) {
              return; 
	}
		
		String msg; 
                msg = misDatos.borrarProducto(proAct);
		JOptionPane.showMessageDialog(rootPane, msg);
                proAct = 0;
                mostrarRegistro();        
		llenarTabla(); 
			
	
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     String producto = JOptionPane.showInputDialog("Ingrese ID del producto");
		if (producto.equals("")) {
			return;
		}
			 
		int pos = misDatos.posicionProducto(producto);
		if (pos == -1) {
			JOptionPane.showMessageDialog(rootPane, "Producto no existe");
			return;
		}
		
		proAct = pos;
		mostrarRegistro();
        
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mostrarRegistro() {
	txtIDProducto.setText(misDatos.getProductos()[proAct].getIdProducto());
	txtDescripcion.setText(misDatos.getProductos()[proAct].getDescripcion());
	txtPrecio.setText ("" + misDatos.getProductos()[proAct].getPrecio());
	txtNota.setText(misDatos.getProductos()[proAct].getNota());
	cmbIVA.setSelectedIndex(misDatos.getProductos()[proAct].getIva());
    }
    
    private void llenarTabla() {
		String titulos[] = {"ID Producto", "Descripción", "Precio", "IVA","Notas"};
		String registro[] = new String[5];
		miTabla = new DefaultTableModel(null, titulos);
		
		for (int i = 0; i < misDatos.numeroProductos(); i++) {
			registro[0] = misDatos.getProductos()[i].getIdProducto();
			registro[1] = misDatos.getProductos()[i].getDescripcion();
			registro[2] = "" +misDatos.getProductos()[i].getPrecio();
                        registro[3] = iva(misDatos.getProductos()[i].getIva());
                        registro[4] = misDatos.getProductos()[i].getNota();
			miTabla.addRow(registro);
		}
		
		tblTabla.setModel(miTabla);
    }   
    
    private String iva(int idIVA) {
       switch (idIVA){
           case 0: return "0%";
               case 1: return "10%";
                   case 2: return "16%";
                   default: return "No definido";
               
       }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cmbIVA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JTextArea txtNota;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
