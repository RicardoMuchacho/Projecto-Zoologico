package Cliente;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
//import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
//NOTA la aplicación de la clase DataInputStream dentro de un
//BufferedReader esta obsoleta en cambio usar InputStreamReader

	
public class ClienteConexion {
		
		// Se inicializa el socket y los output Stream
	 public String resultLine = "";
	 public String resultLine2 = "";
		 private Socket socket = null;
		 private DataOutputStream out = null;
		 private BufferedReader br = null;
		 private DataInputStream in = null;
		 
		 
		 
		 
		 ClienteConexion(String especie){
			
		 try {
		 //crea un objeto socket para la conexión con el server para ello se necesita de la ip y el puerto
		 if (socket ==null) {
			 socket = new Socket("localhost", 3000);
		 }
		
		 out = new DataOutputStream(socket.getOutputStream());
		  
		 try{
		
		 out.writeUTF(especie);
		 }
		 catch(IOException err){
		 System.out.println(err);
		 }
		 
		 in = new DataInputStream(new
				 BufferedInputStream(socket.getInputStream()));
		 

		 try{
			 // Lee el mensaje enviado
			 resultLine = in.readUTF();
			 resultLine2 = in.readUTF();
			
			 System.out.println(resultLine);
			 System.out.println(resultLine2);

			 }
			 catch(IOException err) {
			 System.out.println(err);
			 
			 }
		 
		 
		 
		 // Cierra las conexiones
		 System.out.println("Cerrando Conexion");
		 //input.close();
		 in.close();
		 out.close();
		 socket.close();
		 
		 }catch(IOException err) {
		 System.out.println(err);
		 }
		 }
		}
