package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Crea un programa que analice texto y obtenga:
 * - Número total de palabras.
 * - Longitud media de las palabras.
 * - Número de oraciones del texto (cada vez que aparecen un punto).
 * - Encuentre la palabra más larga.
 * - Todo esto utilizando un único bucle.
 */
public class App 
{
    public static void main( String[] args )
    {

        String text="El hotel del centro es el más antiguo del pueblo y también es aquel que tiene más comodidades. Este hotel fue construido en 1911?, pero primero se utilizó como casa de familia. En 1975 un inversionista compró esta propiedad y la reformó para transformarla en el hotel que hoy conocemos. Es un hotel pequeño, pero cuenta con servicio a la habitación, con pileta climatizada, con un restaurante de categoría, entre otras cosas.";
        int totalWords=0; int totalSentences=0; double media=0; String longestWord="";
        for (String x: listoWord(text)){
            totalWords++;
            media +=x.length();
            if(x.contains(".")) totalSentences++;
            if(longestWord.length() < x.length()) longestWord=x;
        }
        System.out.println( "Número total de palabras: "+totalWords );
        System.out.println( "Longitud media de las palabras: "+media/totalWords );
        System.out.println( "Número de oraciones del texto: "+totalSentences );
        System.out.println( "Encuentre la palabra más larga: "+longestWord);
    }

    private static List<String> listoWord(String value){
        String modifiedText=value.replaceAll("[,?]","");
        return List.of(modifiedText.split(" "));
    }
}
