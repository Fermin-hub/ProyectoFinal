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
    
    
    private String titulo,resumen;
    private int anio,duracion;
    private Actor actor;

    
    public Pelicula() {
    	
    }
    
    public Pelicula (String titulo, int anio,int duracion,String resumen ) {
        this.titulo = titulo;
        this.anio = anio;
        this.duracion = duracion;
        this.resumen = resumen;
    }

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

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", resumen=" + resumen + ", anio=" + anio + ", duracion=" + duracion
				+ ", actor=" + actor + "]";
	}
}