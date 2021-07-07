

public class Producto {
    //se establece un modificador, clase y nombre
    //Diferentes modificadores, public, final o ninguna
    //Public visible para todos
    //final, ultima definicion. no podra tener subclases
    //ninguna, solo visibles por clases del paquete




    private String nombre = "";
    //Se crea in atributo, estableciendolo vacio

    private Double precio = 0.0;
    //Otro atributo, lo de dinero recomendado manejarlo decimal 
    //Manejandolo con double, decimales grandes por si acaso
    //Valor inicial de 0.0

    //Aqui deben ir los atributos
    //Tambien puden tener modificadores, tipos, nombre y valroes por defecto
    //Public, private(solo accesible dentro de la clase, recomendado), protected(publico para paquetes e hijos)
    //final(solo 1 valor constante), static(compartido por todos los objetos, si cambia uno, todos los ven,  "Variable de clase")
    //ninguna
    //Constantes en mayus sostenida
    //Recomendado usar wrapper.. ?????



    public Producto(){

    }    

    //Aqui deben ir los constructores 
    //Constructor es una funcion/metodo, la principal de cada clase. Nombre es igual al de la clase. Da "vida"/valores iniciales al momento de crear la clase
    //Pueden haber varios, al haber varias maneras de crear un objeto 
    //No siempre se debe escribir. Java auto lo crea internamente si no se escribe 
    //No retornan ningun valor
    //Pueden ocurrir varias cosas ahi 




    public void mostrar() {
        System.out.println(nombre + ": " + precio);

    //no va a retornar nada por el momento, por eso void
    //Se dejan publicas precisamente para desde otras clases usarlas
    //Va vacia al no tener argumentos en los parametros
    //Se establece que saque en el sistema el atributo nombre y concatenado con el atributo precio

        
    
    }

    public void setNombre(String nombre){
        //Se establece un set y se coloca el tipo de dato y el nombre para empatarlo con el otro
        this.nombre = nombre;
        //Aqui para que no se confunda con el atributo, se coloca el "this" para que sepa que es de la clase y asi se pueda modificar
        //atributo es igual a string que se establece
        //o se puede colocar otro nombre al setter 
    }

    public void setPrecio(Double precio){
        this.precio=precio;
    }

    public String getNombre(){
        return this.nombre;
    }
    //Aqui se establece que retorna un string y dentro del metodo se hace efectivo

    public Double getPrecio(){
        return this.precio;
    }

    //Aqui se manejan metodos de acceso y mutadores(getter y setter) al ser privados los atributos 
    //Permiten modificar eso 
    //Acceso: leer los valores de variables
    //Mutadores: escribir/cambiar los valores de clase
    //DEBERIAN SER 2 POR CADA ATRIBUTO




    //Aqui deben ir los metodos 
    //Modificador: public, private, protected, final, static(llamados sin necesdiad de crear instancia de la clase ????)
    //tipo de retorno(que dato va a retornar o nada(void))
    //nombre: como se va llamar, nombre puede ayudar a saber que hace
    //parametro


}


//Clase abstracta: que no tiene objetos y solo se usa para heredar a partir de ella
//con modificador "abstract"
//Operacions abstractas, que no tienen metodo de implementtacion 




//interfaces: .... que carajos es esto???
//clase con metodos que van a ser sobreescritos, relacionado al polimorfismo??
//permite que clases sin importar jerarquia, implementen comportamientos comunes
//No tienen cuerpo, solo llaman metodos??
//es como un import, al implementar los metodos

//Si implemento metodos vacios, estoy obligado a sobreescribirlos 
//Esto para que se pueda implementar a diferentes clases y en cada una tenga un comportamiento diferente
//Esto con "implements {clasellamada}" estableciendo la clase y "@Override" llamando a los metodos de la interface

//El dilema es elegir entre clase abstracta o interfaz, VER VIDEO 
