/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.dao.ICelularDAO;
import aplicacion.dao.imp.CelularDAOImp;
import aplicacion.modelo.dominio.Producto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Lucas
 */
@Named(value = "celularFormBean")
@ManagedBean
@SessionScoped
public class CelularFormBean implements Serializable {
    
    private ICelularDAO celularDAO;
    private List<Producto> listaCelular;

    /**
     * Creates a new instance of CelularFormBean
     */
    @PostConstruct
    public void init(){
        celularDAO = new CelularDAOImp();
        generarCelulares();
    }
    public void generarCelulares(){
        listaCelular = celularDAO.obtenerCelular();
    }

    public ICelularDAO getCelularDAO() {
        return celularDAO;
    }

    public void setCelularDAO(ICelularDAO celularDAO) {
        this.celularDAO = celularDAO;
    }

    public List<Producto> getListaCelular() {
        return listaCelular;
    }

    public void setListaCelular(List<Producto> listaCelular) {
        this.listaCelular = listaCelular;
    }
    
    
}
