/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_5;

/**
 *
 * @author Luciano Muzzachiodi
 */
class Producto {
    String producto;
    double precio;
    String categoria;

    public Producto() {
    }

    public Producto(String producto, double precio, String categoria) {
        this.producto = producto;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
