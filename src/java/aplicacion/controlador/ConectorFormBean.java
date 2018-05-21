/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ConectorFormBean {

    /**
     * Creates a new instance of ConectorFormBean
     */
    public ConectorFormBean() {
    }
    
    public String navega(int op){
        switch(op){
            case 1:{
                return "Punto1.xhtml";
            }
            case 2:{
                return "Punto2.xhtml";
            }
            case 3:{
                return "Punto3.xhtml";
            }
            default:{
                return "index.xhtml";
            }
        }
    }
    
}
