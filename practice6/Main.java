package practice6;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = br.readLine().split(" ");
        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);
        String[][] str = new String[n][m];
        for (int i = 0; i < n; i++) {
            String[] nums = br.readLine().split(" ");
            str[i] = nums;
        }
        int k = Integer.parseInt(br.readLine());
        while(k>0){
            String[] cc = br.readLine().split(" ");
            String t = cc[0];
            int a = Integer.parseInt(cc[1]);
            int b = Integer.parseInt(cc[2]);
            if("r".equals(t)){
                for(int i = 0;i<m;i++){
                    String temp = str[a-1][i];
                    str[a-1][i] = str[b-1][i];
                    str[b-1][i] = temp;
                }
            }
            if("c".equals(t)){
                for(int i = 0;i<n;i++){
                    String temp = str[i][a-1];
                    str[i][a-1] = str[i][b-1];
                    str[i][b-1] = temp;
                }
            }
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(str[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sb.setLength(0);
    }
}
