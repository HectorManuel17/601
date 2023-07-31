package com.app.sockets.conexion;

import java.sql.*; //se importan las librerias de java a sql

public class Conexion {

    //variables para conectarse a la base de datos
    private static final String URL = "jdbc:mysql://localhost/chat";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    //variable para hacer una intancia
    private static Conexion instancia;
    
    //regresa la conexion a la base de datos
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    //cierra la conexion
    public void cerrarResultado(ResultSet resultado) {
        try {
            resultado.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    public void desconectar(Connection conexion) {
        try {
            conexion.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    public void cerrarStatement(PreparedStatement statement) {
        try {
            statement.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }
    
    //cra una instancia nueva si es nula y si no la retorna
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
