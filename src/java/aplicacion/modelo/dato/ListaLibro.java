/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dato;

import java.util.ArrayList;
import aplicacion.modelo.dominio.Libro;

/**
 *
 * @author FranNBK
 */
public class ListaLibro {
    private ArrayList <Libro> listadoLibro;

    public ListaLibro() {
        listadoLibro= new ArrayList();
    }

    public ListaLibro(ArrayList<Libro> listadoLibro) {
        this.listadoLibro = listadoLibro;
    }

    /**
     * @return the listadoLibro
     */
    public ArrayList <Libro> getListadoLibro() {
        return listadoLibro;
    }

    /**
     * @param listadoLibro the listadoLibro to set
     */
    public void setListadoLibro(ArrayList <Libro> listadoLibro) {
        this.listadoLibro = listadoLibro;
    }
    
}
