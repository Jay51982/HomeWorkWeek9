//Write a Java program to retrieve an element (at a specified index) from a given array list

import java.util.ArrayList;
import java.util.Scanner;

public class Program_6_RetrieveElement {

    public static void main(String[] args) {
        ArrayList<String> countryName = new ArrayList<>();
        countryName.add("India");
        countryName.add("U.K.");
        countryName.add("France");
        countryName.add("Italy");
        countryName.add("Spain");
        countryName.add("Belgium");
        countryName.add("U.S.A.");
        countryName.add("Brazil");
        countryName.add("Portugal");
        countryName.add("Denmark");

        for (String name : countryName){
            System.out.println(name);
        }
        System.out.println("*********************");
        System.out.println("Enter your selection from 1 to 10 :");
        Scanner obj = new Scanner(System.in);
        int no =obj.nextInt();
        System.out.println(countryName.get(no-1));
    }
}
