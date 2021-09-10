import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWriting {
    public static void main(String[] args) {
        String readenFile = "C:\\Users\\Alperen\\desktop\\cities.txt";
        String willBeWritten = "C:\\Users\\Alperen\\desktop\\cities.txt";
        //System.out.println(reading(readenFile));
        String test = reading(readenFile);
        writing(willBeWritten, test, test);
    }

    public static String reading(String pFile){
        StringBuilder content = new StringBuilder();
        File file = new File(pFile);
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                content.append(reader.nextLine()).append("\n");
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found. Please try again!");
        }
        return content.toString();
    }

    public static void writing(String targetPath, String content, String addition) {
        try {
            FileWriter writer = new FileWriter(targetPath);
            writer.write(content);
            writer.write(addition);
            writer.close();
        } catch(IOException e){
            System.out.println("Please check targetPath, then try again!");
        }
        System.out.println("Process completed!");
    }
}
