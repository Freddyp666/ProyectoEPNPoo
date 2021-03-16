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
public abstract class Ropa {
    protected String marca;    
    public final double iva = 0.12;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }    

    public Ropa(String marca) {
        this.marca = marca;
        
    }

    public Ropa() {
    }
    
    public String calcularPrecio(){
        return "De marca: " +marca +"+ el iva del " +iva;
    }
}
