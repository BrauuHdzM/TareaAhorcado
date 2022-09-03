
package com.mycompany.tarearedesahorcado;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {
     public static void main(String[] args )throws Exception{
       try{
           Socket cl = new Socket("localhost", 3000);
            System.out.println("Conexion con servidor exitosa. Esperando juego...");
            ObjectOutputStream oos = new ObjectOutputStream(cl.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(cl.getInputStream());
       } catch (Exception e) {
            e.printStackTrace();
        //Palabra palabra= new Palabra("Dios ha muerto");
        //System.out.println(palabra.getEspacios());
        }
     }
}

