package practice9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 18:14 2020/11/10 0010
 * @Modified By:
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int [35];
        Arrays.fill(a,0);
         a[0] = 0;
         a[1] = 1;
         a[2] = 2;
         for (int i = 3; i <= n;i++){
             a[i] = a[i-1] + a[i-2];
         }

        System.out.println(a[n]);
    }


/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);
        long m = a>b? a:b; //较大值
        long n = a+b-m;//较小值
        long temp;
        while(m%n!=0){   //辗转相除法
            temp = m%n;
            m = n;
            n = temp;
        }
        System.out.println(n+a*b/n);
    }
*/


/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        if (n >= 12){
            cnt = n / 12;
        }
        int time = 2 + 4 * cnt;
        System.out.println(time);
    }

    */
/*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("[: ]");
        int  a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
            b = b + c;
            a = a + b / 60;
            b = b % 60;

        if (a >= 24){
            a = a % 24;
        }
        System.out.printf("%02d:%02d",a,b);
    }

*/

/*

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = n*(n + 1) / 2;
        System.out.println(sum);
        for (int i = 0;i <= n;i++){
            sum += i;
        }

    }
*/

}
