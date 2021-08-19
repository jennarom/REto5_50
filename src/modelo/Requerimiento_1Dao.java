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
public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> respuesta = new ArrayList<>();
        Connection connection = JDBCUtilities.getConnection();                
        
        try {
            String consulta = "SELECT Fecha_Inicio, Constructora, Ciudad, Acabados, Banco_Vinculado, Serial FROM Proyecto WHERE Clasificacion = 'Casa' limit 25;";

            try (Statement statement = connection.createStatement(); ResultSet rset = statement.executeQuery(consulta)) {
                
                
                while (rset.next()) {
                    Requerimiento_1 requerimiento1VO = new Requerimiento_1();
                    requerimiento1VO.setFechaInicio(rset.getString("Fecha_Inicio"));
                    requerimiento1VO.setConstructora(rset.getString("Constructora"));
                    requerimiento1VO.setCiudad(rset.getString("Ciudad"));
                    requerimiento1VO.setBancoVinculado(rset.getString("Banco_Vinculado"));
                    requerimiento1VO.setAcabados(rset.getString("Acabados"));
                    requerimiento1VO.setSerial(rset.getString("Serial"));
                    
                    respuesta.add(requerimiento1VO);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error consulta 1: "+ e);
            
        } finally {
            if (connection != null) {
                connection.close();
            }            
        }
        return respuesta;
    }
}
