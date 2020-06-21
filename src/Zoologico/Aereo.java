package Zoologico;

public class Aereo extends Animal {

	private String jaulaAerea;
	
	public Aereo() {
		super();
	}
	
	public Aereo(String especie, String habitat, int cantidad, String jaulaAerea) {
		super(especie, habitat, cantidad);
		this.jaulaAerea = jaulaAerea;
	}
	
	public void volar() {
		System.out.println("Soy Aereo, puedo volar");
	}

	public void respirar() {
		System.out.println("Respiro aire");
	}
	
	public String toString() {
		return "Especie: " + this.getEspecie() + "\nHabitat: " + this.getHabitat()
		+"\nCantidad: "+ this.getCantidad()+"\njaula: "+ this.jaulaAerea;
}
	
}

