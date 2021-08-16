package utp.misiontic2022.c2.p56.reto4.modelo.vo;

public class Requerimiento_1 {
    // Por hacer
    private String nombreMaterial;
    private Integer precio;
    private Integer idProyecto;

    public Requerimiento_1(String nombreMaterial, Integer precio, Integer idProyecto){
        this.nombreMaterial = nombreMaterial;
        this.precio = precio;
        this.idProyecto = idProyecto;
    }


    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }
    public String getNombreMaterial() {
        return nombreMaterial;
    }
    public Integer getPrecio() {
        return precio;
    }
    public Integer getIdProyecto() {
        return idProyecto;
    }

}
