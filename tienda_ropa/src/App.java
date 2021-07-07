public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("MI TIENDA ROPA");


        Producto productoUno= new Producto();
        //establecer la relacion con el otro archivo para que muestre un mensaje
        //esto con tipo de objeto en mayuscula, y luego nombre del objeto
        //Y se establece el constructor
        //un objeto de la clases Producto, que se llama productoUno
        // Producto productoDos= new Producto();, por ejemplo
        
        
        productoUno.setNombre("Camisa");
        //Aqui ya se puede establecer los atributos del objeto, recurriendo al archivo
        //AQUI SE PUEDE COLOCAR UN INGRESO POR CONSOLA, COMO EN PYTHON
        productoUno.setPrecio(65000.0);

        productoUno.mostrar();  
        //Al igual que esta funcion que va a recurrir a MOSTRAR LA INFO 

    }
}
