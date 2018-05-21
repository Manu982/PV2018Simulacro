/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import aplicacion.modelo.dominio.Libro;
import aplicacion.modelo.dato.ListaLibro;
import aplicacion.modelo.dominio.Autor;
import java.util.ArrayList;

/**
 *
 * @author FranNBK
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{
    private Libro libro;
    private ListaLibro listaLibro;
    private int isbn;
    private String tit;
    private double pre;
    private ArrayList<Autor> aut;
    private String unAutor;
    private Libro libroaux;
    private String titulot;
    
    public void registrarLibro(){
        setLibro(new Libro(getIsbn(),getTit(),getUnAutor(),getPre()));
        getListaLibro().getListadoLibro().add(getLibro());
    }
    
    public void buscarLibro(){
        for(Libro a:getListaLibro().getListadoLibro()){
            if(a.getTitulo().equals(getTitulot())){
                setLibroaux(a);
            }
            else
                setLibroaux(new Libro());
        }
    }
    
    public void limpiar(){
        setLibroaux(new Libro());
    }
    
    /**
     * Creates a new instance of LibroBean
     */
    public LibroFormBean() {
        listaLibro=new ListaLibro();
        aut=new ArrayList();
        aut.add(new Autor("42222222","Joel","Chaya"));
        aut.add(new Autor("43333333","Pepi","Funes"));
        aut.add(new Autor("44444444","Pablo","Xtremo"));
        aut.add(new Autor("45555555","Pepa","Pig"));
        aut.add(new Autor("46666666","Pedro","Samvrano"));
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * @return the listaLibro
     */
    public ListaLibro getListaLibro() {
        return listaLibro;
    }

    /**
     * @param listaLibro the listaLibro to set
     */
    public void setListaLibro(ListaLibro listaLibro) {
        this.listaLibro = listaLibro;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the tit
     */
    public String getTit() {
        return tit;
    }

    /**
     * @param tit the tit to set
     */
    public void setTit(String tit) {
        this.tit = tit;
    }

    /**
     * @return the pre
     */
    public double getPre() {
        return pre;
    }

    /**
     * @param pre the pre to set
     */
    public void setPre(double pre) {
        this.pre = pre;
    }

    /**
     * @return the aut
     */
    public ArrayList<Autor> getAut() {
        return aut;
    }

    /**
     * @param aut the aut to set
     */
    public void setAut(ArrayList<Autor> aut) {
        this.aut = aut;
    }

    /**
     * @return the unAutor
     */
    public String getUnAutor() {
        return unAutor;
    }

    /**
     * @param unAutor the unAutor to set
     */
    public void setUnAutor(String unAutor) {
        this.unAutor = unAutor;
    }

    /**
     * @return the libroaux
     */
    public Libro getLibroaux() {
        return libroaux;
    }

    /**
     * @param libroaux the libroaux to set
     */
    public void setLibroaux(Libro libroaux) {
        this.libroaux = libroaux;
    }

    /**
     * @return the titulot
     */
    public String getTitulot() {
        return titulot;
    }

    /**
     * @param titulot the titulot to set
     */
    public void setTitulot(String titulot) {
        this.titulot = titulot;
    }
    
}
