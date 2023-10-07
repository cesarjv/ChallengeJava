package org.example;
import java.util.*;
/**
 * Máster Completo en Java de cero a experto 2023 (+127 hrs)
 *
 * Obtener el numero mayor en un arreglo con programación funcional lambda y api stream
 *
 */
public class App
{
    public static void main( String[] args )
    {
        List<Integer> list= Arrays.asList(10,15,5,7,2,18,11,42);
        Integer maxValue=list.stream().mapToInt(v->v).max().orElseThrow(NoSuchElementException::new);
        System.out.println(maxValue);
    }
}