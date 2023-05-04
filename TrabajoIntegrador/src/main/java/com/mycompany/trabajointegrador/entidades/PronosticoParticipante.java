package com.mycompany.trabajointegrador.entidades;

import java.util.ArrayList;

import com.mycompany.trabajointegrador.entidades.Participante;
import com.mycompany.trabajointegrador.entidades.Pronostico;
import com.mycompany.trabajointegrador.util.LeePronostico;
import com.mycompany.trabajointegrador.util.LeeResultados;
import com.mycompany.trabajointegrador.entidades.Partido;

public class PronosticoParticipante {

	public PronosticoParticipante() {
		super();
	}
	public PronosticoParticipante(Participante ptipante,String rutaResult,String rutaProno, int ptoA ) {
        this.participante = ptipante;
        this.rutaResultados = rutaResult;
        this.rutaPronosticoParticipante = rutaProno;
        this.puntosXAcierto = ptoA;
        leerArchivoResultados ();
    }
    
    
    private Participante participante = null;
    private ArrayList<Pronostico> pronosticos = new ArrayList<>();
    private int aciertos;
    private String rutaResultados = null;
    private String rutaPronosticoParticipante = null;
    private int puntosXAcierto = 1;
    private int puntosPronostico;

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setRutaResultados(String rutaResultados) {
        this.rutaResultados = rutaResultados;
    }

    public String getRutaResultados() {
        return rutaResultados;
    }

    public void setRutaPronosticoParticipante(String rutaPronosticoParticipante) {
        this.rutaPronosticoParticipante = rutaPronosticoParticipante;
    }

    public String getRutaPronosticoParticipante() {
        return rutaPronosticoParticipante;
    }

    public void setPuntosXAcierto(int puntosXAcierto) {
        this.puntosXAcierto = puntosXAcierto;
    }

    public int getPuntosXAcierto() {
        return puntosXAcierto;
    }

    public void setPuntosPronostico(int puntosPronostico) {
        this.puntosPronostico = puntosPronostico;
    }

    public int getPuntosPronostico() {
        return puntosPronostico;
    }
    
    public void leerArchivoResultados (){
        ArrayList listResultados = new ArrayList();
        ArrayList listPronosticos = new ArrayList();
        int aciertosParcial = 0;
        LeeResultados leeRes = new LeeResultados(getRutaResultados());
        listResultados = leeRes.leeDeArchivo();
        
        LeePronostico leeProno = new LeePronostico(getRutaPronosticoParticipante());
        listPronosticos = leeProno.leeDeArchivo();
        
        //System.out.println(" listPronosticos.size() : "+listPronosticos.size());
        //System.out.println(" listResultados.size() : "+listResultados.size());
        
        for (int x = 0; x < listPronosticos.size(); x++) {
          String pronostico = listPronosticos.get(x).toString();
          String resultado =  listResultados.get(x).toString();
          System.out.println(" pronostico : "+pronostico);
          System.out.println(" resultado : "+resultado);
            if (pronostico.equalsIgnoreCase(resultado)){
                    aciertosParcial++;
                } 
        }
        setAciertos(aciertosParcial);
        setPuntosPronostico(getAciertos() * getPuntosXAcierto());
    }


    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getAciertos() {
        return aciertos;
    }
}
