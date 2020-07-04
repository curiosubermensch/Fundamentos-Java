
import java.security.SecureRandom;
import java.util.Scanner;


/**
 *CRAPS:
Un jugador tira dos dados. Cada uno tiene seis caras, las cuales contienen uno, dos, tres cuatro, cinco
y seis puntos negros, respectivamente. Una vez que los dados dejan de moverse, se calcula la suma de
los puntos negros en las dos caras superiores. 
* Si la suma es 7 u 11 en el primer tiro, el jugador gana. 
* Si la suma es 2, 3 o 12 en el primer tiro (llamado “Craps”), el jugador pierde (es decir, la “casa” gana).
Si la suma es 4, 5, 6, 8, 9 o 10 en el primer tiro, esta suma se convierte en el “punto” del jugador.
Para ganar, el jugador debe seguir tirando los dados hasta que salga otra vez “su punto” (es decir, que
tire ese mismo valor de punto). El jugador pierde si tira un 7 antes de llegar a su punto.
 */
public class Craps {
    
    public static int lanzar(){
        SecureRandom sr=new SecureRandom();
        int n,m,suma;
        n=1+sr.nextInt(5);
        m=1+sr.nextInt(5);
        return n+m;  
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);    
        int punto,punto_memoria=0;
        String r = "s";
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.print("CRAPS: \n* Si la suma es 7 u 11 en el primer tiro, el jugador gana. \n" +
                "* Si la suma es 2, 3 o 12 en el primer tiro el jugador pierde\n" +
                "* Si la suma es 4, 5, 6, 8, 9 o 10 en el primer tiro, esta suma se convierte en su “punto”\n" +
                "* Para ganar, debe seguir tirando los dados hasta que se repita \'su punto\'" +
                " pero si le sale un 7 antes pierde\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        do{
            System.out.print("Desea jugar una nueva partida? (s/n): ");
            r=inp.nextLine();
            if(r.equalsIgnoreCase("s")){
                 
                System.out.print("\nLanzar (s/n): ");
                r=inp.nextLine();
                punto=lanzar();
                System.out.println("Resultado: "+punto);
                if(punto==7 || punto==11){
                    System.out.print("GANASTE!");
                    
                }else if(punto==2 || punto==3 || punto==12){
                    System.out.println("CRAPS :(");
                }else{
                    punto_memoria=punto;
                    System.out.println("-----JUGANDO POR PUNTO-----");
                    do{
                        System.out.print("Lanzar? (s/n): ");
                        r=inp.nextLine();
                        punto=lanzar();
                        System.out.println("Resultado: "+punto);
                        System.out.println("Punto en memoria: "+punto_memoria);
                        if(punto==7){
                            System.out.println("P E R D E D O R");
                            break;
                        }else if(punto==punto_memoria){
                            System.out.println("¡YOU ARE THE CHAMPION!");
                        }
                    }while(punto!=punto_memoria);
                }
            }
        }while(r.equals("s"));
    }
}
