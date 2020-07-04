
import java.util.Scanner;
import javax.swing.JOptionPane;


public class EntradaSalida {
    /*
    ----Entrada de texto con Scanner()----
    nextLine(): texto, frases
    nextInt(): enteros
    nextDouble(): decimales
    
    -----Parseos----
    Integer.parseInt()
    Integer.parseDouble()
    */
    
    public static void a(){
        ///completar
        Scanner inp=new Scanner(System.in);
        System.out.print("ingresa tu edad: ");
        int e=inp.nextInt();
        System.out.println("tienes "+e+" años");
        ///ingresa tu edad: 28
        ///tienes 28 años
    }
    
    public static void b(){
        Scanner inp=new Scanner(System.in);
        System.out.print("ingresa tu peso: "); //con coma si tiene decimales
        double p=inp.nextDouble();
        System.out.println("pesas "+p+" kg");
        //ingresa tu peso: 59,123
        //pesas 59.123 kg
    }
    
    public static void c(){
        ///completar:
        Scanner inp=new Scanner(System.in);
        System.out.print("2. ingresa tu peso: "); //con coma si tiene decimales
        float p=inp.nextFloat();
        System.out.println("pesas "+p+" kg");
        //2. ingresa tu peso: 59,1234567
        //pesas 59.123455 kg
    }
    
    //TOO ANKIADO HACIA ARRIBA----------------------------------------------------------------
    
    
    //JOptionPane: Interfaz grafica simple para entrada de datos, clase antigua, 
    //estatica (debe llevar nombre de la clase que contiene)
    //devuelve un  STRING por lo que siempre hay que parsearla cuando se trabaja con operaciones numericas 
    
     // _____________________
    //|       ing #         |
    //|     [_________]     |
    //| [Aceptar][Cancelar] |
    //|_____________________|
    
    public static void d(){
        String n=JOptionPane.showInputDialog("ing #");
        int x=Integer.parseInt(n);
        JOptionPane.showMessageDialog(null,"tu numero+1: "+(x+1)); //OJO: la operacion debe ir en ( ) sino java concatena!
    }
    
    
    public static void e(){
        //para ingresar decimales a un JOptionPane se debe hacer con . a diferencia de consola que es con ,
        float x=Float.parseFloat(JOptionPane.showInputDialog("ing # decimal: "));
        JOptionPane.showMessageDialog(null,"tu numero+1.5: "+(x+1.5)); 
    }
    
    public static void f(){
        float n=1.234f;
        int result=Math.round(n);
        System.out.println(result);
        //output: 1
    }
    
    public static void g(){
        //en java no funciona el operador potencia **
        //se usa Math.pow() para elevar un numero a otro
        System.out.println(Math.pow(2,3));
        //output: 8.0
    }
    
    //############# MAIN ##################
    public static void main(String[] args) {
        g();
    }
}
