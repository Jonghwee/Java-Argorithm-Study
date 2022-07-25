package jonghwee.test_0724;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Section01_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str.length());
        StringBuilder sb2 = new StringBuilder(str.length());

        for(int i=0;i<str.length();i++){
            char c = Character.toUpperCase(str.charAt(i));
            sb2.append(c); 
        }

        for(int i=0;i<str.length();i++){
            char c = Character.toUpperCase(str.charAt(i));
            sb.append(c); 
        }
        sb.reverse();

        //sb.reverse()는 StringBuilder 객체를 리턴하기 때문에 toString을 통해 String으로 바꿔줄 수 있다. (출력값은 같음)
        System.out.println(sb2);
        System.out.println(sb);
        
        if(sb==sb2){
            bw.write("YES");
        }else{
            bw.write("NO");
        }
        bw.flush();
        bw.close();
    }
}
