//Write a Java program to test an array list is empty or not. Define array list with underground tube names

import java.util.ArrayList;

public class Program_7_ArrayIsEmpty {
    public static void main(String[] args) {
        ArrayList<String> tubeLines = new ArrayList<>();
        tubeLines.add("Bakerloo Line");
        tubeLines.add("Jublee Line");
        tubeLines.add("Metropolitan Line");
        tubeLines.add("Elizabeth Line");
        tubeLines.add("Central Line");
        tubeLines.add("Northern Line");
        tubeLines.add("Circle Line");

        for(String name : tubeLines){
            System.out.println(name);

        }
        System.out.println("It's empty or not  : "+ tubeLines.isEmpty());
    }


}
