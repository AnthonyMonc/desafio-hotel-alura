/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.huesped_controlador;
import hotel.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cristian
 */
public class consulta_huespedes extends javax.swing.JFrame {

    conexion cc = new conexion();
    Connection con = cc.getConnection();
    huesped_controlador pro = new huesped_controlador();
    PreparedStatement ps;
    ResultSet rs;
    private menu principal;
    
    /**
     * Creates new form consulta_huespedes
     */
    public consulta_huespedes(menu p) {
        initComponents();
        principal=p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        bot_buscar = new javax.swing.JButton();
        bot_volver = new javax.swing.JButton();
        bot_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Consulta Huespedes");

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id_huesped", "Usuario", "Nombre", "Apellido", "Fecha nacimiento", "Nacionalidad", "Telefono", "Rol"
            }
        ));
        jScrollPane1.setViewportView(tbl_datos);

        jLabel2.setText("Buscar");

        bot_buscar.setText("Buscar");
        bot_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_buscarActionPerformed(evt);
            }
        });

        bot_volver.setText("Volver");
        bot_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_volverActionPerformed(evt);
            }
        });

        bot_limpiar.setText("Limpiar");
        bot_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(270, 270, 270)
                        .addComponent(bot_volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(bot_buscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bot_limpiar)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bot_volver)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot_buscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bot_limpiar)
                        .addGap(113, 113, 113))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_limpiarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_bot_limpiarActionPerformed

    private void bot_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();
        modelo.setRowCount(0);
        mostrar(txt_buscar.getText());
    }//GEN-LAST:event_bot_buscarActionPerformed

    private void bot_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_volverActionPerformed
        principal.getMenu_admin().setEnabled(false);
        principal.getMenu_huesped().setEnabled(true);
    }//GEN-LAST:event_bot_volverActionPerformed

    public void mostrar(String valor) {
        DefaultTableModel modelo = (DefaultTableModel) tbl_datos.getModel();

        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT id_huesped, nom_usuario, nombre, apellido, fecha_nac, nacionalidad, telefono, id_rol FROM  huesped";
        } else {
            sql = "SELECT id_huesped, nom_usuario, nombre, apellido, fecha_nac, nacionalidad, telefono, id_rol FROM huesped WHERE nom_usuario LIKE '%" + valor + "%'";
        }
        Object[] fila = new Object[8];
        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                fila[6] = rs.getString(7);
                fila[7] = rs.getString(8);
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(consulta_huespedes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_buscar;
    private javax.swing.JButton bot_limpiar;
    private javax.swing.JButton bot_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
