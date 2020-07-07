
import java.security.SecureRandom;
import java.util.Scanner;

public class EjVectores {
    
    /**
     *  Ejercicio 6
        Escribe un programa que lea 7 números por teclado y que los almacene en un
        array. Rota los elementos de ese array, es decir, el elemento de la posición 0
        debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
        la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
        del array.
     */
    public static void a(){
        int v[]={1,2,3,4,5,6,7};
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i]+" ");
        }
        System.out.print("\nDesplazado: \n");
        int aux=v[6]; //guardamos en memoria el unico valor que no podemos intercambiar de manera normal como a los otros
        for (int j = 6; j >0; j--) {
            v[j]=v[j-1]; //este hace el sgte intercambio {1,2,3,4,5,6,7} --> {1,1,2,3,4,5,6}
        }
        v[0]=aux; //ahora el primer elemento hay que actualizarlo con el que era el ultimo y q guardamos en memoria
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+" ");
        }
        //1 2 3 4 5 6 7 
        //Desplazado: 
        //7 1 2 3 4 5 6
    }
    
    /**
     * Escribe un programa que genere 30 números aleatorios del 0 al 20 y que los
        muestre por pantalla separados por espacios. El programa pedirá entonces
        por teclado dos valores y a continuación cambiará todas las ocurrencias del
        primer valor por el segundo en la lista generada anteriormente. 
        * ingrese numero que desea cambiar:
        * ingrese numero por el cual sera cambiado el anterior:
        * Los números que se han cambiado deben aparecer entrecomillados.
     */
    public static void b() {
        SecureRandom sr=new SecureRandom();
        Scanner inp=new Scanner(System.in);
        int v[]=new int[50];
        int n,kill,recambio;
        for (int i = 0; i < 50; i++) {
            n=sr.nextInt(21);
            v[i]=n;
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(v[i]+" ");
        }
        System.out.println();
        System.out.print("ingrese el que quiere reemplazar: ");
        kill=inp.nextInt();
        System.out.print("ingrese el remplazo: ");
        recambio=inp.nextInt();
        
        for (int i = 0; i < 50; i++) {
            if(v[i]==kill){
                v[i]=recambio;
                System.out.print("["+v[i]+"] ");
            }else{
                System.out.print(v[i]+" ");
            }
        }
    }
    
    
    /**
     *Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
      y que los almacene en un array. El programa debe ser capaz de pasar todos
      los números pares a las primeras posiciones del array (del 0 en adelante) y
      todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
      es necesario. 
      * ej: [2,4,6,8,10,7,11,15,33,23]
     */
    public static void c(){
        int v[]=new int[20];
        int pares[]=new int[20];
        int impares[]=new int[20];
        int contador_par=0;
        int contador_impar=0;
                
        //llenamos el array principal y los secundarios
        for (int i = 0; i < 20; i++) {
            v[i]=(int)(Math.random()*101);
            if(v[i]%2==0){
                pares[contador_par++]=v[i]; //el incremento ira atrasado en 1, osea que la primera posicion donde se guarde el aleatorio sera la 0
            }else{
                impares[contador_impar++]=v[i];
            }
            System.out.print(v[i]+" ");
        }
        System.out.println("");
        
        //agrego los pares al principio
        for (int i = 0; i < contador_par; i++) {
            v[i]=pares[i];
        }
        //agrego los impares a continuacion:
        for (int i = contador_par; i < 20; i++) {
            v[i]=impares[i-contador_par]; //el vector impar tiene que partir de 0 entonces le descontamos el valor agregado al contador asi queda en cero y luego ira aumentando de a 1 segun avance el for (++)
        }
        //imprimimos el vector con los pares al principio:
        for (int i = 0; i < 20; i++) {
            System.out.print(v[i]+" ");
        }
        System.out.println("");
        System.out.println("primer elemento par: "+pares[0]+"; contador de pares: "+contador_par);
        System.out.println("primer elemento impar: "+impares[0]+"; contador de impares: "+contador_impar);
    }
    
    /**
    Realiza un programa que pida 10 números por teclado y que los almacene en
    un array. A continuación se mostrará el contenido de ese array junto al índice
    (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
    “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
    ambos números están entre 0 y 9. El programa deberá colocar el número de
    la posición inicial en la posición final, rotando el resto de números para que no
    se pierda ninguno. Al final se debe mostrar el array resultante.
    Por ejemplo, para inicial = 3 y final = 7: 
    * [1,2,3,4,5,6,7,8,9,10]
    * [10,1,2,3,5,6,4,7,8,9]
     */
    public static void d(){
        SecureRandom sr=new SecureRandom();
        Scanner inp=new Scanner(System.in);
        int v[]=new int[10];
        int ini,fin,aux,auxIni,auxFin;
        for (int i = 0; i < 10; i++) {
            v[i]=1+sr.nextInt(20); //del 1 al 20
            System.out.printf("%02d ",v[i]);
        }
        System.out.println("");
        System.out.print("posicion del elemento a mover: ");
        ini=inp.nextInt();
        System.out.print("posicion donde quiere insertarlo: ");
        fin=inp.nextInt();
        //cambiazo:
        aux=v[9];   
        for (int i = 9; i >fin ; i--) {
            v[i]=v[i-1];
        }
        v[fin]=v[ini];
        for (int i = ini-1; i > 0; i--) {
            v[i]=v[i-1];
        }
        v[0]=aux;
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i]+" ");
        }
    }
    
    public static void main(String[] args) {
       d();
    }
}
