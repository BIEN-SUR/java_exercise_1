import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Frequence
{
    public static void Freq(String path) throws IOException
    {
        //System.out.println("Renseignez un chemin vers votre fichier: ");
        Path File = Paths.get(path);
        String text = Files.readString(File);
        text = text.toLowerCase();
        text = text.replaceAll("\\s+", " ").replaceAll("[^a-z0-9 ]", "");
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            System.out.println(words[i]);
        }

    }

    public static void main(String[] args) throws IOException 
    {
        Freq("/home/bien_sur/Documents/Epita/Programmes/Java/java_exercise_1/text.txt");
    }
}
