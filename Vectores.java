
import java.security.SecureRandom;

public class Vectores {
    //-------FORMAS DE DECLARAR UN ARRAY:---------
    //CORCHETE ANTES DEL NOMBRE: int[] array=new int[4];
    //CORCHETES DESPUES DEL NOMBRE: int array[]=new int[];
    //----------EN DOS PARTES:------------
    //String[] array;
    //array=new String[4];
    
    //String array[];
    //array=new String[4];
    //---------DECLARAR E INICIALIZAR EN LA MISMA LINEA------------
    //int array[]={1,3,5,7,9}
    
    public static void a(){
        //CORCHETE ANTES DEL NOMBRE: int[] array=new int[4];
        int n=0;
        int[] a=new int[4];
        for (int i = 0; i < a.length; i++) {
            n=(int)(Math.random()*10)+1;
            a[i]=n;
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+" ");
        }
        System.out.println();
        //5 10 7 2
    }
    
    public static void b(){
        int a[]=new int[5];
        llenaPrintArrays(a);
        //19 12 19 1 19 
    }
    
    public static void c(){
        int [] a; //es valido un espacio entre el tipo_dato y el corchete
        a=new int[8];
        llenaPrintArrays(a);
        //12 8 5 10 14 19 16 17
    }
    
    public static void d(){
        int  a []; //valido espacio entre nombre_array y corchete 
        a=new int[3];
        llenaPrintArrays(a);
        //9 6 10   
    }
    
    
    public static void e(){
        String[] vector={"x","y","z","w"};
        String a[]={"a","b","c","d"};
        imprimeArraysLetras(vector);
        imprimeArraysLetras(a);
        //x y z w 
        //a b c d 
    }
    
    //for-each sirve para recorrer arrays sin necesidad de usar una variable de control:
    public static void f(){
        double a[]=new double[6];
        llenaDouble(a);
        for(double i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    //misma version de f() pero en float:
    public static void g(){
        float a[]=new float[10];
        llenaFloat(a);
        for(float i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    public static void imprimeArraysLetras(String a[]){
        for (String i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    //funcion que rellena arrays con aleatorios entre [1,20] y lo imprime 
    public static void llenaPrintArrays(int a[]){
        int n=0;
        for (int i = 0; i < a.length; i++) {
            n=(int)(Math.random()*20)+1;
            a[i]=n;
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+" ");
        }
        System.out.println();
    }
    public static void llenaDouble(double a[]){
        double n;
        double valor_final;
        for (int i = 0; i < a.length; i++) {
            //double valorfinal = Math.round(resulado*100d)/100d;
            n=(Math.random()*20)+1;
            valor_final=(double)(Math.round(n*100d)/100d); //limito a dos decimales
            a[i]=valor_final;
        }
    }   
    public static void llenaFloat(float a[]){
        double n;
        float valor_final;
        for (int i = 0; i < a.length; i++) {
            //double valorfinal = Math.round(resultado*100d)/100d; ---> la cantidad de 0's son la cantidad de decimales
            n=(Math.random()*20)+1;
            valor_final=(float)(Math.round(n*100d)/100d); //limito a dos decimales con esta formula
            a[i]=valor_final;
        }
    }
    
    public static void llenaInt(int a[]){
        int n;
        for (int i = 0; i < a.length; i++) {
            //double valorfinal = Math.round(resultado*100d)/100d; ---> la cantidad de 0's son la cantidad de decimales
            n=(int)(Math.random()*1000)+1;
            a[i]=n;
        }
    }
    /**IMPRIMIR CON EL SGTE FORMATO UN ARRAY
     * Indice   Valor
            0       0
            1       0
            2       0
            3       0
            4       0
            5       0
     */
    public static void h(){
        int a[]=new int[10];
        llenaInt(a);
        System.out.printf("%s  %s%n","Indice","Valor"); 
        for (int i = 0; i < a.length; i++) {
            //izq: 6 espacios; der: 14
            System.out.printf("%6d  %5d%n",i,a[i]);
        }
        System.out.println();
    }
    
    /**
     *Crear programa en base a un arreglo con la cantidad de calificaciones por rango de nota
     * int a[]={0,0,1,2,4,2,1};
     * debe mostrar estadisticas con asteriscos que reflejen la cantidad de notas en el rango
    Distribucion de calificaciones:
    1-1.9:
    2-2.9:
    3-3.9: *
    4-4.9: **
    5-5.9: ****
    6-6.9: **
        7: *    
     */
    public static void i(){
        int a[]={0,0,1,2,4,2,1};
        String ast="";
        System.out.println("Distribucion de notas: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i]; j++) {
                ast+="*";
            }
            if(i!=a.length-1){
                System.out.printf("%d - %.1f: %s%n",i+1,i+1.9,ast);
            }else{
                System.out.printf("%7d: %s%n",i+1,ast);
            }
            ast="";
        }   
    }
    /*
    Distribucion de notas: 
    1 - 1,9: 
    2 - 2,9: 
    3 - 3,9: *
    4 - 4,9: **
    5 - 5,9: ****
    6 - 6,9: **
          7: *
    */
    
    
    /**
     * 
    En ocasiones, los programas utilizan variables tipo contador para sintetizar datos, como los resultados de
    una encuesta. Se debe usar contadores independientes en nuestro programa para tirar dados,
    para rastrear el número de veces que aparecía cada una de las caras de un dado con seis lados, al tiempo que
    la aplicación tira el dado 6,000,000 de veces.
    * Usar secureRandom
     */
    
    public static void j(){
        SecureRandom sr=new SecureRandom();
        int frecuencias[]=new int[7];
    }
        
    //############# MAIN ################
    public static void main(String[] args) {
        i();
    }
}
