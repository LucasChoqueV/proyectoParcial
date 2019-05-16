/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Producto;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Lucas
 */
@Named(value = "productoBean")
@RequestScoped
public class ProductoBean {
    
    private ProductoDAOImp productoDAO;

    /**
     * Creates a new instance of ProductoBean
     */
    public ProductoBean() {
        productoDAO = new ProductoDAOImp();
    }
    
    public List<Producto> obtenerProductos(){
        return productoDAO.obtenerProductos();
    }

    public ProductoDAOImp getProductoDAO() {
        return productoDAO;
    }

    public void setProductoDAO(ProductoDAOImp productoDAO) {
        this.productoDAO = productoDAO;
    }
    
}