package com.tutorial;
import java.util.Scanner;

public class day2_java_stdin_stdout {
    
    public static void main(String[] rascoding) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
    
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
    }
}