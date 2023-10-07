package org.example;

import java.util.function.Function;

/**
 * Máster Completo en Java de cero a experto 2023 (+127 hrs)
 * Expresión Lambda que elimine espacios, comas y puntos de una frase y además la devuelva la frase convertida en mayúscula.
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Function<String,String> lambda=a -> a.replaceAll("[ ,.]", "").toUpperCase();
        String pharse= lambda.apply("Hola,esto es una prueba. ");
        System.out.print(pharse);
    }
}