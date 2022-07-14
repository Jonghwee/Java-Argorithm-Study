package jonghwee.test_0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj23037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] list = new int[n.length()];
        int sum=0;

        for(int i=0;i<n.length();i++){
            list[i]=n.charAt(i)-'0'; //char '0'은 아스키코드 48이다. n.charAt(i)를 정수형으로 바꾸면 아스키코드값이 나오는데 여기서 '0', 즉 아스키코드 48을 빼주면 원하는 정수값으로 변하게 된다.
            /*
             - 풀이 2 - Character.getNumericValue(char) 사용
             int a = Character.getNumericValue(n.charAt(i))
             list[i]=a;
             */

        }
        for(int i=0;i<n.length();i++){
            sum += Math.pow(list[i], 5);
        }

        System.out.println(sum);

    }
}
