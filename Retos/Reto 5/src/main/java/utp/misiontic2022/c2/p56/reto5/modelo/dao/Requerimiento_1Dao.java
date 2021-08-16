package utp.misiontic2022.c2.p56.reto5.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto5.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p56.reto5.util.JDBCUtilities;

public class Requerimiento_1Dao {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> salida = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        try{
            String query1 ="SELECT mc.Nombre_Material, mc.Precio_Unidad, p.ID_Proyecto FROM Proyecto p "+
            "JOIN Compra c ON p.ID_Proyecto =c.ID_Proyecto "+
            "JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion "+
            "WHERE p.Ciudad = 'Ibague' AND mc.Importado ='Si' "+
            "LIMIT 100;";
            
            ResultSet resultado1 = conexion.ejecutarConsulta(query1);
            while (resultado1.next()){
                String nombreMaterial = resultado1.getString("Nombre_Material");
                Integer precio = resultado1.getInt("Precio_Unidad");
                Integer id= resultado1.getInt("ID_Proyecto");

                salida.add(new Requerimiento_1(nombreMaterial, precio, id));

            }
        } catch(Exception e){
            System.err.println(e);
        }


        return salida;
    }
}