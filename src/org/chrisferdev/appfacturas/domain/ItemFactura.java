package org.chrisferdev.appfacturas.domain;

public class ItemFactura {

    private int cantidad;
    private Producto producto;

    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float calculaImporte() {
        return this.cantidad * this.producto.getPrecio();

    }

    @Override
    public String toString() {
        return producto +
                "\t" + cantidad +
                "\t" + calculaImporte();
    }
}
