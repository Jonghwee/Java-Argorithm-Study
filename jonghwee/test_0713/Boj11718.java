package jonghwee.test_0713;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Boj11718 {
//     public static void main(String[] args) throws IOException {
        
//             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//             String str;
            
//             while((str = br.readLine()) != null){
//                 System.out.println(str);
//             }
        
//     }
// }

import java.util.Scanner;
 
public class Boj11718 {
 
   public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    
    //hasNext()
    /**
     * hasNext() 안에 문자열 즉 토큰이 있으면 true를 반환하여 while문이 실행되도록 한다. 토큰이 없으면 false를 반환.
     * hasNext() 안에는 readinput()이 있어서 입력을 받을 수 있다. 입력을 받으면 Scanner 안의 Buffer에 그 값을 저장한다.
     * 보통 nextLine()을 통해 입력값을 받는데 만약 Scanner의 Buffer에 입력값이 존재하면 값을 입력받지 않는다.(nexLine() 함수에서 Buffer에 값이 있는지 없는지를 확인하는 작업이 있음)
     */
    while(sc.hasNext()){ 
            String a = sc.nextLine();
            System.out.println(a);
    }
    sc.close();
    }
}
