package org.example;

import java.util.*;

/**
 /*
 *   Escribe un programa que reciba un texto y transforme lenguaje natural a
 *   "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *   se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("Introduzca una palabra por teclado: ");
        Scanner teclado=new Scanner(System.in);
        String[] text=teclado.nextLine().toUpperCase().split("");
        List<String> textToList= new ArrayList<>(Arrays.asList(text));
        textToList.stream().map(x -> getLeetTable().get(x)).forEach(System.out::println);
    }
    public static Map getLeetTable() {
        Map<String,String> map=new HashMap<>();
        map.put( "A", "4" );
        map.put( "B", "I3" );
        map.put( "C", "[" );
        map.put( "D", ")" );
        map.put( "E", "3" );
        map.put( "F", "|=" );
        map.put( "G", "&" );
        map.put( "H", "#" );
        map.put( "I", "1" );
        map.put( "J", ",_|" );
        map.put( "K", ">|" );
        map.put( "L", "1" );
        map.put( "M", "/\\/\\" );
        map.put( "N", "^/" );
        map.put( "O", "0" );
        map.put( "P", "|*" );
        map.put( "Q", "(_,)" );
        map.put( "R", "I2" );
        map.put( "S", "5" );
        map.put( "T", "7" );
        map.put( "U", "(_)" );
        map.put( "V", "\\/" );
        map.put( "W", "\\/\\/" );
        map.put( "X", "><" );
        map.put( "Y", "j" );
        map.put( "Z", "2" );
        map.put( "1", "L" );
        map.put( "2", "R" );
        map.put( "3", "E" );
        map.put( "4", "A" );
        map.put( "5", "S" );
        map.put( "6", "b" );
        map.put( "7", "T" );
        map.put( "8", "B" );
        map.put( "9", "g" );
        map.put( "0", "o" );
        return map;
    }

}
