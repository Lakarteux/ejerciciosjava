public class HamburguesaNormal extends Hamburguesa { 
    // Atributos
    private String tipoCarne;
    private double valorTipoCarne;


    

    // Getters y setters de ser necesarios 

    //Constructor
    public HamburguesaNormal(){
        this.tamano = TAMANO;
        this.cebolla = CEBOLLA;


    }
    // Constructor sobrecargado 
    public HamburguesaNormal(String tamano, boolean cebolla, String tipoCarne) { 
        this.tamano = tamano;
        this.cebolla = cebolla;
        this.tipoCarne = tipoCarne;
    } 
 
    // Métodos 

    public void tipoCarneF(String tipoCarne){
        if (tipoCarne.equalsIgnoreCase("Res")){
            valorTipoCarne = 4000;
        }
        else if (tipoCarne.equalsIgnoreCase("Res apanado")){
            valorTipoCarne = 6000;
        }
        else if (tipoCarne.equalsIgnoreCase("Pollo apanado")){
            valorTipoCarne = 7000;
        }
    }
    
    Hamburguesa ham = new Hamburguesa();
    double precioGeneral = ham.calcularPrecio();
 
    // Método calcularPrecio 
    public double calcularPrecio () {
        double precioHamburguesa = 0;
        tamanoF(tamano);
        tipoCarneF(tipoCarne);
        // Cálculos necesarios 
        precioGeneral = (precio_Base*tamanoNumero)+ adicionalNumero;
        precioHamburguesa = precioGeneral  + valorTipoCarne ;
        return precioHamburguesa; 
    } 
}