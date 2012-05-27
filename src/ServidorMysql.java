/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
// */

import java.sql.*;
import javax.swing.JOptionPane;

public class ServidorMysql
{
    Connection conexion = null;
    ResultSet ConjuntoResultado = null;
    Statement instruccion = null;
    Statement insertarDatos;

    public boolean coneccion(String host)
    {
        try
        {
            conexion = DriverManager.getConnection("jdbc:mysql://"+host+"/retiros",
                    "root", "admin");

        }
        catch (SQLException ex)
        {
            return false;
        }
        return true;
    }
    
    public boolean operacion(String peticion)
    {
        try 
        {
            insertarDatos = conexion.createStatement();
            insertarDatos.executeUpdate(peticion);

        }
        catch (SQLException ex) 
        {
            
            return false;
        }
        return true;
    }

    public boolean consulta(String consulta)
    {
        try
        {
            instruccion = conexion.createStatement();
            ConjuntoResultado = instruccion.executeQuery(consulta);
        }
        catch(SQLException e)
        {
            //JOptionPane.showMessageDialog(null,"No se puede hacer la consulta");
            return false;
        }
        return true;

    }


    public ServidorMysql()
    {
        try
        {
            //cargo los drivers
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException ex)
        {
           JOptionPane.showMessageDialog(null,"No se pueden cargar los controladores");
           System.exit(0);
        }
    }
}
