package jonghwee;

import java.util.Scanner;

public class Boj9498_0701 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        if(score<=100 && score>89){
            System.out.println("A");
        }else if(score>79){
            System.out.println("B");
        }else if(score>69){
            System.out.println("C");
        }else if(score>59){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
