package practice5;

import com.sun.org.apache.xpath.internal.axes.OneStepIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 16:17 2020/11/6 0006
 * @Modified By:
 */
public class Main {

    
    //矩阵转置
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[][] num1 = new int[n][m];

        for (int i = 0; i < n; i++) {
            String arr2[] = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                num1[i][j] = Integer.parseInt(arr2[j]);
            }
        }
        int [][] num2 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0;j < n;j++ ){
                num2[i][j] = num1[j][i];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num2[i][j]+" ");
            }
            System.out.println();
        }

    }

*/


    //上三角矩判定
    /*
    public static void main(String[] args)throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n ;i++){
            String [] str = br.readLine().split(" ");
            for (int j = 0 ; j < i;j++){
                if (Integer.parseInt(str[j]) !=0){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
*/

    //矩阵相等判定
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int [] []  cnn = new int[a][b];
        int [] []  cnn1 = new int[a][b];
        String[][] str1 = new String[a][b];
        String[][] str2 = new String[a][b];

        for (int i = 0 ;i < str1.length;i++){
            str1[i] = br.readLine().split(" ");
        }
        for (int i = 0 ;i < a;i++){
            for (int j = 0;j < b;j++){
                cnn[i][j] = Integer.parseInt(str1[i][j]);
            }
        }

        for (int i = 0 ;i < str2.length;i++){
            str2[i] = br.readLine().split(" ");
        }

        for (int i = 0 ;i < a;i++){
            for (int j = 0;j < b;j++){
                cnn1[i][j] = Integer.parseInt(str2[i][j]);
            }
        }
        boolean istrue = false;
        for (int i = 0 ; i < a;i++){
            for (int j = 0 ;j < b;j++){
                if (cnn[i][j] != cnn1[i][j]){
                    istrue = true;
                    break;
                }
            }
        }
        if (istrue == false){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }*/
    //最高身高
    /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int [] []  cnn = new int[a][b];
        String[][] str1 = new String[a][b];
        for (int i = 0 ;i < str1.length;i++){
            str1[i] = br.readLine().split(" ");
        }

        for (int i = 0 ;i < a;i++){
            for (int j = 0;j < b;j++){
                cnn[i][j] = Integer.parseInt(str1[i][j]);
            }
        }
        int max = cnn[0][0];
        int l = 0;
        int m = 0;
        for ( int i = 0;i < a;i++){
            for (int j =0;j < b;j++){
                if (max < cnn[i][j]){
                    max = cnn[i][j];
                    l = i;
                    m = j;
                }
            }
        }
        System.out.println((l+1)+" "+(m+1));

    }
    */



    //序列重组矩阵
/*
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //获取行、列的具体数据
        String[] str1 = br.readLine().split(" ");
        int x = Integer.parseInt(str1[0]);
        int y = Integer.parseInt(str1[1]);
        //获取要成为数组的数据
        str1 = br.readLine().split(" ");
        for(int i=0;i<str1.length;i++){
            //遇到第y列就换行
            if((i+1)%y == 0){
                System.out.println(str1[i]+" ");
            }else{
                System.out.print(str1[i]+" ");
            }
        }
    }
*/

    //矩阵元素定位
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String[] strings = br.readLine().split(" ");
        String[] strings1 = br.readLine().split(" ");
        int i = 0;
        int [] nn = new int[Integer.parseInt(str[0])*Integer.parseInt(str[1])];
        for (; i < strings.length ;i++){
            nn[i] = Integer.parseInt(strings[i]);
        }
        for (int j = 0;j < strings1.length;j++){
            nn[i] = Integer.parseInt(strings1[j]);
            i++;
        }
        String[] strings2 = br.readLine().split(" ");
        int index = (Integer.parseInt(strings2[0])-1) * strings1.length + Integer.parseInt(strings2[1])-1;
        System.out.println(nn[index]);
    }
*/

    //班级输入输出
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null){
            String[] strings = str.split(" ");
            float [] a = new float[strings.length];
            float sum = 0;
            for (int i = 0 ; i < a.length;i++){
                a[i] = Float.parseFloat(strings[i]);
                sum += a[i];
            }

            for (int i = 0 ; i < a.length;i++){
                System.out.printf("%.1f ",a[i]);
            }
            System.out.printf("%.1f\n",sum);
        }
    }

 */

    // 有序序列合并
    /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] strings = br.readLine().split(" ");
        int[] n = new int [Integer.parseInt(strings[0])];
        int[] m = new int[Integer.parseInt(strings[1])];

        String[] strings1 = br.readLine().split(" ");
        String[] strings2 = br.readLine().split(" ");

        for (int i = 0 ;i < m.length;i++) {
            if (i < n.length) {
                n[i] = Integer.parseInt(strings1[i]);
            }
            m[i] = Integer.parseInt(strings2[i]);
        }

        int i = 0;
        int j = 0;
        while (i < n.length || j < m.length) {
            if ( i < n.length  ) {
                if (n[i] <= m[j]) {
                    System.out.print(n[i] + " ");
                    i++;
                }else if (m[j] < n[i]){
                    System.out.print(m[j] + " ");
                        j++;
                }
            }else {
                for (; j < m.length;j++){
                    System.out.print(m[j]+" ");
                }
            }
        }
    }*/
}
