package utp.misiontic2022.c2.p56.reto5.modelo.vo;

public class Requerimiento_3 {
    // Por hacer
    private String constructora;
    private Integer costoLideres;

    public Requerimiento_3(String constructora, Integer costoLideres){
        this.constructora = constructora;
        this.costoLideres = costoLideres;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public void setCostoLideres(Integer costoLideres) {
        this.costoLideres = costoLideres;
    }
    public String getConstructora() {
        return constructora;
    }
    public Integer getCostoLideres() {
        return costoLideres;
    }

}
