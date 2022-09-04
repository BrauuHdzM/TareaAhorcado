
package com.mycompany.tarearedesahorcado;

import java.io.DataInputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
public class Servidor {
    
    public static void main(String[] args )throws Exception{

        try{
        ServerSocket ss = new ServerSocket(3000);
	System.out.println("Servidor iniciado");
        for(;;){
            Socket cl = ss.accept();
            DataInputStream dis = new DataInputStream(cl.getInputStream());
            String opcion= dis.readUTF();
            ObjectOutputStream oos = new ObjectOutputStream(cl.getOutputStream());
               switch(opcion){
                    case "1":
                        oos.writeObject(getPalabra(leerArchivo("niveluno")));
                     break;
                 
                    case "2":
                        oos.writeObject(getPalabra(leerArchivo("niveldos")));
                     break;
                 
                    case "3":
                        oos.writeObject(getPalabra(leerArchivo("niveltres")));
                    break;
                }
               
         oos.close();
         cl.close();
        }
        
        } 
        catch (Exception e){
           e.printStackTrace();
        }
    }

    
    public static Palabra getPalabra(Palabra []palabras){
        int pos;
        Random r = new Random(); 
	pos = r.nextInt((9 - 0) + 1) + 0; 
        
        return palabras[pos];
    }
    
    public static Palabra[] leerArchivo(String archivo){
        Palabra[] palabras = new Palabra[10];
        try{
        String filePath = new File("").getAbsolutePath();
        BufferedReader bf = new BufferedReader(new FileReader(filePath+ "/"  +archivo+ ".txt"));
        
        for(int i=0; i<10; i++){
            //System.out.println(bf.readLine());
           palabras[i]= new Palabra(bf.readLine());
        }
        bf.close();
        } catch(IOException e){
            e.printStackTrace();
        }
      return palabras;
    }
}
