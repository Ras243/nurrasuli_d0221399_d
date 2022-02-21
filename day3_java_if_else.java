package com.tutorial;
import java.util.*;


public class day3_java_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        if (N %2 == 1 && N <= 100){
            System.out.println("Weird");
        }
        else if (2 <= N && N <= 5){
            System.out.println(" Not Weird");
        }
        else if (6 <= N && N <= 20){
            System.out.println("Weird");
        }
        else if (20 <= N ){
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
