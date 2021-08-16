package utp.misiontic2022.c2.p56.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try{
            VentanaR1 vR1 = new VentanaR1();
            vR1.setVisible(true);
            ArrayList<Requerimiento_1> resultados = controlador.consultarRequerimiento1();
            vR1.generarTabla(resultados);
        }    
        catch(Exception e){
         System.out.println(e);

            }
    }

    public static void requerimiento2(){
        try {
            VentanaR2 vR2 = new VentanaR2();
            vR2.setVisible(true);
            ArrayList<Requerimiento_2> resultados = controlador.consultarRequerimiento2();
            vR2.generarTabla(resultados);
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            VentanaR3 vR3 = new VentanaR3();
            vR3.setVisible(true);
            ArrayList<Requerimiento_3> resultados = controlador.consultarRequerimiento3();
            vR3.generarTabla(resultados);
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
