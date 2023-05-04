package com.mycompany.trabajointegrador.entidades;

public class Partido {

	public Partido() {
		super();
	}
	public Partido(Equipo eq1,Equipo eq2,int golE1,int golE2 ) {
        this.equipo1 = eq1;
        this.equipo2 = eq2;
        this.golesEquipo1 = golE1;
        this.golesEquipo2 = golE2;
        this.resultado = calculaResultado(golE1,golE2);
    }
    
    private Equipo equipo1 = null;
    private Equipo equipo2 = null;
    private int golesEquipo1;
    private int golesEquipo2;
    private int resultado;


    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getResultado() {
        return resultado;
    }
    
    public int calculaResultado (int gol1, int gol2) // retorna 1 si gana equipo1, 0 empate y -1 si gana equipo2
    {
      int resultado = 0;
      if (gol1 > gol2) resultado =1;
      if (gol1 < gol2) resultado =-1;
      if (gol1 == gol2) resultado =0;
      
      
      return  resultado;
    }
}
