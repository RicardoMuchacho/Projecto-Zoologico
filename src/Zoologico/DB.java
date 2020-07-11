package Zoologico;

import java.sql.*;

public class DB {
	private static DB DB = new DB();
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String driverDB = "org.postgresql.Driver";
	 private String dbName = "Zoologico";
	 private String urlDB = "jdbc:postgresql://localhost:5433/" + this.dbName; 
	private String userDB = "postgres";
	private String passDB = "admin";
	public String resultEspecie = "";
	public String resultHabitat = "";
	public Integer resultCantidad = 0;
	public String resultString = "";
	public String resultError = "";
	
	private DB(){
		try {
		Class.forName(driverDB);
		this.conn = DriverManager.getConnection(urlDB, userDB, passDB);
		System.out.println("Conexion establecida");
		} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		}
		} 
	public static DB getInstances() {
		return DB;
		} 
	
	public ResultSet dbStatement(String query) {
		int i = 1;
		try {
		this.stmt = this.conn.createStatement();
		this.rs = this.stmt.executeQuery(query);
		if(rs.next()) {
			resultString="";
		do {
			
	    resultString += "#"+ i+ "\n" +rs.getString("especie");
		resultString += "\n" + rs.getString("habitat");
		resultString += "\n"+ rs.getString("cantidad");
		resultString += ("\n\n");
		i++;
		} while(rs.next());
		} else {
			resultString += "No hay Resultados";
		}	
		} catch (SQLException e) {
		e.printStackTrace();
		}finally {
		try {
		this.stmt.close();
		this.rs.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		return rs;
	}
	
	public void dbPrepareStatementDelete(String query, String str) {
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setString(1, str);
			
			this.pstmt.executeUpdate();
			} catch (SQLException e) {
			e.printStackTrace();
			} finally {
			try {
			this.pstmt.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			 }
			} 
	
	
	public void dbPrepareStatement(String query, Object[] obj) {
		try {
		this.pstmt = this.conn.prepareStatement(query);
		this.pstmt.setString(1, (String) obj[0]);
		this.pstmt.setString(2, (String) obj[1]);
		this.pstmt.setInt(3, (int) obj[2]);
		this.pstmt.executeUpdate();
		} catch (SQLException e) {
		e.printStackTrace();
		} finally {
		try {
		this.pstmt.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		 }
		} 
	
	public void dbPrepareStatement4(String query, Object[] obj) {
		try {
		this.pstmt = this.conn.prepareStatement(query);
		this.pstmt.setString(1, (String) obj[0]);
		this.pstmt.setString(2, (String) obj[1]);
		this.pstmt.setInt(3, (int) obj[2]);
		this.pstmt.setString(4, (String) obj[2]);
		this.pstmt.executeUpdate();
		} catch (SQLException e) {
		e.printStackTrace();
		} finally {
		try {
		this.pstmt.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		 }
		} 
	
	public ResultSet dbStatementBusqueda(String query) {
		int i = 1;
		try {
		this.stmt = this.conn.createStatement();
		this.rs = this.stmt.executeQuery(query);
		if(rs.next()) {
			resultString="";
			resultEspecie="";
			resultHabitat="";
			resultCantidad=0;
			resultError="Encontrado";
		do {
			
	    resultEspecie = rs.getString("especie");
		resultHabitat = rs.getString("habitat");
		resultCantidad = Integer.parseInt(rs.getString("cantidad"));
		resultString += ("#"+i+"\n"+resultEspecie+"\n"+resultHabitat+"\n"+resultCantidad+"\n");
		i++;
		} while(rs.next());
		} else {
			resultError = "No hay Resultados";
			resultString="";
			resultEspecie="";
			resultHabitat="";
			resultCantidad=0;
		}	
		} catch (SQLException e) {
		e.printStackTrace();
		}finally {
		try {
		this.stmt.close();
		this.rs.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		return rs;
	}
	
	public void dbClose() {
		try {
		this.conn.close();
		System.out.println("Conexion cerrada");
		} catch (SQLException e) {
		e.printStackTrace();
		} 
	}
}