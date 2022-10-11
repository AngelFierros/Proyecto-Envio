/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.envio.entidades;

/**
 * Representa el paquete
 * @author Angel Fierros
 */
public class Paquete {

    private double peso;
    private String presentacion;
    private boolean esMaterialFragil;
    private String consideraciones;
    
    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * El valor del peso en kilogramos del paquete.
     * @param peso Peso del paquete en kilos.
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the presentacion
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * @param presentacion the presentacion to set
     */
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    /**
     * @return the esMaterialFragil
     */
    public boolean isEsMaterialFragil() {
        return esMaterialFragil;
    }

    /**
     * @param esMaterialFragil the esMaterialFragil to set
     */
    public void setEsMaterialFragil(boolean esMaterialFragil) {
        this.esMaterialFragil = esMaterialFragil;
    }

    /**
     * @return the consideraciones
     */
    public String getConsideraciones() {
        return consideraciones;
    }

    /**
     * @param consideraciones the consideraciones to set
     */
    public void setConsideraciones(String consideraciones) {
        this.consideraciones = consideraciones;
    }
}
