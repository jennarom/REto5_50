/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorRequerimientos;
import java.util.ArrayList;
import modelo.Requerimiento_1;
import java.sql.SQLException;
import modelo.Requerimiento_2;
import modelo.Requerimiento_3;

/**
 *
 * @author 57315
 */
public class VistaRequerimientos {
    
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        System.out.println("25 Proyectos Clasificados por Casa");
                
        try {            
            ArrayList<Requerimiento_1> requerimiento1l = controlador.consultarRequerimiento1();
            System.out.println("Clasificación por Casa");
            requerimiento1l.forEach(requerimiento_1 -> {
                System.out.printf("%s %s %s %s %s %s %n",requerimiento_1.getFechaInicio(),requerimiento_1.getConstructora(),
                        requerimiento_1.getCiudad(),requerimiento_1.getAcabados(),
                        requerimiento_1.getBancoVinculado(),requerimiento_1.getSerial());
            });    

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
    
public static void requerimiento2() {
        System.out.println("INNER JOIN");
        try {
            ArrayList<Requerimiento_2> requerimiento2l = controlador.consultarRequerimiento2();
            System.out.println("Concatenacion");
            for(Requerimiento_2 requerimiento_2: requerimiento2l){
                System.out.printf("%s %s %f %s %n",requerimiento_2.getConstructora(),requerimiento_2.getCiudad(),
                requerimiento_2.getPorcentajeCuotaInicial(),requerimiento_2.getTipo());
            }           
        } catch (Exception e) {
            System.err.println(e);
        }
    }

public static void requerimiento3() {
        System.out.println("-----Ranking Materiales-------"); 
        try {
            ArrayList<Requerimiento_3> requerimiento3l = controlador.consultarRequerimiento3();
            System.out.println("Materiales");
            for(Requerimiento_3 requerimiento_3 : requerimiento3l){
                System.out.printf("%s %d %n",requerimiento_3.getNombreMaterial(),requerimiento_3.getPrecioUnidad());
            }
      
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    
}
