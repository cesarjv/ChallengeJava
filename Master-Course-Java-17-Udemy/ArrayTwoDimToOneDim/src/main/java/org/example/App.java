package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Máster Completo en Java de cero a experto 2023 (+127 hrs)
 * Aplanar un arreglo bidimensional en un nivel y eliminar repetidos
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[][] lenguajes = new String[][]{{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, new String[0]};
        List<String> list =Arrays.stream(lenguajes).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}
