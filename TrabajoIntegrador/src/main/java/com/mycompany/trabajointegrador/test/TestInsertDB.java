package com.mycompany.trabajointegrador.test;

import java.sql.*;

public class TestInsertDB {
    public TestInsertDB() {
        super();
    }
    
    public static void main(String... ar)
            {
            try
            {
            String query1 =  "INSERT INTO RESULTADOS (GOLES_E1, GOLES_E2, EQUIPO1, EQUIPO2)"
                             + "VALUES (1, 2, 'ARGENTINA', 'ARABIA SAUDITA')";

            String query2 =  "INSERT INTO RESULTADOS (GOLES_E1, GOLES_E2, EQUIPO1, EQUIPO2)"
                             + "VALUES (2, 0, 'ARGENTINA', 'ARABIA SAUDITA')";

            
            //Loading and registering Oracle database thin driver			 
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Creating a connection between Java program and Oracle database.
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott", "tiger");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","prueba", "lucho23");

            //Creating a Statement object to excute SQL statements 
            Statement stmt = con.createStatement();

            //Executing a SQL INSERT query using executeUpdate()  method of Statement object.
            int count = stmt.executeUpdate(query1);
            System.out.println("Number of rows updated in database =  " + count);

            //Executing next SQL INSERT query using executeUpdate()  method of Statement object.
            count = stmt.executeUpdate(query2);
            System.out.println("Number of rows updated in database = " + count);

            
            }
            catch(Exception e)
            {
            System.out.println(e);
            }
            }
}