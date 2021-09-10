import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileHandler {
    public static void main(String[] args) {

        ArrayList<Integer> myList = numberList.getNumbers();


        for (Integer myInt: myList) {
            int a = myInt.intValue();


        }

    }
    /*
    public static StringBuilder fileReading(){
        StringBuilder fileData = new StringBuilder();
        try {
            Scanner scn = new Scanner(System.in);
            String input = scn.next();
            scn.close();
            File file = new File(input);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                fileData.append(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("Please entry correct path.");
        }
        fileData.toString();
        return fileData;
    }
    */

    public static ArrayList<Integer> getNumbers(){
        ArrayList<Integer> myList = new ArrayList<>();
        String strTmp = "";

        try {
            Scanner scn = new Scanner(System.in);
            String input = scn.next();
            scn.close();
            File file = new File(input); //finds the file by path
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                strTmp = reader.nextLine();
                String[] myInts = strTmp.split(" ");
                for (String myInt: myInts) {
                    myList.add(Integer.valueOf(myInt));
                }
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("Please entry correct path.");
        } finally {

        }
        return myList;
    }
}
