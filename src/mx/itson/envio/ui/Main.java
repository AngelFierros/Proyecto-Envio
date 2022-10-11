/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.envio.ui;

import mx.itson.envio.enumeradores.EstadoEnvio;
import mx.itson.envio.entidades.Envio;
import mx.itson.envio.entidades.Sucursal;
import mx.itson.envio.entidades.Ciudad;
import mx.itson.envio.entidades.Destinatario;
import mx.itson.envio.entidades.Remitente;
import mx.itson.envio.entidades.Paquete;
import mx.itson.envio.entidades.Trayectoria;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Angel Fierros
 */
public class Main {
    public static void main(String[] args) {
        
        Envio envio = new Envio();
        
        Paquete paquete = new Paquete();
        paquete.setPeso(3.7);
        paquete.setPresentacion("Caja");
        paquete.setEsMaterialFragil(false);
        paquete.setConsideraciones("No estar en contacto con humedad");
        envio.setPaquete(paquete);
        
        Destinatario destinatario = new Destinatario();
        destinatario.setNombre("Carolina Valdez");
        destinatario.setDomicilio("Calle 3 Las Lomas");
        destinatario.setCp("86450");
        destinatario.setTelefono("6221127502");
        envio.setDestinatario(destinatario);
        
        Remitente remitente = new Remitente();
        remitente.setNombre("Mario Alberto Álvarez");
        remitente.setDomicilio("Mar asiátioco #27");
        remitente.setTelefono("6221240971");
        remitente.setCp("86900");
        remitente.setReferencias("Casa azul de dos pisos con un perro echado en la calle");
        envio.setRemitente(remitente);
        
        envio.setEstado(EstadoEnvio.ENTREGADO);
        
        List<Trayectoria> trayectorias = new ArrayList<>();
        
        Trayectoria t1 = new Trayectoria();
        t1.setFecha(new Date());
        t1.setDescripcion("Detenido en almacén por inspección de aduana");
        
        Sucursal sucursal1 = new Sucursal();
        sucursal1.setNombre("DHL Matriz");
        sucursal1.setDireccion("Calle centro avenida 3 y 4");
        sucursal1.setTelefono("6222244061");
        
        Ciudad ciudad1 = new Ciudad();
        ciudad1.setNombre("Las Palmas, BCS");
        
        sucursal1.setCiudad(ciudad1);
        
        t1.setSucursal(sucursal1);
        
        trayectorias.add(t1);
        
        envio.setTrayectorias(trayectorias);
        
        
        
        
        System.out.println(" ***Envios*** ");
        
        System.out.println("");
        
        System.out.println("Paquete:");
        System.out.println("Peso: " + envio.getPaquete().getPeso()+ " Kg");
        System.out.println("Presentacion: " + envio.getPaquete().getPresentacion());
        System.out.println("Es material fragil: " + envio.getPaquete().isEsMaterialFragil());
        System.out.println("Consideraciones: " + envio.getPaquete().getConsideraciones());
        
        System.out.println("");
        
        System.out.println("Destinatario:");
        System.out.println("Nombre: " + envio.getDestinatario().getNombre());
        System.out.println("Domicilio " + envio.getDestinatario().getDomicilio());
        System.out.println("Telefono: " + envio.getDestinatario().getTelefono());
        System.out.println("Destinatario: " + envio.getDestinatario().getCp());
        
        System.out.println("");
        
        System.out.println("Remitente:");
        System.out.println("Nombre: " + envio.getRemitente().getNombre());
        System.out.println("Domicilio: " + envio.getRemitente().getDomicilio());
        System.out.println("Telefono: " + envio.getRemitente().getTelefono());
        System.out.println("Cp: " + envio.getRemitente().getCp());
        System.out.println("Referencias: " + envio.getRemitente().getReferencias());
        
        System.out.println("");
        
        System.out.println("Estado del paquete:");
        System.out.println(envio.getEstado());
        
        System.out.println("");
        
        System.out.println("Trayectoria: ");
        for(Trayectoria t : envio.getTrayectorias()){
            System.out.println(t.getDescripcion());
        }
        
        System.out.println("");
        
        System.out.println("Sucursal: ");
        System.out.println("Nombre: " + sucursal1.getNombre());
        System.out.println("Telefono: " + sucursal1.getTelefono());
        System.out.println("Direccion: " + sucursal1.getDireccion());
        
        System.out.println("");
        
        System.out.println("Ciudad: ");
        System.out.println(ciudad1.getNombre());
        
        }
    }

