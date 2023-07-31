package com.app.sockets.dao;

import com.app.sockets.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConversacionImpl implements ConversacionDAO {

    //se hace una instancia a la clse conexion
    Conexion instanciaMySQL = Conexion.getInstance();

    @Override
    public void registrarConversacionA(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        //registrar los mensajes en bases de datos
        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(conversacionA) values(?)");

            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    @Override
    public void registrarConversacionB(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(conversacionB) values(?)");

            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

}