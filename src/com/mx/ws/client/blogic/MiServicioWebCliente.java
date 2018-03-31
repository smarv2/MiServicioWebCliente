/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ws.client.blogic;

import com.mx.ws.client.utilerias.Utilerias;
import java.util.Date;
import org.apache.log4j.Logger;

/**
 *
 * @author Mario Ramirez
 */
public class MiServicioWebCliente {

    /**
     * Campo LOG de tipo Logger.
     */
    protected static final Logger LOG = Logger.getLogger(MiServicioWebCliente.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LOG.info("<<Inicia proceso \"Mi Servicio Web Cliente\" "
                + Utilerias.dateToString(new Date(), "dd/MM/yyyy HH:mm:ss") + ">>");

        try {
            miServicioWebCliente();
        } catch (Exception e) {
            LOG.error("Error en \"MI Servicio Web Cliente\"", e);
        }
        
        LOG.info("<<Termina proceso \"Mi Servicio Web Cliente\" "
                + Utilerias.dateToString(new Date(), "dd/MM/yyyy HH:mm:ss") + ">>");

    }

    public static void miServicioWebCliente() {
        String nombre;
        String saludo = null;
        nombre = "Mario Alan Ramirez Vazquez";
        saludo = saluda(nombre);
        LOG.info(saludo);
    }

    private static String saluda(java.lang.String arg0) {
        com.mx.ws.client.cliente.MiServicioWebService service = new com.mx.ws.client.cliente.MiServicioWebService();
        com.mx.ws.client.cliente.MiServicioWeb port = service.getMiServicioWebPort();
        return port.saluda(arg0);
    }

}
