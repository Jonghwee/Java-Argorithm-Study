package jonghwee.test_0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Section01_1 {
    //풀이 1 - list 사용 X
    // public static void main(String[] args) throws IOException {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     String str = br.readLine();
    //     char c = br.readLine().charAt(0);
    //     int count = 0;

    //     for(int i=0;i<str.length();i++){
    //         if(c == str.charAt(i)){
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    // }

    //풀이 2 - toCharArray() 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();
        String s = br.readLine().toUpperCase();

        int count=0;
        char[] list = str.toCharArray();

        for(char c : list){
            if(s.charAt(0)==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
