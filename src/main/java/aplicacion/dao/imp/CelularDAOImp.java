/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.ICelularDAO;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.util.ListaProducto;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class CelularDAOImp implements Serializable, ICelularDAO {
    
    private ListaProducto listaCelular;

    public CelularDAOImp() {
        listaCelular = new ListaProducto();
    }
    
    @Override
    public List<Producto> obtenerCelular() {
        return listaCelular.obtenerCelulares();
    }

    public ListaProducto getListaCelular() {
        return listaCelular;
    }

    public void setListaCelular(ListaProducto listaCelular) {
        this.listaCelular = listaCelular;
    }
}