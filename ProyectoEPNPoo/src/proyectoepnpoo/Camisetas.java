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
public class Camisetas extends Ropa {
    private double precioCamisetas;

    public double getPrecioCamisetas() {
        return precioCamisetas;
    }

    public Camisetas(double precioCamisetas, String marca) {
        super(marca);
        this.precioCamisetas = precioCamisetas;
    }
    
    @Override
    public String calcularPrecio(){
        return "De marca: " +marca +"+ el iva del " +iva +"con un precio de: " +precioCamisetas;
    }
    
}
