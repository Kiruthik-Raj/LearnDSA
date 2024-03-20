package learnjava;

import java.util.Scanner;


public class tvswap {
    public static void main(String args[]){

        int temp = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();


    temp = a;
    a = b;
    b = temp;
    System.out.println("Variables after swapping: ");

    System.out.println("A = "+a);
    System.out.println("B = "+ b );

    sc.close();
    }
}
