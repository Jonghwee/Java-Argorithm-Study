package jonghwee.test_0706;

import java.util.Scanner;

public class Boj5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[31];

        for(int i=1;i<=28;i++){
            int applied = sc.nextInt();
            list[applied] = 1;
        }
        for(int i =1;i<list.length;i++){
            if(list[i] != 1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
