package jonghwee.test_0708;

import java.util.Scanner;

public class Boj2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder newStr = new StringBuilder(str);
        
        for(int i=0;i<str.length();i++){
            char c1 = str.charAt(i);
            if(Character.isUpperCase(c1)){
                char c2 = Character.toLowerCase(c1);
                newStr.setCharAt(i, c2);
            }else if(Character.isLowerCase(c1)){
                char c2 = Character.toUpperCase(c1);
                newStr.setCharAt(i, c2);
            }
        }
        System.out.println(newStr);
        sc.close();
    }
}
