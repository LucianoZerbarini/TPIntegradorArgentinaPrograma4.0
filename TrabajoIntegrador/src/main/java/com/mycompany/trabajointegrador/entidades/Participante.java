package com.mycompany.trabajointegrador.entidades;

public class Participante {

	public Participante() {
		super();
	}
	public Participante(String nbre, String ap, String dni) {
        this.nombre = nbre;
        this.apellido = ap;
        this.dni = dni;
    }
    
    private String nombre = null;
    private String apellido = null;
    private String dni = null;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
}
