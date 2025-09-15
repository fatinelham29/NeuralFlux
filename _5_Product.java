
package w3basicjava150;

import java.util.Scanner;

public class _5_Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Integer: ");
        int i1=in.nextInt();
        System.out.print("Enter Second Integer: ");
        int i2=in.nextInt();
        int p=i1*i2;
        System.out.println("The Product is: "+p);
    }

    
}
