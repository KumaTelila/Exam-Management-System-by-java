/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;

/**
 *
 * @author bb
 */
/*public class ConnectionProvider {

    public static void main (String[] args) throws SQLException {

        Connection Con = DriverManager.getConnection ("com.mysql.cj.jdbc.Driver");

        try {
            Statement Stmt = Con.createStatement ();

            try {
                try {
                    Stmt.execute ("CREATE DATABASE qems");
                    Stmt.execute ("CREATE TABLE question (id varchar(10), name varchar(500), opt1 varchar(500), opt2 varchar(500), opt3 varchar(500), opt4 varchar(500), answer varchar(500))");
                    Con.commit ();
                } catch (SQLException exception) {
                    // Okay if database exists
                    Stmt.execute("OPEN DATABASE qems");
                }

                // Insert one row, column value = "Hello World"
                Stmt.executeUpdate ("INSERT INTO hello_table VALUES (\"Hello World\")");
                Con.commit ();
                ResultSet RS = Stmt.executeQuery ("SELECT * FROM hello_table");

                try {
                    while (RS.next() != false) {
                        System.out.println (RS.getString (1));
                    }
                } finally {
                    RS.close ();
                }

            } finally {
                Stmt.close ();
            }

        } catch (SQLException exception) {
            System.err.println ("SQLException : " + exception.toString ());
        } finally {
            Con.close ();
        }
    }
}*/
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qems","root","");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
    
}

