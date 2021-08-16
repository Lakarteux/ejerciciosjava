public class HamburguesaPatacon extends Hamburguesa { 
    // Atributos
    private String tipoPatacon;
    private double valorTipoPatacon;

    // Getters y setters de ser necesarios 
 
    public HamburguesaPatacon(){
        this.tamano = TAMANO;
        this.cebolla = CEBOLLA;
    }
    // Constructor sobrecargado 
    public HamburguesaPatacon(String tamano, boolean cebolla, String tipoPatacon) { 
        this.tamano= tamano;
        this.cebolla = cebolla;
        this.tipoPatacon= tipoPatacon;
    } 
 
    // Métodos
    public void tipoPataconF(String tipoPatacon){
        if (tipoPatacon.equalsIgnoreCase("Maduro")){
            valorTipoPatacon= 4000;
        }
        else if (tipoPatacon.equalsIgnoreCase("Verde")){
            valorTipoPatacon = 3000;
        }
    }
    
    Hamburguesa ham = new Hamburguesa();
    double precioGeneral = ham.calcularPrecio();
 

    // Método calcularPrecio 
    public double calcularPrecio () { 
        double precioHamburguesa = 0;
        tamanoF(tamano);
        tipoPataconF(tipoPatacon);
        // Cálculos necesarios 
        // precioGeneral = (precio_Base*tamanoNumero)+ adicionalNumero;
        precioHamburguesa = precioGeneral + valorTipoPatacon;

        return precioHamburguesa; 
    } 
}