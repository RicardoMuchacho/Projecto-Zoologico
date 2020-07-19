package Server;

import Database .*;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConexion {
 //Inicialización del servidor y del Input Stream
 private Socket socket = null;
 private ServerSocket server = null;
 private DataInputStream in = null;
 private DataOutputStream out = null;
 
 DB db = DB.getInstances();
 
 public ServerConexion(){
	 int i = 0 ;
	
 //El constructor Crea el Servidor en un Puerto específico en este caso el 3000, y espera la conexión
	 while(i==0) {
 try{

	 if (server==null) {
 server = new ServerSocket(3000);
 }

 System.out.println("Servidor Inicio");
 System.out.println("Esperando por un cliente ...");
 // Una vez se acepte una conexión el socket se habrá creado
 socket = server.accept();
 System.out.println("Cliente con la dirección: " +
 socket.getRemoteSocketAddress().toString()
+ " Se ha conectado");
 
 
 // Obtiene la data enviada desde el cliente
 in = new DataInputStream(new
BufferedInputStream(socket.getInputStream()));
 // Lee mensajes hasta que el usuario envíe Over, en cuyo caso cierra las conexiones
 

 String line = "";
 
 try{
 // Lee el mensaje enviado
 line = in.readUTF();
 db.dbStatementBusqueda("SELECT *FROM animales WHERE especie = '"+ line.toLowerCase() +"';");
 }
 catch(IOException err) {
 System.out.println(err);
 
 }
 
 out = new DataOutputStream(socket.getOutputStream());
 out.writeUTF("Especie: "+db.resultEspecie + "\nHabitat: " + db.resultHabitat + 
		 "\nCantidad: "+ String.valueOf(db.resultCantidad));
 out.writeUTF(db.resultError);
 
 
  //Cierra las conexiones
 System.out.println("Cerrando Conexion");
 socket.close();
 in.close();
 out.close();
 }
 catch(IOException err) {
 System.out.println(err);
 }
	 }
 
	 
 }
}
