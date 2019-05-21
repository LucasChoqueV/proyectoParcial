/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Caracteristicas;
import aplicacion.modelo.dominio.Producto;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Lucas
 */
public class ListaProducto implements Serializable{
    
    private List<Producto> productos;

    public ListaProducto() {
        productos = new ArrayList<>();
        Producto p1 = new Producto(1, 33000, 4,"Dell Latitude","Intel i7", "image/productos/prod2.jpg","computadora");
        Producto p2 = new Producto(2, 15324, 6,"Samsung Galaxy S8 plus","Android 7", "image/productos/prod1.jpg","celular");
        Producto p3 = new Producto(3, 314421,2,"Lenovo Think Pad","Intel I9","image/productos/prod2.jpg","computadora");
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
    }
    public void agregarProducto(Producto p){
        Producto aux = new Producto();
        aux = p;
        int i;
        for(i=0;i<productos.size();i++);
        if(i>0)
            aux.setCodigoProducto(productos.get(productos.size()-1).getCodigoProducto()+1);
        else
            aux.setCodigoProducto(1);
        productos.add(aux);
    }
    public void eliminarProducto(Producto p){
        for(int i=0;i<productos.size();i++){
            if(productos.get(i).getCodigoProducto() == p.getCodigoProducto())
                productos.remove(i);
        }
    }
    public void modificarProducto(Producto p){
        for(int i=0;i<productos.size();i++){
            if(productos.get(i).getCodigoProducto() == p.getCodigoProducto()){
                productos.remove(i);
                productos.add(i, p);
            }
        }
    }
    public List<Producto> obtenerCelulares(){
        List<Producto> celulares = new ArrayList<>();
        for(int i=0;i<productos.size();i++){
            if(productos.get(i).getCategoria().equalsIgnoreCase("celular")){
                celulares.add(productos.get(i));
            }
                
        }
        return celulares;
    }
    public List<Producto> obtenerComputadoras(){
        List<Producto> computadora = new ArrayList<>();
        for(int i=0;i<productos.size();i++){
            if(productos.get(i).getCategoria().equalsIgnoreCase("computadora")){
                computadora.add(productos.get(i));
            }
        }
        return computadora;
    }
  
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}