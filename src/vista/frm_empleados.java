/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import modelo.Empleado;
/**
 *
 * @author pc01
 */
public class frm_empleados extends javax.swing.JFrame {
    Empleado empleado;
    /**
     * Creates new form frm_empleados
     */
    public frm_empleados() {
        initComponents();
        empleado = new Empleado();
        tbl_empleados.setModel(empleado.leer());
        cmbox_puesto.setModel(empleado.leer_puesto());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_principal = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        lbl_apellidos = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_fn = new javax.swing.JLabel();
        txt_fn = new javax.swing.JTextField();
        lbl_puesto = new javax.swing.JLabel();
        lbl_sueldo = new javax.swing.JLabel();
        txt_sueldo = new javax.swing.JTextField();
        lbl_bono = new javax.swing.JLabel();
        txt_bono = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_empleados = new javax.swing.JTable();
        cmbox_puesto = new javax.swing.JComboBox<>();
        lbl_id_puesto = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_id.setText("Id");

        txt_id.setEditable(false);
        txt_id.setText("0");

        lbl_codigo.setText("Codigo");

        lbl_nombres.setText("Nombres");

        lbl_apellidos.setText("Apellidos");

        lbl_direccion.setText("Direccion");

        lbl_telefono.setText("Telefono");

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        lbl_fn.setText("Nacimiento");

        lbl_puesto.setText("Puesto");

        lbl_sueldo.setText("Sueldo");

        lbl_bono.setText("Bono");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        tbl_empleados.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empleadosMouseClicked(evt);
            }
        });
        tbl_empleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_empleadosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_empleados);

        cmbox_puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0) Seleccione puesto.", "1) Programador.", "2) Administrador." }));
        cmbox_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbox_puestoActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_principalLayout.createSequentialGroup()
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_id)
                            .addComponent(lbl_codigo)
                            .addComponent(lbl_nombres))
                        .addGap(31, 31, 31)
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txt_nombres)))
                    .addGroup(pnl_principalLayout.createSequentialGroup()
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_fn)
                            .addComponent(lbl_telefono)
                            .addComponent(lbl_direccion)
                            .addComponent(lbl_apellidos))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellidos)
                            .addComponent(txt_direccion)
                            .addComponent(txt_telefono)
                            .addComponent(txt_fn))))
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_principalLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                .addComponent(lbl_puesto)
                                .addGap(18, 18, 18)
                                .addComponent(cmbox_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_id_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_sueldo)
                                    .addComponent(lbl_bono))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_sueldo)
                                    .addComponent(txt_bono)))))
                    .addGroup(pnl_principalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpiar)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_id)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_puesto)
                        .addComponent(cmbox_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_id_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sueldo)
                    .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_bono)
                    .addComponent(txt_bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fn)
                    .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_limpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        String id_puesto = cmbox_puesto.getSelectedItem().toString();
        int posc = id_puesto.indexOf(')');
        empleado = new Empleado(txt_codigo.getText(), Float.parseFloat(txt_sueldo.getText()), Float.parseFloat(txt_bono.getText()), 0, Integer.parseInt(id_puesto.substring(0, posc)), txt_nombres.getText(), txt_apellidos.getText(), txt_direccion.getText(), txt_telefono.getText(), this.txt_fn.getText());
        empleado.crear();
        tbl_empleados.setModel(empleado.leer());
        limpiar_datos();
    }//GEN-LAST:event_btn_agregarActionPerformed
    
    public void select_datos(){
        int fila = tbl_empleados.getSelectedRow();
        txt_id.setText(tbl_empleados.getValueAt(fila, 0).toString());
        txt_codigo.setText(tbl_empleados.getValueAt(fila, 1).toString());
        txt_nombres.setText(tbl_empleados.getValueAt(fila, 2).toString());
        txt_apellidos.setText(tbl_empleados.getValueAt(fila, 3).toString());
        txt_direccion.setText(tbl_empleados.getValueAt(fila, 4).toString());
        txt_telefono.setText(tbl_empleados.getValueAt(fila, 5).toString());
        txt_fn.setText(tbl_empleados.getValueAt(fila, 6).toString());
        cmbox_puesto.setSelectedItem(tbl_empleados.getValueAt(fila, 7));
        txt_sueldo.setText(tbl_empleados.getValueAt(fila, 8).toString());
        txt_bono.setText(tbl_empleados.getValueAt(fila, 9).toString());
    }
    
    public void limpiar_datos(){
        txt_id.setText("");
        txt_codigo.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_fn.setText("");
        cmbox_puesto.setSelectedItem("0) Seleccione puesto.");
        txt_sueldo.setText("");
        txt_bono.setText("");
    }
    
    private void tbl_empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empleadosMouseClicked
        // TODO add your handling code here:
        select_datos();
    }//GEN-LAST:event_tbl_empleadosMouseClicked

    private void tbl_empleadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_empleadosKeyReleased
        // TODO add your handling code here:
        select_datos();
    }//GEN-LAST:event_tbl_empleadosKeyReleased

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        String id_puesto = cmbox_puesto.getSelectedItem().toString();
        int posc = id_puesto.indexOf(')');
        empleado = new Empleado(txt_codigo.getText(), Float.parseFloat(txt_sueldo.getText()), Float.parseFloat(txt_bono.getText()), Integer.parseInt(txt_id.getText()), Integer.parseInt(id_puesto.substring(0, posc)), txt_nombres.getText(), txt_apellidos.getText(), txt_direccion.getText(), txt_telefono.getText(), this.txt_fn.getText());
        empleado.actualizar();
        tbl_empleados.setModel(empleado.leer());
        limpiar_datos();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        empleado = new Empleado();
        empleado.setId(Integer.parseInt(txt_id.getText()));
        empleado.borrar();
        tbl_empleados.setModel(empleado.leer());
        limpiar_datos();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void cmbox_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbox_puestoActionPerformed
        // TODO add your handling code here:
        String id_puesto = this.cmbox_puesto.getSelectedItem().toString();
        int posc = id_puesto.indexOf(')');
        lbl_id_puesto.setText(id_puesto.substring(0, posc));
    }//GEN-LAST:event_cmbox_puestoActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar_datos();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> cmbox_puesto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_bono;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_fn;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_id_puesto;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_puesto;
    private javax.swing.JLabel lbl_sueldo;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JTable tbl_empleados;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_bono;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fn;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_sueldo;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
