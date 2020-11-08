package practice7;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 14:31 2020/11/8 0008
 * @Modified By:
 */
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb =new StringBuffer();
        int n = Integer.parseInt(bf.readLine());
        int[][] a = new int[n][n];
        for(int i = 0;i<n;i++)
            a[i][0] = 1;
        for(int i =1;i<n;i++)
            for(int j = 1;j<=i;j++)
                a[i][j] = a[i-1][j-1]+a[i-1][j];
        for(int i =0;i<n;i++){
            for(int j = 0;j<=i;j++)
                sb.append(String.format("%5d",a[i][j]));
            sb.append('\n');
        }
        System.out.print(sb);
    }

}