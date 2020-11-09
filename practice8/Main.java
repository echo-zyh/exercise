package practice8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 16:01 2020/11/9 0009
 * @Modified By:
 */
public class Main {
    
    //进制转换
    /*
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long n = Long.parseLong(br.readLine());

            StringBuffer sb = new StringBuffer();
            while(n!=0){
                sb.append(n%6);
                n/=6;
            }
            System.out.println(sb.reverse().toString());
        }
     */

    //井字棋检验
   /*
   public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] str = new String[3][3];

        for (int i = 0 ;i < 3;i++){
            str[i] = br.readLine().split(" ");
        }
        //行检查
        for (int i = 0 ;i < 3;i++){
            int k = 0;
            int b = 0;
            for (int j = 0;j < 3;j++){
                if ("K".equals(str[i][j])){
                    k++;
                }else if ("B".equals(str[i][j])){
                    b++;
                }
            }
            if (b == 3){
                System.out.println("BoBo wins!");
                return;
            }else if (k == 3){
                System.out.println("KiKi wins!");
                return;
            }
        }
        //列检查
        for (int i = 0 ;i < 3;i++) {
            int k = 0;
            int b = 0;
            for (int j = 0; j < 3; j++) {
                if ("K".equals(str[j][i])){
                    k++;
                }else if ("B".equals(str[j][i])){
                    b++;
                }
            }
            if (b == 3){
                System.out.println("BoBo wins!");
                return;
            }else if (k == 3){
                System.out.println("KiKi wins!");
                return;
            }
        }
        //对角线检查

        if ((str[0][0].equals(str[1][1]) && str[1][1].equals(str[2][2]) &&"K".equals(str[0][0])) || (str[0][2].equals(str[1][1]) && str[1][1].equals(str[2][0]) && "K".equals(str[1][1]))){
            System.out.println("KiKi wins!");
            return;
        }else if ((str[0][0].equals(str[1][1]) && str[1][1].equals(str[2][2]) &&"B".equals(str[0][0])) || (str[0][2].equals(str[1][1]) && str[1][1].equals(str[2][0]) && "B".equals(str[1][1]))){
            System.out.println("BoBo wins!");
            return;
        }

        System.out.println("No winner!");
    }
    */
}
