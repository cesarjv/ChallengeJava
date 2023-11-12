import java.time.Duration;
import java.util.Scanner;

/*
 * Crea una función que reciba dos parámetros para crear una cuenta atrás.
 * - El primero, representa el número en el que comienza la cuenta.
 * - El segundo, los segundos que tienen que transcurrir entre cada cuenta.
 * - Sólo se aceptan números enteros positivos.
 * - El programa finaliza al llegar a cero.
 * - Debes imprimir cada número de la cuenta atrás.
 */
public class cesarjv {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        int num = 0;
        long time=0;
        do{
            System.out.println("Introduzca un numero positivo a partir del cual empience la cuenta atras: ");
            num=sc.nextInt();
            System.out.println("Introduza la cantidad de espera entre cada numero para el conteo regresivo en segundos positivos: ");
            time=sc.nextLong();
        }while(num<0 || time <0);
        while(0 <= num){
            System.out.println(num);
            Thread.sleep(Duration.ofSeconds(time).toMillis());
            num--;
        }
    }
}
