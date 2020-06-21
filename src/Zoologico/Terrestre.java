package Zoologico;

public class Terrestre extends Animal {

	private String jaula;

	public Terrestre() {
		super();
	}

	public Terrestre(String especie, String habitat, int cantidad, String jaula) {
		super(especie, habitat, cantidad);
		this.jaula = jaula;
	}
	
	public void correr() {
		System.out.println("Soy Terrestre puedo correr");
	}
	
	public String toString() {
		return "Especie: " + this.getEspecie() + "\nHabitat: " + this.getHabitat()
		+"\nCantidad: "+ this.getCantidad()+"\njaula: "+ this.jaula;
}
}
