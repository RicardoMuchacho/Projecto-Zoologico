package Zoologico;

public class Acuatico extends Animal implements Nadar{

	private String estanque;
	
	public Acuatico() {
		super();
	}
	
	public Acuatico(String especie, String habitat, int cantidad, String estanque) {
		super(especie, habitat, cantidad);
		this.estanque = estanque;
	}

	@Override
	public void nadar() {
		System.out.println("Soy acuatico puedo nadar pero no correr");
	}
	

	public void respirar() {
		System.out.println("\nRespiro debajo del agua");
	}
	
	public void comer() {
		System.out.println("\nComo debajo del agua");
	}	
	
	public String toString() {
		return "Especie: " + this.getEspecie() + "\nHabitat: " + this.getHabitat()
		+"\nCantidad: "+ this.getCantidad()+"\njaula: "+ this.estanque;
}
	
}
