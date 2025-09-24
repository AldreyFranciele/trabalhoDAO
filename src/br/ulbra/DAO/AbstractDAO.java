/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno.saolucas
 */
public class AbstractDAO {
    private static final String DRIVER = "com.msql.jdbc.drive";
    private static final String URL = "jdbc:mysql://localhost:3306/bdaulabanco";
    private static final String USER="root";
    private static final String PASS = "";
    
    public static Connection getConnection()throws SQLException{
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
        }catch(ClassNotFoundException |  SQLException ex){
        JOptionPane.showMessageDialog(null, "error"+ex.getMessage());
        return null;
        
        }
            }
    
}
