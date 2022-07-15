package jonghwee.test_0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11718 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// import java.util.Scanner;
 
// public class Boj11718 {
 
//    public static void main(String[] args) {
 
//       Scanner sc = new Scanner(System.in);
      
//       while(sc.hasNext()){
//             String a = sc.nextLine();
//             System.out.println(a);
//         }
//     }
// }