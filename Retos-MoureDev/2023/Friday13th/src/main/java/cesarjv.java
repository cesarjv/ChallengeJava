import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
 * Crea una función que sea capaz de detectar si existe un viernes 13 en el mes y el año indicados.
 * - La función recibirá el mes y el año y retornará verdadero o falso.
 */
public class cesarjv {

    public static void main(String[] args) throws ParseException {

        int month = 0;
        int year = 0;
        System.out.println("El siguiente programa permite validar si una fecha indicada cae en viernes 13. Por favor mes y ano: ");
        Scanner sc=new Scanner(System.in);
        while(year < 1000 || 12 < month || 0 > month) {
            System.out.println("Introduzca el mes: ");
            month = sc.nextInt();
            System.out.println("Introduza el ano: ");
            year = sc.nextInt();
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Date date = formatter.parse("13"+"-"+ month+"-"+year);
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)== Calendar.FRIDAY ?"El mes "+ month+" y año "+year+" tienen un viernes 13":"El mes "+ month+" y año "+year+" indicado NO tienen un viernes 13");
    }
}
