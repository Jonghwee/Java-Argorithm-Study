package jonghwee.test_0707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj2738 {
    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int M = sc.nextInt();

        // int[][] A = new int[N][M];
        // int[][] B = new int[N][M];
        // int[][] result = new int[N][M];
        
        // for(int i=0;i<N;i++){
        //     for(int j=0;j<M;j++){
        //         A[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<N;i++){
        //     for(int j=0;j<M;j++){
        //         B[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<N;i++){
        //     for(int j=0;j<M;j++){
        //         result[i][j]=A[i][j]+B[i][j];
        //         System.out.println(result[i][j]);
        //     }
        // }
        // sc.close();
    // }
    
    //풀이 2 - BufferedReader, StringTokenizer 활용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
    }
}
