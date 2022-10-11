/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.envio.entidades;

import java.util.Date;
import java.util.List;
import mx.itson.envio.enumeradores.EstadoEnvio;
import mx.itson.envio.enumeradores.TransporteEnvio;

/**
 * Representa los atributos del envío realizado por la paquetería.
 * @author Angel Fierros
 */
public class Envio {

    private Paquete paquete;
    private Destinatario destinatario;
    private Remitente remitente;
    private EstadoEnvio estado;
    private List<Trayectoria> trayectorias;
    private String numeroGuia;
    private Date fechaGeneracion;
    private TransporteEnvio tipo;
    
    /**
     * @return the paquete
     */
    public Paquete getPaquete() {
        return paquete;
    }

    /**
     * @param paquete the paquete to set
     */
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    /**
     * @return the destinatario
     */
    public Destinatario getDestinatario() {
        return destinatario;
    }

    /**
     * @param destinatario the destinatario to set
     */
    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * @return the remitente
     */
    public Remitente getRemitente() {
        return remitente;
    }

    /**
     * @param remitente the remitente to set
     */
    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }

    /**
     * @return the estado
     */
    public EstadoEnvio getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }

    /**
     * @return the trayectorias
     */
    public List<Trayectoria> getTrayectorias() {
        return trayectorias;
    }

    /**
     * @param trayectorias the trayectorias to set
     */
    public void setTrayectorias(List<Trayectoria> trayectorias) {
        this.trayectorias = trayectorias;
    }

    /**
     * @return the numeroGuia
     */
    public String getNumeroGuia() {
        return numeroGuia;
    }

    /**
     * @param numeroGuia the numeroGuia to set
     */
    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    /**
     * @return the fechaGeneracion
     */
    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    /**
     * @param fechaGeneracion the fechaGeneracion to set
     */
    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    /**
     * @return the tipo
     */
    public TransporteEnvio getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TransporteEnvio tipo) {
        this.tipo = tipo;
    }
    

    
}
