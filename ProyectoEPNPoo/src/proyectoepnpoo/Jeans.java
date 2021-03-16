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
public class Jeans extends Ropa {
    private double precioJeans;

    public double getPrecioJeans() {
        return precioJeans;
    }

    public Jeans(double precioJeans, String marca) {
        super(marca);
        this.precioJeans = precioJeans;
    } 
    
    @Override
    public String calcularPrecio(){
        return "De marca: " +marca +"+ el iva del " +iva +"con un precio de: " +precioJeans;
    }
    
}
