package practice3;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuffer sb = new StringBuffer();
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            for (int i = 1;i <= n ;i++){
                for (int j = 1;j <= i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }


    /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuffer sb = new StringBuffer();
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
        switch(n) {
            case 200:
                System.out.println("OK");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Not Found");
                break;

            case 500:
                System.out.println("Internal Server Error");
                break;
            case 502:
                System.out.println("Bad Gateway");
                break;
         }
        }
    }

*/
   /*
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 10){
            System.out.println("Danger++");
        }else if (n >= 4 && n <= 9){
            System.out.println("Danger");
        }else {
            System.out.println("Good");
        }
    }
*/
  /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[]str = s.split(" ");
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);
        double c = Double.parseDouble(str[2]);
        double d = Double.parseDouble(str[3]);
        double e = Double.parseDouble(str[4]);

        double avg = (a + b + c + d + e) / 5;

        System.out.printf("%.2f",avg);
    }
*/

    /*
    public static void main(String[] args) {
        System.out.println("Happy New Year*2019*");
    }
    */

    //空心三角形
    /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuffer sb = new StringBuffer();
        while ((s = br.readLine()) != null) {
            int num = Integer.parseInt(s);
            for (int i = 1 ; i <= num;i++){
                if (i == 1){
                    System.out.print("* ");
                    for (int m = 1;m <= num-1;m++){
                        System.out.print("  ");
                    }
                    System.out.println();
                }else if (i == num){
                    for (int l = 1;l <= num;l++){
                        System.out.print("* ");
                    }
                }else {
                        System.out.print("* ");
                    for (int k = 2 ;k < i;k++){
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                    for (int n = i ; n <= num;n++){
                        System.out.print("  ");
                    }

                    System.out.println();
                }
            }
        }
    }
*/
    //空心正方形图案
    /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuffer sb = new StringBuffer();
        while ((s = br.readLine()) != null) {
            int num = Integer.parseInt(s);
            for (int i = 1 ;i <= num;i++){
                if (i ==1 || i==num){
                    for (int j = 1;j <=num;j++){
                        System.out.print("* ");
                    }
                }
                else {
                    System.out.print("* ");
                    for (int k = 1; k <= num - 2; k++) {
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
*/
    //X形图案
    /*
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuilder sb = new StringBuilder();
        while((s = br.readLine())!=null){
            int n = Integer.parseInt(s);
            for(int i=0;i<n ;i++){
                for(int j=0;j<n;j++){
                    if(i==j || j==n-i-1){
                        sb.append("*");
                    }else{
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }

            System.out.print(sb);
            sb.setLength(0);
        }
    }
*/
    //正斜线
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuffer sb = new StringBuffer();
        while ((s = br.readLine()) != null) {
            int num = Integer.parseInt(s);
            for (int i = 1; i <= num; i++) {
                for (int k = i; k <= num; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
*/

    //反斜线图案
    /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        StringBuffer sb=new StringBuffer();
        while ((s = br.readLine())!=null){
            int num=Integer.parseInt(s);
            for (int i = 1 ; i <= num;i++){
                for (int j = 1 ;j < i ;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = i ;k <= num;k++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
*/

    //箭形图案
    /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=null;
        StringBuffer sb=new StringBuffer();
        while ((s=br.readLine())!=null){
            int num=Integer.parseInt(s);
            for(int i=num;i>0;i--){
                for(int j=i;j>0;j--){
                    sb.append("  ");
                }
                for(int k=num-i;k>=0;k--){
                    sb.append("*");
                }
                sb.append("\n");
            }
            for(int i=0;i<=num;i++){
                sb.append("*");

            }
            sb.append("\n");
            for(int i=num;i>0;i--){
                for(int j=num-i;j>=0;j--){
                    sb.append("  ");
                }
                for(int k=i;k>0;k--){
                    sb.append("*");
                }
                sb.append("\n");
            }
            System.out.print(sb);
            sb.setLength(0);
        }

    }
*/
    //K形图案
/*
public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringBuilder sb=new StringBuilder();
        while((s=bf.readLine())!=null){
            int n=Integer.parseInt(s);
            for(int i=n;i>0;i--)
            {
                for(int j=i+1;j>0;j--){
                    sb.append("* ");
                }
                for(int j = 0;j<n-i;j++)
                    sb.append(' ');
                sb.append("\n");
            }

            for(int i=0;i<=n;i++)
            {
                for(int j=i+1;j>0;j--){
                    sb.append("* ");
                }
                for(int j=n;j>i;j--)
                    sb.append(' ');

                sb.append("\n");
            }
            System.out.print(sb);
            sb.setLength(0);
        }
    }*/
}