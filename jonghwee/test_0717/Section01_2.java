package jonghwee.test_0717;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Section01_2 {
    // public static void main(String[] args) throws IOException {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    //     String str = br.readLine();
    //     char[] list = str.toCharArray();

    //     for(char c : list){
    //         if(Character.isUpperCase(c)){
    //             c=Character.toLowerCase(c);
    //         }else if(Character.isLowerCase(c)){
    //             c=Character.toUpperCase(c);
    //         }
    //         bw.write(c);
    //     }
    //     bw.flush();
    //     bw.close();
    // }

    //풀이 2 - StringBuilder 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str.length());

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                char c2 = Character.toLowerCase(c);
                sb.append(c2);
            }else{
                char c2 = Character.toUpperCase(c);
                sb.append(c2);
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
