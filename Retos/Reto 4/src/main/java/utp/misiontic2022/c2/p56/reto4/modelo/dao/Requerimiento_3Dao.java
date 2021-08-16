package utp.misiontic2022.c2.p56.reto4.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p56.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        // Por hacer
        try{
            String query3 ="SELECT p.Constructora, SUM(l.Salario) AS 'Costo de líderes' FROM Proyecto p "+ 
            "JOIN Lider l ON p.ID_Lider = l.ID_Lider "+ 
            "GROUP BY p.Constructora "+
            "HAVING SUM(l.Salario) > 40000000 "+
            "LIMIT 100; ";
            
            ResultSet resultado3 = conexion.ejecutarConsulta(query3);
            while (resultado3.next()){
                String constructora = resultado3.getString("Constructora");
                Integer costoLider = resultado3.getInt("Costo de Líderes");

                resultados.add(new Requerimiento_3(constructora,costoLider));

            }
        } catch(Exception e){
            System.err.println(e);
        }

        return resultados;
    }
}