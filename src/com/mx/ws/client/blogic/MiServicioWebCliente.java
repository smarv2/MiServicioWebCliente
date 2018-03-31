/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ws.client.blogic;

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
        String nombre;
        String saludo = null;
        nombre = "Mario Alan Ramirez Vazquez";
        try {
            saludo = saluda(nombre);    
        } catch (Exception e) {
            LOG.error("Error en la respuesta del WS.", e);
        }
        
        LOG.info(saludo);
    }

    private static String saluda(java.lang.String arg0) {
        com.mx.ws.client.cliente.MiServicioWebService service = new com.mx.ws.client.cliente.MiServicioWebService();
        com.mx.ws.client.cliente.MiServicioWeb port = service.getMiServicioWebPort();
        return port.saluda(arg0);
    }
    
}
