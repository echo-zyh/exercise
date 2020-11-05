package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.Scanner;
import java.util.zip.GZIPOutputStream;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 12:39 2020/11/5 0005
 * @Modified By:
 */
public class Main {

    //有序序列去重
/*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().split(" ")[0]);
        int arr[] = new int[n];
        String str[]= br.readLine().split(" ");
        int index = 0;
        while (n>0){
            arr[index] = Integer.parseInt(str[index]);
            ++index;
            n--;
        }

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]==0)
                continue;
            System.out.print(arr[i]+" ");
        }
    }
*/

    //删除重复数
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt( br.readLine());
        String[] str = br.readLine().split(" ");
        int b =Integer.parseInt(br.readLine());
        int [] cnt = new int[str.length];
        for(int i = 0;i < cnt.length;i++ ){
            cnt[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0 ; i < cnt.length ;i++){
            if (cnt[i] == b){
                continue;
            }
            System.out.print(cnt[i]+" ");
        }
    }
*/

    //判断数组是否有序（升序或降序）
/*
      public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt( br.readLine());
        String[] str = br.readLine().split(" ");
        int [] cnt = new int[str.length];
        int st1 = 0;
        int st2 = 0;
        for(int i = 0;i < cnt.length;i++ ){
            cnt[i] = Integer.parseInt(str[i]);
        }

        for(int i = 1;i < cnt.length ;i++){
            if(cnt[i-1] >= cnt[i]){
                st1++;
            }else if(cnt[i-1]< cnt[i]){
                st2++;
            }
        }

        if(st1 == cnt.length-1 || st2 == cnt.length-1){
            System.out.println("sorted");
        }else System.out.println("unsorted");
    }
    */


   /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = 0 ;
        int b = 0 ;
        for (int i = 0;i < str.length;i++){
            int cnt = Integer.parseInt(str[i]);
            if (cnt > 0){
                a++;
            }else b++;
        }
        System.out.println("positive:"+a);
        System.out.println("negative:"+b);
    }
*/

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 1 ;i <= a*b;i++){
            int c = sc.nextInt();
            if (c > 0){
                sum += c;
            }
        }
        System.out.println(sum);
    }
*/
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        if (str[0].equals(str[1])){
            System.out.println("same");
        }else System.out.println("different");

    }
*/

 /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        float max = 0;
        float min = 101;
        float sum = 0;
        for (int i = 1;i <= cnt;i++){
            float a = sc.nextFloat();
            if (a >= max){
                max = a;
            }
            if (a <= min){
                min = a;
            }
            sum += a;
        }
        float avg = sum / cnt;
        System.out.printf("%.2f %.2f %.2f",max,min,avg);
    }

*/

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 1 ;i <= cnt;i++){
            if (i%2!=0){
                a++;
            }else b++;
        }
        System.out.println(a+" "+b);
    }
*/
       /*
       public static void main (String[] args){
            int n=0;
            for(int i=1;i<=2019;i++){
                if(i%10==9||(i/10)%10==9||(i/100)%10==9||(i/1000)%10==9){
                    n++;
                }
            }
            System.out.println(n);
        }
        */


/*
        public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int split = Integer.parseInt(br.readLine());
        if(split<0){
            System.out.println("1");
        }else if(split==0){
            System.out.println("0");
        }else if(split>0){
            System.out.println("-1");
        }
    }
    */

/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 5 == 0){
            System.out.println("YES");
        }else System.out.println("NO");
    }

*/

  /*
  public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int d = Integer.parseInt(str[3]);

        System.out.println((a+b-c)*d);
    }

*/
//登录验证
/*
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String username="admin";
        String password="admin";
        String input="";
        while((input=br.readLine())!=null){
            String inputName=input.split(" ")[0];
            String inputPass=input.split(" ")[1];
            if (inputName.equals(username)&&inputPass.equals(password))
                System.out.println("Login Success!");
            else
                System.out.println("Login Fail!");
        }
    }
*/

//图像相似度
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] cnt = new int[a*b];
        int n = 0;
        int m;
        for (int i = 0 ;i < cnt.length;i++){
            cnt[i] = sc.nextInt();
        }

        for (int i = 0 ;i < cnt.length;i++){
             m = sc.nextInt();
            if (m == cnt[i]){
                n++;
            }
        }
        float all = a*b;
        float nm = n / all *100;
        System.out.printf("%.2f",nm);
    }
    */


//筛选法求n以内的素数
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] cnt = new int[a-1];
        int b = 2;
        for (int i = 0 ;i < cnt.length;i++){
            cnt[i] = b;
            b++;
        }
        for (int i = 2 ; i < cnt.length ;i++){
            for (int j = i ;j < cnt.length;j++) {
                if (cnt[j] % i == 0 &&cnt[j] !=0) {
                    cnt[j] = 0;
                }
            }
        }
        int m = 0;
        for ( int i = 0;i < cnt.length;i++){
            if (cnt[i] != 0 ){
                System.out.print(cnt[i]+" ");
                m++;
            }
        }
        System.out.println("");
        System.out.println(cnt.length-m);
    }
    */
//有序序列插数
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] cnt = new int[a+1];
        for (int i = 0; i < cnt.length-1;i++){
            cnt[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int n = 0;
        while (b >= cnt[n] && n < cnt.length){
            n++;
        }
        for (int j = cnt.length-1; j > n;j--){
            cnt[j] = cnt[j-1];
        }
        cnt[n] = b;
        for (int i = 0 ;i < cnt.length;i++){
            System.out.print(cnt[i]+" ");
        }
    }
*/

//去掉最大最小 计算平均数
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String [] str = s.split(" ");
        int [] array = new int[str.length];
        for (int i = 0 ;i < str.length;i++){
            array[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(array);
        double sum = 0 ;
        for (int i = 1 ; i < array.length-1;i++){
            sum += array[i];
        }
        System.out.printf("%.2f",sum/5);
    }

*/

}
