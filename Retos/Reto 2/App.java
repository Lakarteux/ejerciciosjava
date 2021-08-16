public class App { 
    public static void main(String[] args) throws Exception { 
 
        Hamburguesa listaHamburguesas[] = new Hamburguesa[4]; 
        listaHamburguesas[0] = new Hamburguesa("", true);
        listaHamburguesas[1] = new HamburguesaNormal("Normal", false, "Pollo apanado");
        listaHamburguesas[1].agregarAdicional("Tocineta");
        listaHamburguesas[2] = new HamburguesaPatacon("Normal", true, "Maduro"); 
        listaHamburguesas[3] = new HamburguesaNormal("Doble",true,"Res"); 
        Pedido nuevoPedido = new Pedido(listaHamburguesas); 
        System.out.println(nuevoPedido.mostrarTotales()); 
         	

        Hamburguesa listaHamburguesas2[] = new Hamburguesa[3];
        listaHamburguesas2[0] = new Hamburguesa("Doble", false);
        listaHamburguesas2[1] = new HamburguesaNormal("Doble", true, "Pollo apanado");;
        listaHamburguesas2[1].agregarAdicional("Tocineta");
        listaHamburguesas2[1].agregarAdicional("Jalapeño");
        listaHamburguesas2[2] = new HamburguesaPatacon("Normal", false, "Verde");
        Pedido nuevoPedido2 = new Pedido(listaHamburguesas2);
        System.out.println(nuevoPedido2.mostrarTotales());


    } 
}