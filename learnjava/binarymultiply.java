package learnjava;
import java.util.Scanner;

public class binarymultiply {
    public static void main(String args[])
    {
        int a, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: \n");
        a = sc.nextInt();
        System.out.println("Enter the second number: \n");
        b = sc.nextInt();
        String conva = Integer.toBinaryString(a);
        String convb = Integer.toBinaryString(b);

        System.out.println("Converted binary numbers: \n");
        System.out.println(conva);
        System.out.println(convb);
        int product = a * b;
        String productconv = Integer.toBinaryString(product);

        System.out.println("Product is: \n" + productconv);

        sc.close();

    }
}
