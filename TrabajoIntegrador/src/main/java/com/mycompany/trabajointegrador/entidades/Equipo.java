package com.mycompany.trabajointegrador.entidades;

import java.util.List;


public class Equipo {
	
    public Equipo() {
        super();
    }
    
    public Equipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion; 
    }
    
        private String nombre = null;
        private String descripcion = null;

        private List<Partido> partidos;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
}
