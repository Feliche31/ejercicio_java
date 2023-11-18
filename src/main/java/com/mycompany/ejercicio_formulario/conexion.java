/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_formulario;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author felic
 */
public class conexion {
    Connection con;
    
    
    
    public void conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/registro", "root","");
            System.out.println("Se ha conectado a la base de datos");
        
        }catch (Exception e){
            System.err.println("No se pudo conectar a la base de datos"+e);
        
        }
                
            
    
    }  
    
    public Connection getConnection(){
        return con;
    }
    }

