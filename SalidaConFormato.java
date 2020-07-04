
public class SalidaConFormato {
    //imprimir con formato, printf():
    //%s --> string
    //%n --> salto de linea
    //%d,%i --> decimal con signo, para int
    //%f --> float
    //%% --> %
    //%c --> caracter
    
    public static void b(){
        byte b=7;
        System.out.printf("%d%n",b);
        //7
    }
    
    
    public static void c(){
        ///completar:
        System.out.printf("%s%n%s%n","hi","bro");
        ///hi
        ///bro
    } 
    public static void d(){ 
        System.out.printf("%s%n%s%n","hola","mundo"); //al primer parametro se le puede agregar strings sin problemas
        //hola
        //mundo
    }
    
   
    public static void e(){
        float f=4.002f;
        System.out.printf("numero: %f%n",f);
        //numero: 4,002000
    }
    
    public static void f(){
        float f=4.123456f;
        System.out.printf("numero: %.3f%n",f);
        //numero: 4,123
    }
    
    public static void g(){
        System.out.printf("%%%n");
        //%
    }
    
    public static void h() {
        ///imprimir caracter        
        System.out.printf("char: %c%n",'#');
        ///char: #
    }
    
    public static void i() {
        ///imprimir segun tabla asci la arroba (64)
        System.out.printf("char: %c%n",64);
        ///char: @
    }
    
    public static void j(){
        double n = 1.25036;
        int x = 10;
        System.out.printf("n = %.2f x = %d %n", n, x);
        //n = 1,25 x = 10
    }
    
    
    public static void k(){
        ///Mostrar el número 1.22 en un ancho de campo de 10 caracteres y con dos decimales.
        double precio = 1.2345;
        System.out.printf("[%10.2f]%n", precio);
        ///[      1,23]
    }
    
    //#########################################ANKIE HASTA AKI#####################################################
    
//      Especificadores de formato:
//
//      La sintaxis para los especificadores de formato de printf es:
//      %[posición_dato$][indicador_de_formato][ancho][.precision]carácter_de_conversión
      //%[posicion$][simbolo][ancho][.precision]tipo_formato
//
//
//      [Posición_dato$]: indica la posición del dato sobre el que se va aplicar el formato. 
    //  El primero por la izquierda ocupa la posición 1.
    public static void l(){
        double n = 1.25036;
        int x = 10;
        String s="hi";
        //le indicamos la posicion del elemento a formatear la cual no es n,s,x sino q la salida es s,n,x 
        System.out.printf("s=%2$s n=%1$.2f x=%3$d %n", n,s,x);
        //s=hi n=1,25 x=10
    }
    //  [Indicador_de_formato]: es el conjunto de caracteres que determina el formato de salida. 
    //  -; +; 0; (; , [el valor puede aparecer con signo, rellenado con ceros, parentesis, etc]
    //https://2.bp.blogspot.com/-I4JMiR5sMkk/UBkkvIo3ChI/AAAAAAAAADs/d5Sea-DT0JQ/s640/java-printf-formato-indicadores.jpg
    public static void m(){
        float x=2.001f;
        System.out.printf("%+.1f%n",x);
        //+2,0
        System.out.printf("%07.1f%n",x); //rellenar con 0's 7 espacios, 1 decimal de presicion, float
        //00002,0
    }
    
    public static void n(){
        float x=-1.00123f;
        float y=3.1234f;
        System.out.printf("%(1.2f%n",x);  //al indicar el formato ( cuando haya q imprimir un negativo estara entre parentesis en vez de tener el signo - antes
        //(1,00)
        System.out.printf("%(1.1f%n",y);
        //3,1
    }
    
//############## MAIN ##################
    public static void main(String[] args) {
        k();
    }
}
