
package w3basicjava150;

import java.util.Scanner;

public class _6_ASMDR {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Integer: ");
        int i1=in.nextInt();

        System.out.print("Enter Second Integer: ");
        int i2=in.nextInt();

        int sum=i1+i2;
        System.out.println("The Sum is: "+sum);

        int sub=i1-i2;
        System.out.println("The Subtractions is: "+sub);

        int m=i1*i2;
        System.out.println("The Multiplication is: "+m);

        int d=i1/i2;
        System.out.println("The Division is: "+d);

        int r=i1%i2;
        System.out.println("The Remainder is: "+r);
    }

    
}
