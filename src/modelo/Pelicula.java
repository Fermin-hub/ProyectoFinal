/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import utilidades.Utilidades;
/**
 *
 * @author fer
 */
public class Pelicula {
/**
 * Atributos
 * @param titulo pelicula
 * @param resumen pelicula
 * @param anio pelicula
 * @param duracion pelicula
 * @param Actor
 */
    private String titulo,resumen;
    private int anio,duracion;
    private Actor actor;
/**
 * Constructor vacio  
 */
    public Pelicula() {
    	
    }
/**
 * Constructor parametizado    
 * @param titulo
 * @param anio
 * @param duracion
 * @param resumen
 */
    public Pelicula (String titulo, int anio,int duracion,String resumen ) {
        this.titulo = titulo;
        this.anio = anio;
        this.duracion = duracion;
        this.resumen = resumen;
    }
/**
 * Gets and Sets
 * @return
 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}
/**
 * metodo toString
 */
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", resumen=" + resumen + ", anio=" + anio + ", duracion=" + duracion
				+ ", actor=" + actor + "]";
	}
}