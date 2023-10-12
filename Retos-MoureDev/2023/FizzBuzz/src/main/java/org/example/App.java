package org.example;

import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
public class App 
{
    public static void main( String[] args )
    {
        /*for(int i=0;i<101;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            } else if (i%5==0) {
                System.out.println("fizz");
            } else if (i%3==0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        } */

        Stream<Integer> listNum= IntStream.rangeClosed(0, 100).boxed();
        listNum.forEach(x -> {
            String out= "";
            out=(x%3 ==0 ? "fizz":"")+(x%5 ==0 ? "buzz":"");
            System.out.println(out.isEmpty()?x:out);
        });
    }
}
