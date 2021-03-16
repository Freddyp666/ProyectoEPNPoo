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
public class Cliente {
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String Correo;
    private String Tarjeta;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(String Tarjeta) {
        this.Tarjeta = Tarjeta;
    }

    public Cliente() {
    }

    public Cliente(String Nombre, String Apellido, String Cedula, String Correo, String Tarjeta) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Correo = Correo;
        this.Tarjeta = Tarjeta;
    }
    
    @Override
    public String toString(){
        return "\n\nSeñor/a: "+ this.Nombre.toUpperCase() +" " +this.Apellido.toUpperCase()
                +"\nCorreo Electrónico: " +this.Correo.toLowerCase()
                +"\nCédula: " +this.Cedula +"\nCon tarjeta de número: " +this.Tarjeta;
        
    }
       
}
