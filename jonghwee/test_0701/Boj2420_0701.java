package jonghwee.test_0701;

import java.util.Scanner;

public class Boj2420_0701 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Long N, M;
        N = sc.nextLong();
        M = sc.nextLong();

        System.out.print(Math.abs(N-M));
    }
}
