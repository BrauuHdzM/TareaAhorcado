
package com.mycompany.tarearedesahorcado;

import java.util.Scanner;

public class Juego {
    int vidas;
    int dificultad;
    Palabra palabra;
    String cadenaJuego;

    public Juego(int vidas, Palabra palabra) {
        this.vidas = vidas;
        this.palabra = palabra;
        this.cadenaJuego = ("_ ").repeat(palabra.getLongitud());
    }
    
    public void iniciarJuego(){
        Scanner sc= new Scanner(System.in);
        while(true){
            char letra='_';
            System.out.println("Tus vidas: " + vidas);
            System.out.println("La cadena: " + cadenaJuego);
            System.out.println("Ingresa la letra: ");
            letra= sc.next().charAt(0);
        //for(var letraPal:palabra.getCadena()){
            
        }
    }
    
    
}
