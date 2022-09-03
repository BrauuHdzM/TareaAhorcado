/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarearedesahorcado;

public class Palabra {
    private String cadena;
    private int longitud;
    private int mayusculas;
    private int espacios;

    public Palabra(String cadena) {
        this.cadena = cadena;
        this.longitud = cadena.length();
        this.mayusculas = (int) cadena.chars().filter(ch -> ch == Character.toUpperCase(ch)&& Character.isLetter(ch)).count();
        this.espacios =(int) cadena.chars().filter(ch -> ch == ' ').count();
    }
    
    public String getCadena() {
        return cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public int getMayusculas() {
        return mayusculas;
    }

    public int getEspacios() {
        return espacios;
    }

  
    
    
}
