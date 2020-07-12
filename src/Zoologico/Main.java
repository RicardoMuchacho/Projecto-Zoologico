package Zoologico;

import java.util.Scanner;

import java.util.ArrayList;

import Database.*;

public class Main {
	
	public static void main(String[] args) {
	
		String especieNueva, habitatNuevo;
		int cantidadNueva;
		int i, n, elementos;
		Object objetoActual;
		
        Scanner entrada = new Scanner(System.in);
        /*
	    Lista de animales:
	    Acuatico: pez, orca, foca, delfin, tiburon
	    Aereo: aguila, tucan, loro
	    Terrestre: cerdo, elefante, jirafa, leon, mono
	    Anfibio: axolotl, rana
	    */
		
		Animal zoologico[] = new Animal[15];
		
		zoologico[0] = new Acuatico("pez", "agua salada", 5, "pesceras");
		zoologico[1] = new Acuatico("orca", "agua salada", 1, "estanque grande");
		zoologico[2] = new Acuatico("foca", "agua dulce", 1, "estanque");
		zoologico[3] = new Acuatico("delfin", "agua dulce", 1, "estanque");
		zoologico[4] = new Acuatico("tiburon", "agua dulce", 1, "estanque");
		zoologico[5] = new Aereo("aguila", "desierto", 1, "jaula aerea");
		zoologico[6] = new Aereo("loro", "selva", 1, "jaula aerea");
		zoologico[7] = new Aereo("tucan", "selva", 1, "jaula aerea");
		zoologico[8] = new Terrestre("cerdo", "granja", 1, "jaula");
		zoologico[9] = new Terrestre("elefante", "sabana", 1, "jaula abierta");
		zoologico[10] = new Terrestre("jirafa", "sabana", 1, "jaula abierta");
		zoologico[11] = new Terrestre("leon", "sabana", 1, "jaula grande");
		zoologico[12] = new Terrestre("mono", "selva", 1, "jaula");
		zoologico[13] = new Anfibio("axolotl", "Lagunas", 1, "jaula con agua");
		zoologico[14] = new Anfibio("ranas", "Lagunas", 1, "jaula con agua");
		
		
		
ArrayList<Animal> zoo = new ArrayList();
for (i=0; i<zoologico.length;i++) {
zoo.add(zoologico[i]);
}

ArrayList<Object> objetos2 = new ArrayList();
for (i=0; i<zoologico.length;i++) {
objetos2.add(zoologico[i]);
}

ArrayList<Animal> animalesAcuaticos = new ArrayList();
for (i=0; i<5;i++) {
animalesAcuaticos.add(zoologico[i]);
}

ArrayList<Animal> animalesAereos = new ArrayList();
for (i=5; i<8;i++) {
animalesAereos.add(zoologico[i]);
}

ArrayList<Animal> animalesTerrestres = new ArrayList();
for (i=8; i<13;i++) {
animalesTerrestres.add(zoologico[i]);
}

ArrayList<Animal> animalesAnfibios = new ArrayList();
for (i=13; i<15;i++) {
animalesAnfibios.add(zoologico[i]);
}


//System.out.println(zoo.get(0).getEspecie());




	 		
	 		 
/*
 for(i=0; i<animalesAnfibios.size();i++) {
	System.out.println("\n" + animalesAnfibios.get(i)) ;
}
 
		String animalesZoo = new String();
		
		 		 for(i=0; i<zoologico.length;i++) {
		animalesZoo += "\n\n"+zoologico[i].toString();
	}
		 		System.out.println(animalesZoo) ;
		 		 
		 	
		zoologico[0].respirar();
		Acuatico pecesito = new Acuatico();
		pecesito.nadar();

		System.out.println("\ndesea agregar mas animales? 1=Si, 0=No");
		n = entrada.nextInt();
		
		if (n==0) {
			System.out.println("Sesion terminada.");
		} else {
				System.out.println("Ingrese cantidad de animales nuevos: ");
				elementos = entrada.nextInt();
				
				Animal nuevosAnimales[] = new Animal[elementos];
				
			for(i=0; i<elementos; i++) {
				System.out.println("\n"+ "#"+i+" Ingresar Especie del Animal: ");
				especieNueva = entrada.next();
				System.out.println("\n"+ "#"+i+" Ingresar habitat del Animal: ");
				habitatNuevo = entrada.next();
				System.out.println("\n"+ "#"+i+" Ingresar Cantidad del Animal: ");
				cantidadNueva = entrada.nextInt();
				
				nuevosAnimales[i] = new Animal(especieNueva, habitatNuevo, cantidadNueva);
			}
			System.out.println("Animales nuevos: ");
			for(i=0; i<elementos; i++) {
			System.out.println("\n"+ nuevosAnimales[i].toString());
		}
	}
*/
		
	UI2 ui = new UI2();
	
DB db = DB.getInstances();



//db.dbPrepareStatementStr1("select *from animales where especie = ", "pez");


/*

for(i=0; i<15;i++) {
	
Object [] obj = {zoo.get(i).getEspecie(), zoo.get(i).getHabitat(), zoo.get(i).getCantidad()};
	

db.dbPrepareStatement("insert into animales(especie, habitat, cantidad) values( ?, ?, ? )", obj );

}
//db.dbPrepareStatement("insert into animales(especie, habitat, cantidad) values( ?, ?, ? )", );


Object[] obj = {"pab", "pedrokk@gmail.com", 5};
db.dbPrepareStatement("insert into animales(especie, habitat, cantidad) values( ?, ?, ? )", obj);



//db.dbStatementBusqueda("SELECT *FROM animales WHERE especie ='"+ prueba1+"';");

System.out.println(db.resultString);
System.out.println(db.resultEspecie);
System.out.println(db.resultHabitat);
System.out.println(db.resultCantidad);
System.out.println(db.resultError);
*/
}
}