package hust.project.repo;

import java.util.Scanner;

public class Week4_16 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap xau s1: ");
        String s1 = lines[0];
        System.out.print("Nhap xau s2: ");
        String s2 = lines[1];
        int n = s1.length(),m = s2.length();
        
        int j=0;
        for(int i=0;i<m;i++){
            if ( j < n ){
                if ( s2.charAt(i) == s1.charAt(j) ) j++;
            }
        }
        if ( j == n ){
            System.out.println("s1 la xau con cua s2 ");
            return "s1 la xau con cua s2 ";
        }
        else{
            System.out.println("s1 khong la xau con cua s2 ");
            return "s1 khong la xau con cua s2 ";
        }
        //return output.toString();
    }
}
