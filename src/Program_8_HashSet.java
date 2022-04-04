import java.util.HashSet;
//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets. Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
public class Program_8_HashSet {

    public static void main(String[] args) {

        HashSet<Integer> store = new HashSet<>();
        store.add(4);
        store.add(7);
        store.add(8);

        //show which number between 1 to 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (store.contains(i)) {
                System.out.println(i + " number is in the set.");
            } else {
                System.out.println(i + "number is not in the set.");
            }
        }
    }
}

