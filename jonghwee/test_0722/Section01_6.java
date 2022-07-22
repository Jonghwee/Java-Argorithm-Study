package jonghwee.test_0722;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Section01_6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String answer = "";

        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i))==i){
                answer += str.charAt(i);
            }
        }
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
