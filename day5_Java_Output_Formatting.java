package com.tutorial;

import java.util.*;

public class day5_Java_Output_Formatting {
    public static void main(String[] rascoding) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d\n",s1,x);
        }
        System.out.println("================================");
        sc.close();
    }
}
