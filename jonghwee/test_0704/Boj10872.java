package jonghwee.test_0704;

import java.util.Scanner;

public class Boj10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 1;

        for(int i=1;i<=N;i++){
            result *= i;
        }
        System.out.println(result);
    }
}
