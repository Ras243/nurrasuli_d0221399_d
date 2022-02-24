package com.tutorial;

import java.io.*;

public class day6_Java_Loops_I {
    public static void main(String[] rascoding) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i=1;i<=10;i++){
            int result = N * i;
            // System.out.println(N+" x "+i+" = "+result);
            // atau dengan print format
            System.out.printf("%d x %d = %d%n", N,i,result);
        }
        bufferedReader.close();
    }
}
