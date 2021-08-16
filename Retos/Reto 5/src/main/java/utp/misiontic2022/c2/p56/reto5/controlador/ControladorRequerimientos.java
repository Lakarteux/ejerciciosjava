package utp.misiontic2022.c2.p56.reto5.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto5.modelo.dao.*;
import utp.misiontic2022.c2.p56.reto5.modelo.vo.*;

public class ControladorRequerimientos {

    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        Requerimiento_1Dao r1 = new Requerimiento_1Dao();
        ArrayList<Requerimiento_1> resultados = r1.requerimiento1();
        return resultados;
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        Requerimiento_2Dao r2 = new Requerimiento_2Dao();
        ArrayList<Requerimiento_2>resultados = r2.requerimiento2();
        return resultados;
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        Requerimiento_3Dao r3 = new Requerimiento_3Dao();
        ArrayList<Requerimiento_3>resultados = r3.requerimiento3();
        return resultados;
    }
}
