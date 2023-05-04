package com.mycompany.trabajointegrador.entidades;

public class Pronostico {

	public Pronostico() {
		super();
	}
	public Pronostico(Partido ptido, Participante pte, int res) {
        this.partido = ptido;
        this.participante = pte;
        this.resultado = ptido.getResultado();
    }
    
    Partido partido = null;
    Participante participante = null;
    int resultado;
    int puntos;
    
    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getResultado() {
        return resultado;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }
}
