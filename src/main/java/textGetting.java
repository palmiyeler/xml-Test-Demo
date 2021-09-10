import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class textGetting {

    public static ArrayList<String> getText(String pFilename){
        ArrayList<String> myCities = new ArrayList<>();
        String temp = "";
 //       Scanner scan = new Scanner(System.in);
 //       String input = scan.nextLine();
 //       scan.close();
        File file = new File(pFilename);
        Scanner reader = null;
        try {
            reader = new Scanner(file);
            while(reader.hasNextLine()){
                temp= reader.nextLine();
                String[] strList = temp.split(" ");
                myCities.addAll(Arrays.asList(strList));
            }
        }catch (FileNotFoundException e){
            System.out.println("File was not found. Please try again!");
        }

        return myCities;
    }



    public static void main(String[] args) {
        System.out.println(getText("C:\\...."));

        //-- scanner
        System.out.println(getText("C:\\...."));

        //-- else
        System.out.println(getText("C:\\...."));
    }

}
