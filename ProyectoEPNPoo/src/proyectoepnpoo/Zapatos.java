/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoepnpoo;

/**
 *
 * @author PC
 */
public class Zapatos extends Ropa{
    private double precioZapatos;

    public double getPrecioZapatos() {
        return precioZapatos;
    }

    public Zapatos(double precioZapatos, String marca) {
        super(marca);
        this.precioZapatos = precioZapatos;
    }
    
    @Override
    public String calcularPrecio(){
        return "De marca: " +marca +"+ el iva del " +iva +"con un precio de: " +precioZapatos;
    }
}
