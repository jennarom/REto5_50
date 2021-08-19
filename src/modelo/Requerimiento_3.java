/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 57315
 */
public class Requerimiento_3 {
    
    private String nombreMaterial;
    private Integer precioUnidad;
    
    public Requerimiento_3() {        
    }

    public Requerimiento_3(String nombreMaterial, Integer precioUnidad) { 
        this.nombreMaterial = nombreMaterial;
        this.precioUnidad = precioUnidad;       
    }
    
    public String getNombreMaterial() {
        return nombreMaterial;
    }
    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }
    public Integer getPrecioUnidad() {
        return precioUnidad;
    }
    public void setPrecioUnidad(Integer precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    
}
