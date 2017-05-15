```java
import java.util.Scanner;
import java.util.Random;

public class GuessMe {

    public static void main(String[] args) {

        Random ale = new Random();
        Scanner input = new Scanner(System.in);
        int random = ale.nextInt(10);
       
        String sino;

        do {

            System.out.print("Adivina el numero perro :v\n");
            int numero1 = input.nextInt();

            if (numero1 > random) {

                System.out.println("Te pasate de numero, atinale un poco mas abajo we :V\n");
                    
            } else if (random > numero1) {

                System.out.println("La cantidad debe de ser menor perro\n");
                            
            }
            if (numero1 == random) {

                System.out.println("lo lograste!!!!!\n");
                    break;
                
            }
            
            
         
            System.out.println("¿Quieres volver a intentarlo?");
            sino = input.next();

        } while (sino.equals("si"));
        {

        }

    }

}
```
