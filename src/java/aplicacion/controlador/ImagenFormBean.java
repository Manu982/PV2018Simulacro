/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.dato.ListaImagen;
import aplicacion.modelo.dominio.Imagen;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author FranNBK
 */
@ManagedBean
@SessionScoped
public class ImagenFormBean implements Serializable{
    private transient UploadedFile file=null;
    private byte[] imagen;
    private byte[] nuevaImagen;
    private ListaImagen listadoImagenes;
    private String fecha;
    
    /**
     * Creates a new instance of ImagenFormBean
     */
    public ImagenFormBean() {
        listadoImagenes=new ListaImagen();
        }
    
    public void agregarImagen() throws ParseException{
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        Date unaFecha=formatter.parse(getFecha());
        setImagen(file.getContents());
        getListadoImagenes().llenarListado(unaFecha,imagen);
        FacesMessage message=new FacesMessage("Succesful",file.getFileName()+" is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public StreamedContent getImagenSubidaListado() throws IOException{
        FacesContext context=FacesContext.getCurrentInstance();
        if(context.getCurrentPhaseId()==PhaseId.RENDER_RESPONSE){
            return new DefaultStreamedContent();
        }
        else{
            String nuevaImg=context.getExternalContext().getRequestParameterMap().get("numImg");
            int indice=Integer.parseInt(nuevaImg);
            setNuevaImagen(getListadoImagenes().getListaImagen().get(indice).getImagen());
            if(getNuevaImagen()==null){
                return null;
            }
            else{
                return new DefaultStreamedContent(new ByteArrayInputStream(getNuevaImagen()));
            }
        }
    }
    
    public ArrayList<Imagen> obtenerLista(){
        return listadoImagenes.getListaImagen();
    }
    
    public void reiniciarImagen(){
        setListadoImagenes(new ListaImagen());
    }

    /**
     * @return the file
     */
    public UploadedFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
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
     * @return the nuevaImagen
     */
    public byte[] getNuevaImagen() {
        return nuevaImagen;
    }

    /**
     * @param nuevaImagen the nuevaImagen to set
     */
    public void setNuevaImagen(byte[] nuevaImagen) {
        this.nuevaImagen = nuevaImagen;
    }

    /**
     * @return the listadoImagenes
     */
    public ListaImagen getListadoImagenes() {
        return listadoImagenes;
    }

    /**
     * @param listadoImagenes the listadoImagenes to set
     */
    public void setListadoImagenes(ListaImagen listadoImagenes) {
        this.listadoImagenes = listadoImagenes;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
