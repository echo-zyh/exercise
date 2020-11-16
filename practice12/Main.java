package practice12;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 22:29 2020/11/16 0016
 * @Modified By:
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String value = bf.readLine();
        char[] values = value.toCharArray();
        for (int i = 0; i < value.length(); i++){
            if (Integer.parseInt(values[i] + "")%2 == 0){
                values[i] = '0';
            } else{
                values[i] = '1';
            }
        }
        String ans = new String(values);
        int a = Integer.parseInt(ans);
        System.out.println(a);
    }
}