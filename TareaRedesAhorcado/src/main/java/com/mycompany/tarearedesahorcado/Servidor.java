
package com.mycompany.tarearedesahorcado;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args )throws Exception{
        try{
        ServerSocket ss = new ServerSocket(3000);
	System.out.println("Servidor iniciado");
        for(;;){
            Socket cl = ss.accept();
        }
        } catch (Exception e){
           e.printStackTrace();
        }
        //Palabra palabra= new Palabra("Dios ha muerto");
        //System.out.println(palabra.getEspacios());
        //Juego juego= new Juego(3,palabra);
        //System.out.println(juego.cadenaJuego);
    }
}
