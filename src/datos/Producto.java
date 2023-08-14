package datos;

import modelo.Base;

public class Producto extends Base{

    private String nombreProducto;
    private String codigoProducto;
    private double valorProducto;

    public Producto(String nombreProducto, String codigoProducto, double valorProducto) {
        this.nombreProducto = nombreProducto;
        this.valorProducto = valorProducto;
        this.codigoProducto = codigoProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(double valorProducto) {
        this.valorProducto = valorProducto;
    }


public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return nombreProducto + "," + valorProducto + ", " + codigoProducto;
    }

    @Override
    public Base copy() {
        return new Producto(nombreProducto, codigoProducto, valorProducto);
    } 
}
