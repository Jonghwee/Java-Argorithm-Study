package jonghwee.test_0720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Section01_4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String str = br.readLine();
            StringBuffer sb = new StringBuffer(str);
            /** StringBuffer - 문자열을 추가하거나 변경할 때 사용하는 자료형
             * 
             * 일반적인 String과 다른 점?
             * String 객체와는 다르게 객체가 한번만 생성된다.
             * String 객체는 변화를 줄 때마다 새로운 객체가 생성되어 그 객체에 값이 들어가는 반면
             * StringBuffer는 한번만 생성되어 그 안에서 수정이 이루어진다.
             * 
             * 다만 String에 비해 무겁다. 메모리 사용량도 높고, 속도도 느리다.
             * 따라서 문자열 변경 작업이 많을 경우 StringBuffer를, 별로 없을 경우 String을 사용하는 것이 좋다. 
             */

            bw.write(sb.reverse().toString());
        }

        bw.flush();
        bw.close();
    }
}
