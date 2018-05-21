/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dato;

import aplicacion.modelo.dominio.Imagen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author FranNBK
 */
public class ListaImagen implements Serializable{
    private byte[] imagen;
    private int numImagen;
    private Date fecha;
    private ArrayList<Imagen> listaImagen;

    public ListaImagen() {
        listaImagen=new ArrayList();
    }

    public ListaImagen(byte[] imagen, int numImagen, Date fecha, ArrayList<Imagen> listaImagen) {
        this.imagen = imagen;
        this.numImagen = numImagen;
        this.fecha = fecha;
        this.listaImagen = listaImagen;
    }
    
    public void llenarListado(Date nuevaFecha,byte[] nuevaImagen){
        if(listaImagen.isEmpty()){
            numImagen=0;
        }
        else{
            numImagen=listaImagen.size();
        }
        listaImagen.add(new Imagen(numImagen,nuevaImagen,nuevaFecha));
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the numImagen
     */
    public int getNumImagen() {
        return numImagen;
    }

    /**
     * @param numImagen the numImagen to set
     */
    public void setNumImagen(int numImagen) {
        this.numImagen = numImagen;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the listaImagen
     */
    public ArrayList<Imagen> getListaImagen() {
        return listaImagen;
    }

    /**
     * @param listaImagen the listaImagen to set
     */
    public void setListaImagen(ArrayList<Imagen> listaImagen) {
        this.listaImagen = listaImagen;
    }

    
}
