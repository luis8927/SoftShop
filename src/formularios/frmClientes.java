
package formularios;

import clases.Cliente;
import clases.Datos;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmClientes extends javax.swing.JInternalFrame {
    
    private Datos misDatos;
    private int cliAct = 0;
    private boolean nuevo = false;
    private DefaultTableModel miTabla;
    
   public void setDatos(Datos misDatos) {
       this.misDatos = misDatos;
      
   }
    public frmClientes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
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
        cmbTipoID = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dchFechaNacimiento = new com.toedter.calendar.JDateChooser();
        dchFechaIngreso = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes");
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

        jLabel1.setText("ID Cliente*:");

        txtIDCliente.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtIDCliente.setEnabled(false);

        jLabel2.setText("Nombres*:");

        txtNombres.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtNombres.setEnabled(false);

        jLabel3.setText("Apelidos*:");

        txtDireccion.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtDireccion.setEnabled(false);

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

        jLabel9.setText("Tipo Identificación*:");

        cmbTipoID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Cedula", "NIT", "T.Identidad", "R.Civil", "C.Extranjeria", "Pasaporte" }));
        cmbTipoID.setEnabled(false);

        jLabel10.setText("Telefono:");

        txtApellidos.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtApellidos.setEnabled(false);

        txtTelefono.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtTelefono.setEnabled(false);

        jLabel11.setText("Dirección:");

        jLabel12.setText("Ciudad:");

        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Bogota", "Barranquilla", "Cali", "Medellin", " " }));
        cmbCiudad.setEnabled(false);

        jLabel13.setText("Fecha de Nacimiento:");

        jLabel14.setText("Fecha de Ingreso:");

        dchFechaNacimiento.setEnabled(false);

        dchFechaIngreso.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCiudad, javax.swing.GroupLayout.Alignment.LEADING, 0, 95, Short.MAX_VALUE))
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDireccion)
                                .addGap(47, 47, 47))
                            .addComponent(txtApellidos))
                        .addGap(229, 229, 229)
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIDCliente)
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dchFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel14)
                                        .addGap(10, 10, 10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipoID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dchFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombres)
                                .addGap(185, 185, 185)))
                        .addGap(146, 146, 146))))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cmbTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(dchFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dchFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSiguiente)
                    .addComponent(btnNuevo)
                    .addComponent(btnBorrar)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnCancelar)
                    .addComponent(btnUltimo)
                    .addComponent(btnAnterior)
                    .addComponent(btnPrimero))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(60, 60, 60))
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
        txtIDCliente.setEnabled(true);
	cmbTipoID.setEnabled(true);
	txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
	txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        cmbCiudad.setEnabled(true);
	dchFechaNacimiento.setEnabled(true);
        
        
        //Limpia los campos
        txtIDCliente.setText("");
        cmbTipoID.setSelectedIndex(0);
	txtNombres.setText("");
        txtApellidos.setText("");
	txtDireccion.setText("");
        txtTelefono.setText("");
        cmbCiudad.setSelectedIndex(0);
	dchFechaNacimiento.setDate(new Date());
        dchFechaIngreso.setDate(new Date());
        
        
        //Activamos el flag del registro nuevo
        nuevo = true;
        
        //Dar foco al ID
        txtIDCliente.requestFocusInWindow();
    }//GEN-LAST:event_btnNuevoActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                if (txtIDCliente.getText().equals("")) {
			JOptionPane.showMessageDialog(rootPane, "Debe ingresar un ID de Cliente");
			txtIDCliente.requestFocusInWindow();
			return; 
		}
		
		
		if (cmbTipoID.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(rootPane,"Debe seleccionar un tipo de identificación" );
			txtNombres.requestFocusInWindow();
			return; 
		}
		
		if (txtNombres.getText().equals("")) {
			JOptionPane.showMessageDialog(rootPane,"Debe ingresar un nombre(s)" );
			txtNombres.requestFocusInWindow();
			return; 
		}
                
                if (txtApellidos.getText().equals("")) {
			JOptionPane.showMessageDialog(rootPane,"Debe ingresar un apellido(s)" );
			txtNombres.requestFocusInWindow();
			return; 
		}
                
		if (txtDireccion.getText().equals("")) {
			JOptionPane.showMessageDialog(rootPane,"Debe ingresar la dirección" );
			txtDireccion.requestFocusInWindow();
			return; 
		}
                if (dchFechaNacimiento.getDate() .after(new Date())) {
			JOptionPane.showMessageDialog(rootPane, "La fecha de nacimiento debe ser anterior a la fecha actual" );
			dchFechaNacimiento.requestFocusInWindow();
			return; 
		}
		
	
               //Creamos el objeto cliente y los agregamos a datos
                        Cliente miCliente = new Cliente(
			txtIDCliente.getText(),
                        cmbTipoID.getSelectedIndex(),
			txtNombres.getText(),
                        txtApellidos.getText(),
                        txtDireccion.getText(),
                        txtTelefono.getText(),
                        cmbCiudad.getSelectedIndex(),
			dchFechaNacimiento.getDate(),
                        dchFechaIngreso.getDate());
                     
                //Si es nuevo validamos que el cliente no exista
                int pos = misDatos.posicionCliente(txtIDCliente.getText());
                if (nuevo) {
			if(pos != -1) {
				JOptionPane.showMessageDialog(rootPane,"El cliente ya existe");
				txtIDCliente.requestFocusInWindow();
				return;
			}
                        
                     }

   
                      else {
                            if (pos == -1) {
				JOptionPane.showMessageDialog(rootPane,"El cliente no existe");
				txtIDCliente.requestFocusInWindow();
				return;
                        }
		}

                String msg ;
		if (nuevo == true) {
			msg = misDatos.agregarCliente(miCliente);
		} else {
			msg = misDatos.modificarCliente(miCliente, 1);
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
        txtIDCliente.setEnabled(false);
        cmbTipoID.setEnabled(false);
	txtNombres.setEnabled(false);
	txtApellidos.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        cmbCiudad.setEnabled(false);
	dchFechaNacimiento.setEnabled(false);
        dchFechaIngreso.setEnabled(false);
	
        // Actualizamos los cambios en la tabla
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
        txtIDCliente.setEnabled(false);
        cmbTipoID.setEnabled(false);
	txtNombres.setEnabled(false);
	txtApellidos.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        cmbCiudad.setEnabled(false);
	dchFechaNacimiento.setEnabled(false);
        dchFechaIngreso.setEnabled(false);
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
	cmbTipoID.setEnabled(true);
	txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
	txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        cmbCiudad.setEnabled(true);
        dchFechaNacimiento.setEnabled(true);
        //desactivamos el flag del registro nuevo
        nuevo = false;
        
        //Dar foco al ID
        cmbTipoID.requestFocusInWindow();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
                mostrarRegistro();
                llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
                 cliAct = 0;
		mostrarRegistro();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        	cliAct = misDatos.numeroClientes() -1;
		mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        cliAct ++;
        if (cliAct == misDatos.numeroClientes()) {
		cliAct = 0;
		
		}
        	mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        cliAct --;
        if (cliAct == - 1){
          cliAct = misDatos.numeroClientes()-1;
		
		}
        	mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de borrar el registro");
	if (rta != 0) {
              return; 
	}
		
		String msg; 
                msg = misDatos.borrarCliente(cliAct);
		JOptionPane.showMessageDialog(rootPane, msg);
                cliAct = 0;
                mostrarRegistro();        
		llenarTabla(); 
			
	
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     String cliente = JOptionPane.showInputDialog("Ingrese ID del cliente");
		if (cliente.equals("")) {
			return;
		}
			 
		int pos = misDatos.posicionCliente(cliente);
		if (pos == -1) {
			JOptionPane.showMessageDialog(rootPane, "Cliente no existe");
			return;
		}
		
		cliAct = pos;
		mostrarRegistro();
        
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mostrarRegistro() {
	txtIDCliente.setText(misDatos.getClientes()[cliAct].getIdCliente());
        cmbTipoID.setSelectedIndex(misDatos.getClientes()[cliAct].getIdTipo());
	txtNombres.setText(misDatos.getClientes()[cliAct].getNombres());
        txtApellidos.setText(misDatos.getClientes()[cliAct].getApellidos());
	txtDireccion.setText (misDatos.getClientes()[cliAct].getDireccion());
	txtTelefono.setText(misDatos.getClientes()[cliAct].getTelefono());
	cmbCiudad.setSelectedIndex(misDatos.getClientes()[cliAct].getCiudad());
        dchFechaNacimiento.setDate(misDatos.getClientes()[cliAct].getFechaNacimiento());
        dchFechaIngreso.setDate(misDatos.getClientes()[cliAct].getFechaIngreso());
        
    }
    
    private void llenarTabla() {
		String titulos[] = {"ID Cliente","Tipo ID", "Nombres","Apellidos", "Dirección", "Teléfono","Ciudad","F.Nacimiento","F.Ingreso"};
		String registro[] = new String[9];
		miTabla = new DefaultTableModel(null, titulos);
		
		for (int i = 0; i < misDatos.numeroClientes(); i++) {
			registro[0] = misDatos.getClientes()[i].getIdCliente();
			registro[1] = tipoID(misDatos.getClientes()[i].getIdTipo());
			registro[2] = misDatos.getClientes()[i].getNombres();
                        registro[3] = misDatos.getClientes()[i].getApellidos();
                        registro[4] = misDatos.getClientes()[i].getDireccion();
                        registro[5] = misDatos.getClientes()[i].getTelefono();
                        registro[6] = ciudad(misDatos.getClientes()[i].getCiudad());
                        registro[7] = "" + misDatos.getClientes()[i].getFechaNacimiento();
                        registro[8] = "" + misDatos.getClientes()[i].getFechaIngreso();
                        
			miTabla.addRow(registro);
		}
		
		tblTabla.setModel(miTabla);
    }   
    

        
    private String tipoID(int id) {
       switch (id){
           case 1: return "C.Ciudadania%";
               case 2: return "NIT";
                   case 3: return "T.Identidad";
                       case 4: return "R.Civil";
                           case 5: return "C.Extranjeria";
                               case 6: return "Pasaporte";
                   default: return "No definido";
               
       }
    }

    private String ciudad(int id) {
       switch (id){
           case 1: return "Bogotá";
               case 2: return "Barranquilla";
                   case 3: return "Cali";
                       case 4: return "Medellín";
                  
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
    private javax.swing.JComboBox cmbCiudad;
    private javax.swing.JComboBox cmbTipoID;
    private com.toedter.calendar.JDateChooser dchFechaIngreso;
    private com.toedter.calendar.JDateChooser dchFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
