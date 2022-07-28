package jonghwee.test_0728;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj10818{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        for(int i=0;i<N;i++){
            list[i] = Integer.parseInt(br.readLine());    
        }

        int max = list[0];
        int min = list[0];

        for(int i=0;i<list.length;i++){
            if(max<list[i]){
                max = list[i];
            }
            if(min>list[i]){
                min = list[i];
            }
        }

        // System.out.println(min);
        // System.out.println(max);

        bw.write(String.valueOf(min)+"\n"); //Integer.toString() 도 가능
        bw.write(Integer.toString(max));
        //bw.write는 int만 출력하는 것이 불가능.
        bw.flush();
        bw.close();
    }
}