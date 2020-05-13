/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.*;


/**
 *
 * @author fer
 */
public class ConexionBD {

    
  private final String db = "fjimenez_proyecto";
  /** usuario */
  private final String user = "fermin";
  private final String user2 = "Usuario2";
  /** contraseña de MySql*/
  private final String password = "Password1!*";
  private final String password2 = "Password2!*";
  /** Cadena de conexion */
  private String url = "jdbc:mysql://fjimenez.salesianas.es/"+db;
  /** variable para trabajar con la conexion a la base de datos */
  private Connection cn = null;
  
  private String exito;

  
  
   /** Constructor de clase */
   public ConexionBD(){
        this.url = "jdbc:mysql://fjimenez.salesianas.es/"+this.db;
       try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         cn = DriverManager.getConnection( this.url, this.user , this.password );  
         exito = "Conexion a la base de datos correcta";
           //System.out.println("Conexion correcta");
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }catch(ClassNotFoundException e){
         System.err.println( e.getMessage() );
      }
   }
   
      public ConexionBD(int numero){
        this.url = "jdbc:mysql://fjimenez.salesianas.es/"+this.db;
       try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         cn = DriverManager.getConnection( this.url, this.user2 , this.password2 );  
         exito = "Conexion a la base de datos correcta";
           //System.out.println("Conexion correcta");
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }catch(ClassNotFoundException e){
         System.err.println( e.getMessage() );
      }
   }
     
   public Connection getConexion() {
    return this.cn;
   }
   
   public String getString () {
       return exito;
   }
}
