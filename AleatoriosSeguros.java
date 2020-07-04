import java.security.SecureRandom;


public class AleatoriosSeguros {
    /**
     * Preincremento/Predecremento: actualizan el valor de inmediato, es instantaneo
     */
    
    public static void A(){
        int a=1;
        System.out.println(a++); //1 
        //se vera reflejado el valor incrementado en la siguiente uso de la variable pero no de inmediato
        System.out.println(a); //2
    }
    
    public static void B(){
        int a=1;
        System.out.println("preincremento: "+ ++a); //2 (el incremento fue instantaneo)
    }
    
    /**
     * programa que simula el lanzamiento de una moneda de manera segura 
     * (SecureRandom no es determinista como random por lo que no es predecible)
     */
    public static void a(){
        SecureRandom numerosAleatorios = new SecureRandom();
        //2 es el factor de escala en el sgte caso:
        int n = numerosAleatorios.nextInt(2); //nextInt() generará numeros entre [0,2[ (osea 0 o 1, el 2 no lo considera)
        System.out.printf(n+" ");
        //1 1 0 0 0 1 0 1 0 0
    }
    
    /** Lanzar un dado (1,6) e imprimir los valores de la sgte manera:
    1 5 3 6 2
    5 2 6 5 2
    4 4 4 2 6
    3 1 6 2 2
     */
    
    public static void b(){
        SecureRandom sr=new SecureRandom();
        int resultado=0;
        for (int i = 1; i <= 20; i++) { //parte en 1 para luego evaluar si i es multiplo de 5 e ir formateando manualmente la salida
            resultado=1+sr.nextInt(6); //el metodo retorna valores entre [0,5] por lo que debemos sumarle 1 y desplazar en 0 a 1, 1 a 2 y asi
            System.out.print(resultado+" ");
            if(i % 5 == 0){ 
                System.out.println(); //cuando se hayan imprimido 5 resultados pegamos un salto
            }
        }
        System.out.println();
    }
    
    /**
     * Lanzar un dado 6000 veces, luego guardar e imprimir la frecuencia de cada resultado 
     * pag 260 sumatra
     */
    
    public static void c(){
        SecureRandom sr=new SecureRandom();
        int cara=0;
        int frecuencias[]={0,0,0,0,0,0};
        for (int i = 1; i <= 6000; i++) {
            cara=1+sr.nextInt(6);
            ++frecuencias[cara-1];
            System.out.print(cara+" ");
            if(i % 60 == 0){
                System.out.println(); 
            }
        }
        System.out.println();
        for (int i = 0; i < frecuencias.length; i++) {
            System.out.println("frecuencia "+(i+1)+": "+frecuencias[i]);
        }
    }
    
    /**
     * Generar 100 aleatorios impares [1,3,5,7,9,...,19]
     int n = valorDesplazamiento + diferenciaEntreValores * numerosAleatorios.nextInt(factorEscala);
     */
    
    public static void d(){
        SecureRandom sr=new SecureRandom();
        int n;
        for (int i = 1; i <= 100; i++) {
            n=1+2*sr.nextInt(10);
            System.out.printf("%02d ",n);
            if(i%25==0){
                System.out.println();
            }
        }
    }
    /*
    15 17 13 09 17 01 09 15 01 17 13 17 17 13 15 11 11 19 15 07 01 07 07 11 15 
    19 09 15 01 09 17 09 09 13 15 17 15 09 07 09 13 11 15 19 17 01 05 13 17 03 
    11 17 17 15 09 07 19 01 17 05 19 01 07 17 07 05 17 03 03 19 13 09 09 13 15 
    01 17 13 05 13 17 17 09 03 11 19 07 07 07 15 15 17 09 17 15 19 19 13 07 19 
    */
    
    public static void e(){
        
    }
    
    public static void main(String[] args) {
        d();
    }
}
