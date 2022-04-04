import java.util.ArrayList;
import java.util.List;
/*
Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.
* */
public class Program_4_AddColours {

    public static void main(String[] args) {
        //Arraylist declaration
        ArrayList<String> colourList = new ArrayList<>();

        //Add colours to Arraylist
        colourList.add("Orange");
        colourList.add("Black");
        colourList.add("Blue");
        colourList.add("White");
        colourList.add("Red");
        colourList.add("Pink");
        colourList.add("Green");

        //print arraylist
        for(String Name : colourList ){
            System.out.println(Name);

        }
    }
}
