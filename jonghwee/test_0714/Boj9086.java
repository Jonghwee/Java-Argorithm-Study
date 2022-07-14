package jonghwee.test_0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj9086 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            for(int i=0;i<T;i++){
                String str = br.readLine();
                
                char a = str.charAt(0);
                char b = str.charAt(str.length()-1);
               
                System.out.print(a);
                System.out.println(b);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
