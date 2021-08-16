public class Pedido extends Hamburguesa { 
    // Atributos 
    private double precioTotalHamburguesas; 
    private double precioTotalHamburguesasNormal; 
    private double precioTotalHamburguesasPatacon; 
    private Hamburguesa listaHamburguesas[]; 
 
    //Constructores 
    public Pedido() { 
    } 
    // Constructor sobrecargado 
    public Pedido(Hamburguesa listaHamburguesas[]) {
        this.listaHamburguesas = listaHamburguesas;

 
    } 
 
    // Métodos 
    // Getters y setters de ser necesarios 
    // Método calcularTotales 
    public void calcularTotales() {
    // Cálculos necesarios
        for (int i=0; i<listaHamburguesas.length;i++){
            precioTotalHamburguesas+=(listaHamburguesas[i].calcularPrecio());
            if (listaHamburguesas[i] instanceof HamburguesaNormal){
                precioTotalHamburguesasNormal+=(listaHamburguesas[i].calcularPrecio());
            }
            else if (listaHamburguesas[i] instanceof HamburguesaPatacon){
                precioTotalHamburguesasPatacon+=(listaHamburguesas[i].calcularPrecio());
            }

            
            }
    } 
 
    // Método mostrarTotales 
    public String mostrarTotales() { 
        calcularTotales(); 
        String cadenaTotales = "El precio total de las hamburguesas es de " + precioTotalHamburguesas 
                                + "\nLa suma del precio de las hamburguesas normales es de " + precioTotalHamburguesasNormal 
                                + "\nLa suma del precio de las hamburguesas patacón es de " + precioTotalHamburguesasPatacon; 
        return cadenaTotales; 
    } 
}