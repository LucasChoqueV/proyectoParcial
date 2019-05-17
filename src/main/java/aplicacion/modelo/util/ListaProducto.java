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
        Image imagenv2 = Toolkit.getDefaultToolkit().getImage("resources/image/latitude.jpg");
        Caracteristicas c1 = new Caracteristicas("Intel Core I7 3.5GHz", "16GB RAM", "1TB HDD");
        Caracteristicas c2 = new Caracteristicas("Qualcomm Snapdragon 835", "8GB RAM", " 16GB Interna");
        Producto p1 = new Producto(1, 33000, 4,"Dell Latitude",c1, imagenv2);
        Producto p2 = new Producto(2, 15324, 6,"Samsung Galaxy S8 plus",c2, imagenv2);
        productos.add(p1);
        productos.add(p2);
    }
    
    public Producto obtenerProductoUnico(int codigo){
        Producto aux = null;
        for(Producto p: productos){
            if(p.getCodigoProducto() == codigo)
                aux=p;
        }
        return aux;
    }
  
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}