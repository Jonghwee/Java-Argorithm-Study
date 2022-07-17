package jonghwee.test_0706;

import java.util.Scanner;

public class Boj5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[31]; //출석번호는 1번부터 시작. 편의를 위해서 리스트의 사이즈를 31로 두고 0번지는 값을 비워놓는다.
        for(int i=1;i<=28;i++){
            int applied = sc.nextInt();
            list[applied] = 1;
        }
        for(int i=1;i<list.length;i++){
            if(list[i] != 1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
