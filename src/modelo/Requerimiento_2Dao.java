/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 57315
 */
public class Requerimiento_2Dao {
    
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> respuesta = new ArrayList<>();
        Connection connection = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT Constructora, Ciudad, Porcentaje_Cuota_Inicial, t.Area_Max ||' '|| t.Estrato as Tipo FROM Proyecto p INNER JOIN Tipo t on p.ID_Tipo = t.ID_Tipo WHERE Ciudad = 'Armenia' ORDER BY t.Area_Max, t.Estrato";            
            
            try (Statement statement = connection.createStatement(); ResultSet rset = statement.executeQuery(consulta)) {
                
                while(rset.next()){
                    Requerimiento_2 requerimiento2VO = new Requerimiento_2();
                    requerimiento2VO.setConstructora(rset.getString("Constructora"));
                    requerimiento2VO.setCiudad(rset.getString("Ciudad"));
                    requerimiento2VO.setPorcentajeCuotaInicial(rset.getDouble("Porcentaje_Cuota_Inicial"));
                    requerimiento2VO.setTipo(rset.getString("Tipo"));
                    
                    respuesta.add(requerimiento2VO);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error consulta 2: "+ e);
            
        } finally {
            if (connection != null) {
                connection.close();
            }            
        }
        return respuesta;
    }
    
}
