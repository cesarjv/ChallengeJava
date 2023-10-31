package org.example;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * /*
 *  *   Crea un pequeño juego que consista en adivinar palabras en un número máximo de intentos:
 *  *   El juego comienza proponiendo una palabra aleatoria incompleta
 *  * - Por ejemplo "m_ur_d_v", y el número de intentos que le quedan
 *  * - El usuario puede introducir únicamente una letra o una palabra (de la misma longitud que
 *  *   la palabra a adivinar)
 *  * - Si escribe una letra y acierta, se muestra esa letra en la palabra. Si falla, se resta
 *  *   uno al número de intentos
 *  * - Si escribe una resolución y acierta, finaliza el juego, en caso contrario, se resta uno
 *  *   al número de intentos
 *  * - Si el contador de intentos llega a 0, el jugador pierde
 *  * - La palabra debe ocultar de forma aleatoria letras, y nunca puede comenzar ocultando más del 60%
 *  * - Puedes utilizar las palabras que quieras y el número de intentos que consideres
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int randomWordPosition = new Random().nextInt(words.size());
        Set<Integer> hs=uniqueValuesToReplace(words.get(randomWordPosition));
        List<Integer> valueUnique=new ArrayList<>(hs);
        int attempts=new Random().nextInt(5)+1;
        String randomWord=words.get(randomWordPosition);
        String wordToAttempt=wordToGuess(randomWord,valueUnique);
        Scanner sc = new Scanner(System.in);
        boolean wordIsComplete = false;
        while (true) {
            if (attempts == 0) break;
            System.out.println("A continuacion se la indicara una palabra que debe adivinar, tiene "+attempts+" intentos posibles para acertar la palabra completa o alguno de sus caracteres: ");
            System.out.println("Palabra a adivinar: "+wordToAttempt);
            System.out.println("Ingrese la palabra o caracter correcto: ");
            String userInput = sc.nextLine();
            if (!userInput.isEmpty()){
                if (userInput.equals(randomWord)){
                    System.out.println("Tu Ganaste!!\nLa palabra es: " + randomWord);
                    wordIsComplete = true;
                    break;
                }
                else if(randomWord.contains(userInput)){
                    wordToAttempt=searchMatches(randomWord,wordToAttempt,userInput);
                    if(wordToAttempt.equals(randomWord)){
                        System.out.println("Tu Ganaste!!\nLa palabra es: " + randomWord);
                        wordIsComplete = true;
                        break;
                    }
                }
            }
            attempts--;
        }
        if (!wordIsComplete) {
            System.out.println("Tu Persiste!!\nLa palabra es: " + randomWord);
        };
    }
    private static final List<String> words= Arrays.asList("mouredev","java","colour","country","developer","devops","docker","javascript","quarkus","spring","hibernate");
    private static Set<Integer> uniqueValuesToReplace(String word){

        int sizeLettersToHide= (int) ((word.length())*0.60);
        int lettersToHide= new Random().nextInt(sizeLettersToHide -1)+1;
        HashSet hs=new HashSet();
        while(hs.size() <=lettersToHide){
            int num= new Random().nextInt((word.length()));
            hs.add(num);
        }
        return hs;
    }
    private static String wordToGuess(String word,List<Integer> valueUniqueToRemplace){
        char[] chars = word.toCharArray();
        valueUniqueToRemplace.forEach(i -> chars[i] = '_');
        return String.valueOf(chars);
    }

    private static String searchMatches(String originalWord, String hideWord, String letter){
        List<String> originalWordToList=new ArrayList<>(Arrays.asList(originalWord.split("")));
        List<String> hideWordtoList=new ArrayList<>(Arrays.asList(hideWord.split("")));
        for(int x=0;x<originalWordToList.size();x++){
            if(hideWordtoList.get(x).equals("_") && originalWordToList.get(x).equals(letter)){
                hideWordtoList.set(x,letter);
                break;
            }
        }
        return String.join("", hideWordtoList);
    }
}
