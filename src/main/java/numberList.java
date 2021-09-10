import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class numberList {
    public static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> myList = new ArrayList<>();
        String temp = "";
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        reader.close();
        try {
            File file = new File(input);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                temp = scan.nextLine();
                String[] strList = temp.split(" ");
                for (String myInts : strList) {
                    myList.add(Integer.valueOf(myInts));
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return myList;
    }


    public static void main(String[] args) {
        ArrayList<Integer> myList = getNumbers();
        // System.out.println(myList);

        /*
        Object[] intArray = myList.toArray();
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        C:\Users\Alperen\Desktop\test.txt
        */

        System.out.println("copy started");
        int[] myInts = new int[myList.size()];
        for (int i = 0; i < myList.size(); i++) {
            myInts[i] = myList.get(i);
        }
        System.out.println("copy finished");

        quickSortTest sorter = new quickSortTest();
        sorter.quickSort(myInts);
        for(Integer i : myInts){
            System.out.println(i);
        }


        /*
        Arrays.sort(myInts);
        System.out.println(Arrays.toString(myInts));
        */


        /*
        for (int i = 0; i < myInts.length; i++) {
            System.out.println("sort sort ...");
            for (int j = i + 1; j < myInts.length; j++) {
                if (myInts[i] > myInts[j]) {
                    int a = myInts[i];
                    myInts[i] = myInts[j];
                    myInts[j] = a;
                }
            }
        }
        for (int a : myInts) {
            System.out.print(a + "  ");
        }
        */

    }

}

