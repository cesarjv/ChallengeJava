package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        int total1 = 0;
        for (Integer x : numbers) {
            if (x % 2 == 0) {
                total1 += x * x;
            }
        }
        System.out.println("Salida mediante programacion imperativa: " + total1);
        IntStream numberStream = numbers.stream().filter((x) -> x % 2 == 0).mapToInt((x) -> x * x);
        int total2 = numberStream.reduce(0, Integer::sum);
        System.out.println("Salida mediante programacion declarativa: " + total2);
    }
}
