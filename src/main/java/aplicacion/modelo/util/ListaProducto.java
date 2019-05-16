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
        Caracteristicas c1 = new Caracteristicas("Intel I7", "16GB", "1TB HDD");
        Caracteristicas c2 = new Caracteristicas("AMD Ryzen 5", "12GB", "256GB SDD");
        Caracteristicas c3 = new Caracteristicas("Qualcomm Snapdragon 835", "8GB", "16GB");
        Caracteristicas c4 = new Caracteristicas("MediaTek Helio X20", "6GB", "32GB");
        Producto p1 = new Producto(1, 33000, 4,"Dell Latitude",c1, imagenv2);
        Producto p2 = new Producto(2, 29999, 2,"Lenovo IdeaPad 330s",c2, imagenv2);
        Producto p3 = new Producto(3, 15324, 6,"Samsung Galaxy S8 plus",c3, imagenv2);
        Producto p4 = new Producto(4, 10021, 5,"Motorola G6 plus",c4, imagenv2);
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
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