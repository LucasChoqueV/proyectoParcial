/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author Lucas
 */
public class Producto implements Serializable{
    
    private int codigoProducto;
    private int precioProducto;
    private int stock;
    private String nombreProducto;
    private Caracteristicas caracteristicas;
    private Image imagen;

    public Producto() {
    }

    public Producto(int codigoProducto, int precioProducto, int stock, String nombreProducto, Caracteristicas caracteristica, Image imagen) {
        this.codigoProducto = codigoProducto;
        this.precioProducto = precioProducto;
        this.stock = stock;
        this.nombreProducto = nombreProducto;
        this.caracteristicas = caracteristica;
        this.imagen = imagen;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Caracteristicas getCaracteristica() {
        return caracteristicas;
    }

    public void setCaracteristica(Caracteristicas caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
}