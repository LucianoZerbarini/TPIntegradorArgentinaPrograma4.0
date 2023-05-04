package com.mycompany.trabajointegrador.test;

import com.mycompany.trabajointegrador.entidades.Equipo;
import com.mycompany.trabajointegrador.entidades.Partido;

public class Test1 {
    public Test1() {
        super();
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Equipo equipo1 = new Equipo("ARGENTINA", "CAMPEON DEL MUNDO");
        Equipo equipo2 = new Equipo("ARABIA SAUDITA", "FLOTA EN PETROLEO");
        Partido partido = new Partido(equipo1, equipo2, 4, 5);
        System.out.println("El partido entre " +equipo1.getNombre() + " vs " +equipo2.getNombre());
        System.out.println("RESULTADO : " + partido.getResultado());
    }
}
