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
public class Requerimiento_2 {
    
    private String constructora;
    private String ciudad;
    private Double porcentajeCuotaInicial;
    private String tipo;

    public Requerimiento_2() {        
    }

    public Requerimiento_2(String constructora, String ciudad, Double porcentajeCuotaInicial, String tipo) {
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.porcentajeCuotaInicial = porcentajeCuotaInicial;
        this.tipo = tipo;        
    }
    
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public Double getPorcentajeCuotaInicial() {
        return porcentajeCuotaInicial;
    }
    public void setPorcentajeCuotaInicial(Double porcentajeCuotaInicial) {
        this.porcentajeCuotaInicial = porcentajeCuotaInicial;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
