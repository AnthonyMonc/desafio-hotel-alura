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
import modelo.reserva;
/**
 *
 * @author cristian
 */
public class reserva_controlador {
    PreparedStatement ps;
    ResultSet rs;
    conexion Stringconexion = new conexion();

    public void insertarReserva(reserva nuevareserva) {
        String sqlcrear = "INSERT INTO reserva (fecha_entrada,fecha_salida,valor,forma_pago,id_huesped,total) VALUES (?,?,?,?,?,?);";
        try {
            ps = Stringconexion.getConnection().prepareStatement(sqlcrear);
            ps.setString(1, nuevareserva.getFecha_entr());
            ps.setString(2, nuevareserva.getFecha_sal());
            ps.setInt(3, nuevareserva.getValor());
            ps.setString(4, nuevareserva.getForma_pag());
            ps.setInt(5, nuevareserva.getHuesped());
            ps.setDouble(6, nuevareserva.getTotal());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "reserva creada exitosamente");
        } catch (SQLException ex) {
            System.err.println("error: " + ex);
            JOptionPane.showMessageDialog(null, "Error al hacer la recerva");
        }
    }
}
