package jonghwee.test_0717;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Section01_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] list = str.split(" ");
        int max = 0;
        String maxString=null;

        for(int i=0;i<list.length;i++){
            int size = list[i].length();
            if(size>max){
                max = size;
                maxString=list[i];
            }

        }
        bw.write(maxString);
        bw.flush();
        bw.close();
    }
}
