/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author fer
 */
public class Actor {
/**
 * definimos atributos
 * @param nombre nombre actor
 * @param apellidos actor
 * @param nacionalidad actor 
 * @param edad actor  
 */
    private String nombre,apellidos,nacionalidad;
    private int edad;
/**
 * Constructor vacio   
 */
    public Actor () {
    	
    }
/**
 * constructor parametizado   
 * @param nombre
 * @param apellidos
 * @param edad
 * @param nacionalidad
 */
    public Actor(String nombre,String apellidos,int edad,String nacionalidad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }
/**
 * Gets and Sets
 * @return
 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
/**
 * metodo toString
 */
	@Override
	public String toString() {
		return "Actor [nombre=" + nombre + ", apellidos=" + apellidos + ", nacionalidad=" + nacionalidad + ", edad="
				+ edad + "]";
	} 
}