package com.app.sockets.chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

//runable es para que los hilos esten en su proceso
//obserbable para decif que hay un cambio de datos
public class Servidor extends Observable implements Runnable {

    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
    }
 //creamos el socket
    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket socket = null;
        DataInputStream entrada;

        try {
            //servidor del socket
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");

            //Siempre estara escuchando peticiones
            while (true) {
                //Espero que el cliente se contecte
                socket = servidor.accept();
                System.out.println("Cliente conectado");
                entrada = new DataInputStream(socket.getInputStream());

                //Leemos el mensaje
                String mensaje = entrada.readUTF();
                System.out.println(mensaje);

                //Se establece que han ocurrido cambios
                this.setChanged();
                // Se notifican esos cambios
                this.notifyObservers(mensaje);
                //selimpian esos cambios
                this.clearChanged();

                socket.close();
                System.out.println("Cliente desconectado");
            }
        } catch (IOException error) {
            System.out.println(error);
        }
    }

}
