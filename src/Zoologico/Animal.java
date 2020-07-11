package Zoologico;

public class Animal {

	protected String especie;
	private String habitat;
	private int cantidad;

	// Constructor

	public Animal() {
	}

	public Animal(String especie, String habitat, int cantidad){
		this.especie = especie;
		this.habitat = habitat;
		this.cantidad = cantidad;
	}

	// Metodos
	// Setters y Getters

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void respirar() {
		System.out.println("\nRespirando");
	}
	
	public void comer() {
		System.out.println("Comiendo");
	}	
	
	public String toString() {
		return "Especie: " + this.getEspecie() + "\nHabitat: " + this.getHabitat()
		+"\nCantidad: "+ this.getCantidad();
	}
}
