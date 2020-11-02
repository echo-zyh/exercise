

import java.io.*;



/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 11:03 2020/11/2 0002
 * @Modified By:
 */
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null){
            String[] strings = s.split("[+\\-*/]");
            if (strings.length < 2){
                System.out.println("Invalid operation!");
                continue;
            }
            double a = Double.parseDouble(strings[0]);
            double b = Double.parseDouble(strings[1]);
            char ch = s.charAt(strings[0].length());
            if (ch=='+')
                System.out.println(String.format("%.4f+%.4f=%.4f",a,b,a+b));
            else if (ch=='-')
                System.out.println(String.format("%.4f-%.4f=%.4f",a,b,a-b));
            else if (ch=='*')
                System.out.println(String.format("%.4f*%.4f=%.4f",a,b,a*b));
            else if (ch=='/') {
                if (b == 0)
                    System.out.println("Wrong!Division by zero!");
                else
                    System.out.println(String.format("%.4f/%.4f=%.4f",a,b,a/b));
            }
        }
    }


    //获得月份天数
/*
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int year = Integer.parseInt(s.substring(0,s.indexOf(" ")));
            int month = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
            int a[] = { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                a[1] = 29;
            else
                a[1] = 28;
            System.out.println(a[month - 1]);
        }
    }
*/

    //计算一元二次方程
    /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  str = null;
        while ((str = br.readLine()) != null){
            String[] strings = str.split(" ");
            double a= Double.parseDouble(strings[0]);
            double b= Double.parseDouble(strings[1]);
            double c = Double.parseDouble(strings[2]);
            double ddd = (b*b)-(4*a*c);
            if (a == 0){
                System.out.println("Not quadratic equation\n");
            }else {
                if (ddd == 0 ){
                    double x1 = -b/2/a;
                    System.out.printf("x1=x2=%.2f\n",x1);
                }else if (ddd > 0){
                    double x1 = (-b - sqrt(ddd))/ 2/a;
                    double x2 = (-b + sqrt(ddd))/ 2/a;
                    System.out.printf("x1=%.2f;x2=%.2f\n",x1,x2);
                }else {
                    double x1 = -b/2/a;
                    double x2 = sqrt(-ddd)/2/a;
                    if (x2 > 0){
                        System.out.printf("x1=%.2f-%.2fi;x2=%.2f+%.2fi\n",x1,x2,x1,x2);
                    }else {
                        System.out.printf("x1=%.2f%.2fi;x2=%.2f-%.2fi\n",x1,x2,x1,x2);
                    }
                }
            }
        }
    }
*/

    // bmi
    /*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  str = null;
        while ((str = br.readLine()) != null){
            String[] strings = str.split(" ");
            int a = Integer.parseInt(strings[0]);
            Double b =  Double.parseDouble(strings[1])/100;
            double bmi = a/(b*b);
            if (bmi < 18.5){
                System.out.println("Underweight");
            }else if (bmi >= 18.5 && bmi <= 23.9){
                System.out.println("Normal");
            }else if (bmi > 23.9 && bmi <= 27.9){
                System.out.println("Overweight");
            }else System.out.println("Obese");
        }
    }
*/

    //三角形判断
    /*public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  a = null;
        while ((a = br.readLine()) != null){
            String[] strings = a.split(" ");
            int b = Integer.parseInt(strings[0]);
            int c = Integer.parseInt(strings[1]);
            int d = Integer.parseInt(strings[2]);

            if (c+b > d && c+d > b && b+d > c){
                if (d == b && b == c){
                    System.out.println("Equilateral triangle!");
                }else if ((b==d && b !=c) || (b==c && b!=d) || (c == d && c!=b)){
                    System.out.println("Isosceles triangle!");
                }else System.out.println("Ordinary triangle!");
            }else System.out.println("Not a triangle!");
        }
    }*/

    //跃阶函数，输入不同,输出不同。
    /*public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  a = null;
        while ((a = br.readLine()) != null){
            int cnt = Integer.parseInt(a);
            if (cnt > 0 ){
                System.out.println(1);
            }else if (cnt < 0){
                System.out.println(0);
            }else System.out.println("0.5");
        }
    }*/
    
    //输入字符整数 比较大小
    /*public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null){
          int [] a = new int[2];
          String[] strings = str.split(" ");
          a[0] = Integer.parseInt(strings[0]);
          a[1] = Integer.parseInt(strings[1]);
          if (a[0] >  a[1]){
              System.out.println(a[0]+">"+a[1]);
          }else if (a[0] < a[1]){
              System.out.println(a[0]+"<"+a[1]);
          }else System.out.println(a[0]+"="+a[1]);
        }
    }*/


    //大小写字母转换
    /*public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null){
            char c =str.charAt(0);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
                System.out.println(c);
            }
            else {
                c = (char)(c + 32);
                System.out.println(c);
            }
        }
    }*/

    //判断是否是字母
   /* public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null){
            char c =str.charAt(0);
            if ((c >= 'a' && c <= 'z') ||(c >= 'A' && c <= 'Z')){
                System.out.println(c+" is an alphabet.");
            }
            else {
                System.out.println(c+" is not an alphabet.");
            }
        }
    }*/


    //判断元音或辅音
    /*public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        String str = null;
        char [] chars = new char[5];
        chars[0] = 'a';
        chars[1] = 'e';
        chars[2] = 'i';
        chars[3] = 'o';
        chars[4] = 'u';
        while ((str = br.readLine()) != null){
            str = str.toLowerCase();
            char c =str.charAt(0);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
    }*/
}