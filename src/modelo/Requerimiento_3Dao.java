/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.JDBCUtilities;
/**
 *
 * @author 57315
 */
public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3>respuesta = new ArrayList<>();
        Connection connection = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT Nombre_Material, MAX(Precio_Unidad) as Max_Precio_Unidad FROM MaterialConstruccion mc GROUP BY Nombre_Material HAVING MAX(Precio_Unidad)>1500";
            
            try (Statement statement = connection.createStatement(); ResultSet rset = statement.executeQuery(consulta)) {
                
                while(rset.next()){
                    Requerimiento_3 requerimiento3VO = new Requerimiento_3();
                    requerimiento3VO.setNombreMaterial(rset.getString("Nombre_Material"));
                    requerimiento3VO.setPrecioUnidad(rset.getInt("Max_Precio_Unidad"));

                    respuesta.add(requerimiento3VO);
                }
            }
    
            } catch (SQLException e) {
                System.err.println("Error consulta 3: "+ e);
                
            } finally {
                if (connection != null) {
                    connection.close();
                }            
            }
            return respuesta;
        }
    
}
