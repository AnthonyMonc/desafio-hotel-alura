/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import hotel.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.huesped;
/**
 *
 * @author cristian
 */
public class huesped_controlador {
    PreparedStatement ps;
    ResultSet rs;
    conexion Stringconexion = new conexion();
    //private menu p;

    public void crearUsuario(huesped nuevapersona) {
        String sqlcrear = "INSERT INTO huesped (nom_usuario,nombre,apellido,clave,fecha_nac,nacionalidad,telefono,id_rol) VALUES (?,?,?,?,?,?,?,?);";
        try {
            ps = Stringconexion.getConnection().prepareStatement(sqlcrear);
            ps.setString(1, nuevapersona.getUsuario());
            ps.setString(2, nuevapersona.getNombre());
            ps.setString(3, nuevapersona.getApellido());
            ps.setString(4, nuevapersona.getCont());
            ps.setString(5, nuevapersona.getFecha_naci());
            ps.setString(6, nuevapersona.getNacionalidad());
            ps.setString(7, nuevapersona.getTelefono());
            ps.setInt(8, nuevapersona.getRol());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Huesped creado correctamente");
        } catch (SQLException ex) {
            System.err.println("error: " + ex);
            JOptionPane.showMessageDialog(null, "Error al crear usuario");
        }
    }
}
