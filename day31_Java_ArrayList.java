package rascoding;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day31_Java_ArrayList {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] data = new int[n][];
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            if (d>0){
                data[i] = new int[d];
                for(int j=0;j<d;j++){
                    int elemen = sc.nextInt();
                    data[i][j] = elemen;
                }
            }else{
                data[i] = null;
            }
        } //end of input element
        
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            if(x<n && data[x] != null && y<data[x].length){
                int element = data[x][y];
                System.out.println(element);
            }
            else{
                System.out.println("ERROR!");
            }
        }
    }
}