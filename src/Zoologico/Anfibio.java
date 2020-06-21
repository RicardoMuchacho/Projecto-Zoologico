package Zoologico;

public class Anfibio extends Terrestre implements Nadar {
	
	public Anfibio() {
	super();
}

	public Anfibio(String especie, String habitat, int cantidad, String jaula) {
		super(especie, habitat, cantidad, jaula);
	}
	
	@Override
	public void nadar() {
		System.out.println("Soy Anfibio, puedo nadar y correr");
	}
}