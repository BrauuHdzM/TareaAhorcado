
package com.mycompany.tarearedesahorcado;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
     public static void main(String[] args )throws Exception{
//         Palabra palabra= new Palabra("Hola Dios");   
//         Juego juego = new Juego(3, palabra);
//         juego.iniciarJuego();
       try{
           Socket cl = new Socket("localhost", 3000);
            System.out.println("Conexion con servidor exitosa. Esperando juego...");
           // ObjectOutputStream oos = new ObjectOutputStream(cl.getOutputStream());
           // ObjectInputStream ois = new ObjectInputStream(cl.getInputStream());
            DataOutputStream dos = new DataOutputStream(cl.getOutputStream());
         
            System.out.println("Ingresa la dificultad: ");
            Scanner sc= new Scanner(System.in);
            int opcion= sc.nextInt();
            dos.writeUTF(Integer.toString(opcion));
            dos.flush();
            ObjectInputStream ois= new ObjectInputStream(cl.getInputStream());
            Palabra palabra= (Palabra)ois.readObject();
            Juego juego = new Juego(3, palabra);
            juego.iniciarJuego();
            
         ois.close();
         cl.close();
         
       } catch (Exception e) {
            e.printStackTrace();
        
       } 
     }
}

