/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.ProductoBean;
import aplicacion.dao.IProductoDAO;
import aplicacion.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Lucas
 */
@Named(value = "productoFormBean")
@ManagedBean
@ViewScoped
public class ProductoFormBean {
    
    private IProductoDAO productoDAO;
    private List<Producto> listaProductos;
    private Producto producto;
    private int codigo;

    /**
     * Creates a new instance of ProductoFormBean
     */
    public ProductoFormBean() {
    }
    
    @PostConstruct
    public void init(){
        producto = new Producto();
        productoDAO = new ProductoDAOImp();
        listaProductos = new ArrayList<>();
        generarProductos();
        generarProductoUnico();
    }
    
    public void generarProductoUnico(){
        producto = productoDAO.obtenerProductoUnico(codigo);
    }
    
    public void generarProductos(){
        listaProductos = productoDAO.obtenerProductos();
    }

    public IProductoDAO getProductoDAO() {
        return productoDAO;
    }

    public void setProductoDAO(IProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }
    
    

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
        
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
        generarProductoUnico();
    }
    
    
}