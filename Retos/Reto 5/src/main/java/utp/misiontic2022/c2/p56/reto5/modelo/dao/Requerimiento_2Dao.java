package utp.misiontic2022.c2.p56.reto5.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto5.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p56.reto5.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        try{
            String query2 ="SELECT c.Proveedor, COUNT(c.Cantidad) AS 'Ventas' "+
            "FROM Compra c "+
            "GROUP BY c.Proveedor "+
            "ORDER BY Ventas DESC "+
            "LIMIT 100;";
            
            ResultSet resultado2 = conexion.ejecutarConsulta(query2);
            while (resultado2.next()){
                String proveedor = resultado2.getString("Proveedor");
                Integer ventas = resultado2.getInt("Ventas");

                resultados.add(new Requerimiento_2(proveedor,ventas));

            }
        } catch(Exception e){
            System.err.println(e);
        }


        return resultados;
    }
}