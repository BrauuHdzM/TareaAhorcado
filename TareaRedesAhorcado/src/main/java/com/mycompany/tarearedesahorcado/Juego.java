
package com.mycompany.tarearedesahorcado;

import java.util.Scanner;

public class Juego {
    int vidas;
    int dificultad;
    Palabra palabra;
    String cadenaJuego;
    boolean status= true;
    
    public Juego(int vidas, Palabra palabra) {
        this.vidas = vidas;
        this.palabra = palabra;
        this.cadenaJuego = ("_ ").repeat(palabra.getLongitud());
        validarLetra(' ');
    }
    
    public void iniciarJuego(){
        Scanner sc= new Scanner(System.in);
        while(status){
            char letra='_';
            System.out.println("Tus vidas: " + vidas);
            System.out.println("La cadena: " + cadenaJuego);
            System.out.println("Ingresa la letra: ");
            letra= sc.next().charAt(0);
            //validarLetra(letra);
            vidas -= validarLetra(letra)?0:1;
            if(!validarPalabra()){
                System.out.println("Felicidades, ¡ganaste!");
                System.out.println("La palabra es: " + cadenaJuego);
            }
            if(vidas == 0){
                System.out.println("Perdiste :(");
                status= false;
            }
        }
    }
    
    public boolean validarLetra(char letra){
        boolean bandera=false;
        
        for(int i = 0; i<palabra.getLongitud(); i++){
            if(letra == palabra.getCadena().charAt(i)){
                StringBuilder cadenaJuegoBuilder = new StringBuilder(cadenaJuego);
                cadenaJuegoBuilder.setCharAt(i+i, letra);
                cadenaJuego = cadenaJuegoBuilder.toString();
                bandera = true;
            }
        }
        return bandera;
    }
    
    public boolean validarPalabra(){
        if(cadenaJuego.indexOf("_") == -1){
            status=false;
        }
        return status;
    }
    
}
