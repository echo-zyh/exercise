package practice10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 9:44 2020/11/11 0011
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0 ; i < n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int cnt = 0;
        for (int i = 0 ; i < n;i++){
            if (cnt == arr[i]){
                continue;
            }
            System.out.print(arr[i]+" ");
            cnt = arr[i];
        }
    }
}
