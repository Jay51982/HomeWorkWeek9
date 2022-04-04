package calculate;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter First number :");
            Scanner obj = new Scanner(System.in);
            int a = obj.nextInt();
            System.out.println("Enter Second number :");
            int b = obj.nextInt();

            System.out.println("Please select the calculation symbol +, -, *, / : ");
            char symbol = obj.next().charAt(0);
            Main obj2 = new Main();
            obj2.calculateResult(a, b, symbol);

            System.out.println("Would you like to do more calculation, Please enter 'Y' or 'N': ");
            Scanner obj1 = new Scanner(System.in);
            char ch = obj1.next().charAt(0);

            if (ch == 'N' || ch == 'n') {
                break;
            }
        }
    }
}
