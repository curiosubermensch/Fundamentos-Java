
import java.util.Scanner;


public class ClaseMath {
    //ANKIADA EN SU TOTALIDAD :D
    
    //clase Math
    //random(): Retorna un numero entre 0 y 1
    //puede ser 0.008836017566092536
    //---------------------------------------------------------------------------------------------------------------------
//    las formulas para sacar numeros en un rango son como calcular porcentajes de un numero y luego sumarle una base
//    osea por ej si queremos generar nros entre 1 y 10, tenemos que multiplicar por 10 el nro retornado por random
//    que es un 0.xxxxx lo que nos devolvera un porcentaje de 10, si ese porcentaje no alcanzo a pasar de cero
//    con la base que le sumamos logramos que respete el minimo, el max es el porcentaje maximo que podria alcanzar sumado a la base
    //---------------------------------------------------------------------------------------------------------------------    
    //formula generar numeros entre 1 y 10: (Math.random()*10)+1
    //1 y 100: (Math.random()*100)+1
    //Generar aleatorios en rango especifico [min,max[: (Math.random()*(max-min))+min
    //Generar aleatorios en rango especifico [min,max]: (Math.random()*(max-min+1))+min
    public static void a(){
        System.out.println(Math.random());
        //0.3512297022882225
    }
    
    //Ejercicio pendiente: CONTIENE ERRORES!
    //hacer q retorne numeros con cantidad de cifras que el user quiera (entero)
    public static void b(){
        Scanner inp=new Scanner(System.in);
        System.out.println("cuantas cifras desea que tengan los nros: ");
        int e=inp.nextInt();
        int cifras=(int)Math.pow(10,e);
        int n=0;
        for (int i = 0; i < 100; i++) {
            n=(int)(Math.random()*cifras)+1;
            System.out.println(n);
        }
        
        //System.out.println(Math.random()*);
        
    }
    
    //random(): Retorna un numero entre 0 y 1
    //puede ser 0.008836017566092536
    //por tanto si queremos numeros entre 1 y 10 tenemos que multiplicar por 10 pero no es suficiente:
    //0.008836*10 = 0.08
    //por esto si a la formula le agregamos un 1, los casos en que el nro sea 0.00XXX pasaran a ser 1 
    //(0.008836*10)+1 --> 1
    public static void c(){
        ///generar 10 numeros aleatorios entre [0,99]
        String msj="";
        for (int i = 0; i < 10; i++) {
            ///Math.random()*100 genera numeros entre 0 y 99
            int n=(int)(Math.random()*100); ///probado que funciona porque genera 0
            System.out.print(n+" ");
        }
        System.out.println();
        ///12 35 15 13 54 62 90 29 57 89 
        
    }
    
    public static void d(){
        //generar x numeros enteros aleatorios entre [1,10]
        String msj=" ";
        for (int i = 0; i < 10; i++) {
            int n=(int)(Math.random()*10)+1; //genera nro entre [1,10]
            System.out.println(n);
            if(n<1 || n>10){
                System.out.println("------ERROR------");
            }else{
                msj="El programa ha finalizado con exito";
            }
        }
        System.out.println(msj);
        //se hace prueba con 10000 nros aleatorios y el programa finaliza con exito
    }
    
    public static void d2(){
        ///generar 10 numeros enteros aleatorios entre [1,10]
        for (int i = 0; i < 10; i++) {
            int n=(int)(Math.random()*10)+1; 
            System.out.println(n);
        }
        //se hace prueba con 10000 nros aleatorios y el programa finaliza con exito
    }
    
    //crea programa que retorne x aleatorios entre un rango dado
    public static void e(){
        //sabemos que random() retorna valores entre [0,1[ (double)
        //se podria hacer con if-else pero seria muy ineficiente
        //es mas eficiente una formula: (Math.random()*(max-min))+min //probado con 1 millon
        String msj=" ";
        int min=11;
        int max=37;
        int dif=max-min;
        for (int i = 0; i < 1000000; i++) {
            int n=(int)((Math.random()*dif)+min); //los corchetes no sirven para separar operaciones
            System.out.println(n);
            if(n<min || n>max || n==0){
                System.out.println("------ERROR-------");
                msj="el programa contiene errores";
            }else{
                msj="PROGRAMA FINALIZADO CON EXITO";
            }
        }
        System.out.println(msj);
        //programa probado con 1.000.000 numeros, finaliza con exito
    }
    
    public static void e2(){
        ///crea programa que retorne 15 aleatorios entre un rango dado
        ///[min, max]
        int min=7;
        int max=33;
        for (int i = 0; i < 15; i++) {
            int n=(int)((Math.random()*(max-min+1))+min); 
            System.out.print(n+" ");
        }
        ///16 29 32 10 7 33 23 22 18 33 16 31 33 20 14
        //programa probado con 1.000.000 numeros, finaliza con exito
    }
    
    
    //cell(): redondea al mayor, no importan decimales
    //floor(): redondea al menor, no importan decimales
    //round(): redondeo clasico, si la decima es >5 redondea hacia arriba, o hacia abajo si la decima es <5
    public static void f(){
        double n=Math.random()*10;
        System.out.println(n);
        System.out.println(Math.ceil(n));
        System.out.println(Math.floor(n));
        System.out.println(Math.round(n));
        //output 1:
        //5.648873650137598
        //6.0
        //5.0
        //6
        //output 2:
        //5.120312967162982
        //6.0
        //5.0
        //5
    }
    public static void g(){
        ///que imprime?
        double x=1.5;
        System.out.println(Math.ceil(x)); 
        ///output: 2.0
    }
    
    public static void h(){
        ///que imprime?
        double x=1.5;
        System.out.println(Math.floor(x)); 
        ///output: 1.0
    }
    
    public static void i(){
        ///que imprime?
        double x=1.5;
        System.out.println(Math.round(x)); 
        ///output: 2
    }
    
    //abs() -->  //valor absoluto de un numero (acepta int, long, float, double)
    //pow(double b, double e) --> b**e
    public static void j(){
        int x=-1;
        System.out.println(Math.abs(x)); //1
    }
    
    public static void k() {
        int b=2;
        int e=3;
        int res=(int)Math.pow(b,e);
        System.out.println(res); //8
    }
    
    //##############  MAIN ###############
    public static void main(String[] args) {
        e2();
    }
}
