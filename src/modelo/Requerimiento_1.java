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
public class Requerimiento_1 {
    private String fechaInicio;
    private String constructora;
    private String ciudad;
    private String acabados;
    private String bancoVinculado;
    private String serial;

    
    public Requerimiento_1() {        
    }

    public Requerimiento_1(String fechaInicio, String constructora, String ciudad, String acabados, String bancovinculado, String serial) {
        this.fechaInicio = fechaInicio;
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.acabados = acabados;
        this.bancoVinculado = bancovinculado;
        this.serial = serial;        
    }

    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
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
    public String getAcabados() {
        return acabados;
    }
    public void setAcabados(String acabados) {
        this.acabados = acabados;
    }
    public String getBancoVinculado() {
        return bancoVinculado;
    }
    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    
}
