package jonghwee.test_0725;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Section01_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String answer = "";

        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                answer += str.charAt(i);  
            }
        }
        System.out.println(Integer.parseInt(answer));
        bw.write(Integer.parseInt(answer));
        bw.flush();
        bw.close();
    }
}
