
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crisitan
 */
public class EjCadenas {
    /**
     * Leer una frase y encontrar la palabra de mayor longitud. El programa debe imprimir la palabra 
     * como el número de caracteres de la misma
     */
    public static void a(){
       Scanner inp=new Scanner(System.in);
       System.out.print("ingresa una frase: ");
       String s=inp.nextLine();
       s+=" ";
       String palabra="",pMostrar=null;
       int largoMayor=0;
       
       //for que ira verificando las palabras (una palabra tiene un espacio al principio y al fin excepto la 1ra y ultima)
        for (int i = 0; i < s.length(); i++) {
            //acumulador de caracteres que capturará una palabra hasta que aparezca espacio:
            palabra=palabra+s.charAt(i);
            if(s.charAt(i)==' '){ //con charAt se usa comillas simples o da error
                System.out.println(palabra);
                if(palabra.length()>largoMayor){
                    largoMayor=palabra.length();
                    pMostrar=palabra;
                }
                palabra=""; //se limpia luego de cada espacio
            }
        }
        System.out.println("Palabra mas larga: "+pMostrar+"\nLargo: "+pMostrar.length());
    }
    
    /** 
     *Ingresar una cadena y determinar cuantas palabras se encuentran en la cadena.
     * Cada palabra se separa por medio de un espacio en blanco. 
     */
    public static void b(){
        Scanner in=new Scanner(System.in);
        System.out.print("ing frase: ");
        String frase=in.nextLine();
        frase+=" "; //asi la ultima será considerada palabra sino no lo será
        String palabra="";
        int c=1;
        for (int i = 0; i < frase.length(); i++) {
            palabra=palabra+frase.charAt(i);
            //si pillamos un espacio:
            if(frase.charAt(i)==' '){
                //si al comparar el siguiente elemento no nos salimos del rango
                if(i+1<frase.length()){
                    //si el siguiente no es un espacio vacio:
                    if(frase.charAt(i+1) != ' '){
                        c+=1; 
                    }
                }
            }
        }
        System.out.println("Cantidad de palabras: "+c);
    }
    
    public static void c(){
        
        Scanner in=new Scanner(System.in);
        int i, con=1;
        String cadena, palabra="";

        System.out.println("Ingrese la cadena a evaluar: ");
        cadena=in.nextLine();
        for(i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==' '){
                con++;
            }
        }
        System.out.println("La cadena contiene "+con+" palabras");       
    }

    public static void main(String[] args) {
        b();
    }
    
    
}
