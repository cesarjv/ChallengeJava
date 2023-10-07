package org.example;
import java.util.stream.IntStream;

/**
 *
 * Máster Completo en Java de cero a experto 2023 (+127 hrs) - Udemy
 *
 Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int,
 utilizando el api stream se pide eliminar los divisibles en 10,
 luego convertir los elementos restante del flujo en tipo double y
 dividirlos en 2,
 para finalmente devolver la suma total de todos ellos usando el operador terminal reduce.
 El resultado debería ser 2250.0
 */
public class App
{
    public static void main( String[] args )
    {
        IntStream intStream = IntStream.range(1, 101);
        double sum=intStream.filter(x -> x%10 !=0).mapToObj(value -> new Double(value)).map(x->x/2).reduce(Double.valueOf(0),(y, x) -> x+y);
        System.out.println(sum);
    }
}