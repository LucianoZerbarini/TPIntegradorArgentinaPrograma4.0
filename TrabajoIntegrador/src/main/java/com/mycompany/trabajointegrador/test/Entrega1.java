package com.mycompany.trabajointegrador.test;

import com.mycompany.trabajointegrador.entidades.Participante;
import com.mycompany.trabajointegrador.entidades.PronosticoParticipante;

public class Entrega1 {
    public Entrega1() {
        super();
    }

    public static void main(String[] args) {
        Entrega1 entrega1 = new Entrega1();
        Participante participante1 = new Participante("LUCHO","ZERBARINI","213213213");
        String rutaResultados = "C:\\Users\\LuchoZ\\Documents\\NetBeansProjects\\ArgentinaPrograma4.0\\TrabajoIntegrador\\resultados.csv";
        String rutaPronosticos = "C:\\Users\\LuchoZ\\Documents\\NetBeansProjects\\ArgentinaPrograma4.0\\TrabajoIntegrador\\pronostico.csv";
        int puntosPorAcierto = 1;
        PronosticoParticipante pronoPart = new PronosticoParticipante(participante1,rutaResultados,rutaPronosticos,puntosPorAcierto);
        pronoPart.leerArchivoResultados ();
        System.out.println(" ************************PROGRAMA ENTREGA1************************ ");
        System.out.println(" Participante : " );
        System.out.println(" Nombre : "+participante1.getNombre());
        System.out.println(" Apellido : "+participante1.getApellido());
        System.out.println(" DNI : "+participante1.getDni());
        System.out.println(" Ruta de Archivo de resultados : "+rutaResultados);
        System.out.println(" Ruta de Archivo de pronosticos de : "+participante1.getNombre()+" : "+rutaPronosticos);
        System.out.println(" Cantidad de aciertos : "+pronoPart.getAciertos());
        System.out.println(" Puntos finales : "+pronoPart.getPuntosPronostico());
        System.out.println(" ************************FIN PROGRAMA ENTREGA1************************ ");
    }
}
