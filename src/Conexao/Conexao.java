/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import Classes.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexao {
    
   
    
    public static Connection getConnection() {
        
        config CF;
        CF = new config();
        CF = (config) arquivo.le();
        String server = CF.getServer();
        String porta = CF.getPorta();
        String banco = CF.getBanco();
        String user = CF.getUser();
        String password = CF.getPassword();

        String strcon="jdbc:mysql://"+server+":"+porta+"/"+banco;
        
    	Connection conexao = null;
    	try
    	{
	    	Class.forName("com.mysql.jdbc.Driver"); 
	    	System.out.println("Driver carregado");
    	}
    	catch(ClassNotFoundException e)
    	{
    		System.out.println("Erro ao carregar o driver");
    	}

       try{
           conexao = DriverManager.getConnection(strcon, user , password );
           System.out.println("Conexão ok");
       }catch(SQLException e){
          System.out.println(e.getMessage());
          conexao = null;
       }
       
       return conexao;
       
   }



   public static void close(Connection conn, Statement stmt, ResultSet rs) {
       try{
           if (rs != null) rs.close();
           if (stmt != null) stmt.close();
           if (conn != null) conn.close();
       }catch(SQLException e){
    	   System.out.println(e.getMessage());
       }
   }
   
   
   public static void close(Connection conn, Statement stmt) {
       try{
           if (stmt != null) stmt.close();
           if (conn != null) conn.close();
       }catch(SQLException e){
    	   System.out.println(e.getMessage());
       }
   }
}
