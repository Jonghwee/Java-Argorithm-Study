package jonghwee.test_0705;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = sc.nextInt();

        for(int i=1;i<=N;i++){
            int a = sc.nextInt();
            list.add(a);
        }
        int v = sc.nextInt();
        
        int count = 0;
        for(int i : list){
            if(i==v){
                count++;
            }
        }
        System.out.println(count);
    }
}
