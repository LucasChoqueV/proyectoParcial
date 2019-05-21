/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.dao.IComputadoraDAO;
import aplicacion.dao.imp.ComputadoraDAOImp;
import aplicacion.modelo.dominio.Producto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Lucas
 */
@Named(value = "computadoraFormBean")
@ManagedBean
@SessionScoped
public class ComputadoraFormBean implements Serializable {
    
    private IComputadoraDAO computadoraDAO; 
    private List<Producto> listaComputadoras;

    /**
     * Creates a new instance of ComputadoraFormBean
     */
    @PostConstruct
    public void init(){
        computadoraDAO = new ComputadoraDAOImp();
        generarComputadora();
    }
    public void generarComputadora(){
        listaComputadoras = computadoraDAO.obtenerComputadora();
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("listaComputadoras",listaComputadoras);
    }

    public IComputadoraDAO getComputadoraDAO() {
        return computadoraDAO;
    }

    public void setComputadoraDAO(IComputadoraDAO computadoraDAO) {
        this.computadoraDAO = computadoraDAO;
    }

    public List<Producto> getListaComputadoras() {
        return listaComputadoras;
    }

    public void setListaComputadoras(List<Producto> listaComputadoras) {
        this.listaComputadoras = listaComputadoras;
    }
    
}