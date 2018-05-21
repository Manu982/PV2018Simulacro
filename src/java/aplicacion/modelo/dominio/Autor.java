/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author FranNBK
 */
public class Autor implements Serializable{
    private String dni;
    private String nombre;
    private String apellido;

    public Autor() {
    }

    public Autor(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    @Override
    public boolean equals(Object other){
        return(other instanceof Autor) && (dni!=null)? dni.equals(((Autor) other).dni):(other==this);
    }
    
    @Override
    public int hashCode(){
        return(dni!=null)? (this.getClass().hashCode()+dni.hashCode()):super.hashCode();
    }
    
    @Override
    public String toString(){
        return String.format("%s %s",apellido,nombre);
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
