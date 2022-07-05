package jonghwee.test_0705;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj10871{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=N;i++){
            int a = sc.nextInt();
            list.add(a);
        }
        sc.close();
        
        for(int i : list){
            if(i<X){
                System.out.println(i);
            }
        }
    }
}