package practice2;


import java.io.*;


/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 17:30 2020/11/3 0003
 * @Modified By:
 */
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            int a = Integer.parseInt(str);
            for (int i = 0 ;i <= a;i++){
                for (int j =i ; j <= a;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            for (int j = a; j > 0 ;j--) {
                for (int i = 1; i <= j; i++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    //菱形图案
    /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            int a = Integer.parseInt(str);
            for (int i = a ; i > 0;i--){
                for (int j = i;j > 0 ;j--){
                    System.out.print(" ");
                }
                for (int k = a-i;k >= 0 ;k--){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i <= a;i++){
                System.out.print("* ");
            }
            System.out.println();
            for (int i = a ; i > 0;i--){
                for (int j = a-i;j >= 0 ;j--){
                    System.out.print(" ");
                }
                for (int k = i;k > 0 ;k--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
*/
    // 翻转金字塔
   /*
   public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            int a = Integer.parseInt(str);
            for (int i = 1 ; i <= a;i++){
                for (int j = 1;j < i ;j++){
                    System.out.print(" ");
                }
                for (int k = a-i;k >= 0 ;k--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

*/
    //组成金字塔图案
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            int a = Integer.parseInt(str);
            for (int i = 1 ; i <= a;i++){
                for (int j = a-i;j >= 1 ;j--){
                    System.out.print(" ");
                }
                for (int k = 1;k <= i ;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
*/

    //带空格的直三角形图案
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            int a = Integer.parseInt(str);
            for (int i = 1; i <= a; i++) {
                int j;
                int k;
                for (j = a-i;j >= 1 ;j--){
                    System.out.print("  ");
                }
                for ( k = 1; k <= i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

*/

    //翻转三角形
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null){
            int a = Integer.parseInt(str);
            for (int i = a ; i >= 1;i--){
                for (int j = i ;j >= 1 ;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

*/

    //打印直角三角形
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null){
            int a = Integer.parseInt(str);
            for (int i = 1; i <= a ;i++){
                for (int j = 1 ;j <= i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

*/

    //打印正方形
    /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null){
            int a = Integer.parseInt(str);
            for (int i = 1;i <= a;i++){
                for (int j = 1; j <= a; j++){
                    System.out.print("* ");
                    if (j==a){
                        System.out.println();
                    }
                }
            }
        }
    }
    */
}
