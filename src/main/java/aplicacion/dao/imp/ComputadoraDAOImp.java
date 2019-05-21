/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IComputadoraDAO;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.util.ListaProducto;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class ComputadoraDAOImp implements Serializable, IComputadoraDAO{
    
    private ListaProducto listaComputadora;

    public ComputadoraDAOImp() {
        listaComputadora = new ListaProducto();
    }
    @Override
    public List<Producto> obtenerComputadora() {
        return listaComputadora.obtenerComputadoras();
    }

    public ListaProducto getListaComputadora() {
        return listaComputadora;
    }

    public void setListaComputadora(ListaProducto listaComputadora) {
        this.listaComputadora = listaComputadora;
    }
}