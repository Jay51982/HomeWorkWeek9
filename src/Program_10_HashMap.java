//Create a HashMap object called people that will store String keys and Integer values: And use for each loop to iterate the value from Map.

import java.util.HashMap;
import java.util.Map;

public class Program_10_HashMap{

    public static void main(String[] args) {
        HashMap<Integer,String> people=new HashMap<>();
        people.put(1,"Jay");
        people.put(2,"Daniel");
        people.put(3,"Mark");
        people.put(4,"Sharon");
        people.put(5,"Sandy");
        for(Map.Entry <Integer,String> display :people.entrySet()){

            System.out.println(display);
        }

    }

}
