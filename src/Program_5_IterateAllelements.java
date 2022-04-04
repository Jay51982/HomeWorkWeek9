import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program_5_IterateAllelements {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Bhagwan Swaminarayan");
        set.add("Gunantitanand Swami");
        set.add("Bhagatji Maharaj");
        set.add("Shastriji Maharaj");
        set.add("Yogiji Maharaj");
        set.add("Pramukh Swami Maharaj");
        set.add("Mahant Swami Maharaj");

        //Iterate set using Iterator interface

        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
