/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cristian
 */
public class reserva {
    String fecha_entr;
    String fecha_sal;
    int valor;
    String forma_pag;
    int huesped;
    double total;


    public String getFecha_entr() {
        return fecha_entr;
    }

    public void setFecha_entr(String fecha_entr) {
        this.fecha_entr = fecha_entr;
    }

    public String getFecha_sal() {
        return fecha_sal;
    }

    public void setFecha_sal(String fecha_sal) {
        this.fecha_sal = fecha_sal;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    public String getForma_pag() {
        return forma_pag;
    }

    public void setForma_pag(String forma_pag) {
        this.forma_pag = forma_pag;
    }

    public int getHuesped() {
        return huesped;
    }

    public void setHuesped(int huesped) {
        this.huesped = huesped;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
