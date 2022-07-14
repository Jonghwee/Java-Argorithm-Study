package jonghwee.test_0701;

import java.util.Scanner;

public class Boj10869_0701 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(((int)Math.floor(A/B)));
        System.out.println(A%B);
    }
}
