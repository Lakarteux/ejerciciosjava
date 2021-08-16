public class Hamburguesa { 
    // Constantes 
    protected static final String TAMANO = "Normal";
    protected static final boolean CEBOLLA = false;
    protected static final double PRECIO_BASE = 5000;
    // Atributos 
    protected String tamano;
    protected boolean cebolla;
    protected String adicional;
    protected double precio_Base;
    protected int tamanoNumero;
    protected double adicionalNumero;



 
    //Constructores 
    public Hamburguesa(){
        this.tamano = TAMANO;
        this.cebolla = CEBOLLA;
        this.precio_Base= PRECIO_BASE;

    }
    // Constructor sobrecargado 
    public Hamburguesa(String tamano, boolean cebolla) {
        this.tamano = tamano;
        this.cebolla = cebolla;
        this.precio_Base = PRECIO_BASE;

 
    } 
    // Métodos 
    protected void tamanoF(String tamano){
        if (tamano.equalsIgnoreCase("Normal")){
            tamanoNumero = 1;
        }
        else if (tamano.isEmpty()){
            tamanoNumero =1;
        }
        else if (tamano.equalsIgnoreCase("Doble")){
            tamanoNumero = 2;
        }
    }

    // Getters y setters de ser necesarios 

    // Método agregar adicional 
    protected void agregarAdicional(String entrada) {
        adicional = entrada; 
        if (adicional.equalsIgnoreCase("Tocineta")){
            adicionalNumero+=3000;
        }
        //NOTESE COMO SE ME OLVIDABA COLOCAR EL ADICIONAL Y COMO ES MEJOR ASGINAR UNA VARIABLE DE ENTRADA Y OTRA QUE ADQUIERA EL VALOR
        else if (adicional.equalsIgnoreCase("Jalapeño")){
            adicionalNumero+= 2000;
        } 
    }
    // Método calcularPrecio 
    public double calcularPrecio () { 
        double precioGeneral = 0;
        tamanoF(tamano);
        // Cálculos necesarios
        precioGeneral = (precio_Base*tamanoNumero)+ adicionalNumero; 
        return precioGeneral;

    } 
    
} 
