package jonghwee.test_0802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        String result = null;
    
        for(int i=0;i<num.length-1;i++){
            int a = Integer.parseInt(num[i+1])-Integer.parseInt(num[i]);
            if(a==1){
                result="ascending";
            }else if(a==-1){
                result="descending";
            }else{
                result="mixed";
                break;
            }
        }
        System.out.println(result);
    }
}
