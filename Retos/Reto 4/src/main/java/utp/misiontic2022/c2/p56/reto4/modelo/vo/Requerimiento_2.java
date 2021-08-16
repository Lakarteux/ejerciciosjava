package utp.misiontic2022.c2.p56.reto4.modelo.vo;

public class Requerimiento_2 {
    // Por hacer
    private String proveedor;
    private Integer cantidad;

    public Requerimiento_2(String proveedor, Integer cantidad){
        this.proveedor = proveedor;
        this.cantidad = cantidad;

    }


    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getProveedor() {
        return proveedor;
    }
    public Integer getCantidad() {
        return cantidad;
    }
}
