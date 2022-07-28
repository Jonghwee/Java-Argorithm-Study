package jonghwee.test_0728;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj10818{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        int max = list[0];
        int min = list[0];

        for(int i=0;i<N;i++){
            list[i] = Integer.parseInt(br.readLine());    
        }

        for(int i=0;i<list.length;i++){
            if(max<list[i]){
                max = list[i];
            }
            if(min>list[i]){
                min = list[i];
            }
        }
        
        for(int a : list){
           System.out.println(a);
        }

        System.out.println(min);
        System.out.println(max);
        bw.write(min);
        bw.write(max);
        bw.flush();
        bw.close();
    }
}