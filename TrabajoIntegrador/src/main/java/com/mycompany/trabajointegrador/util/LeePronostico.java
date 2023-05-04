package com.mycompany.trabajointegrador.util;

import com.mycompany.trabajointegrador.entidades.Equipo;
import com.mycompany.trabajointegrador.entidades.Partido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

public class LeePronostico {
    public LeePronostico() {
        super();
    }
    
    public LeePronostico(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    public static final String SEPARADOR = ",";
    String rutaArchivo = null;
    
    
    public ArrayList leeDeArchivo(){
            ArrayList listreult = new ArrayList();
            BufferedReader bufferLectura = null;
             try {
              // Abrir el .csv en buffer de lectura
              bufferLectura = new BufferedReader(new FileReader(getRutaArchivo()));
              
              // Leer una linea del archivo
              String linea = bufferLectura.readLine();
              
              while (linea != null) {
               // Sepapar la linea leída con el separador definido previamente
               String[] campos = linea.split(SEPARADOR);
               listreult.add(campos[0]);
               // Volver a leer otra línea del fichero
               linea = bufferLectura.readLine();
              }
             } 
             catch (Exception e) {
              e.printStackTrace();
             }
             finally {
              // Cierro el buffer de lectura
              if (bufferLectura != null) {
               try {
                bufferLectura.close();
               } 
               catch (IOException e) {
                e.printStackTrace();
               }
              }
             }
         return listreult;
         
        }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }
}