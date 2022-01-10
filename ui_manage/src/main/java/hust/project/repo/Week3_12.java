package hust.project.repo;

import java.util.Scanner;

public class Week3_12 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        String input[] = lines[1].split("\\s+");
        String input3[] = lines[3].split("\\s+");
        System.out.print("Nhap N: ");

        int n = Integer.valueOf(lines[0]);
        int a[] = new int[n];
        System.out.println("Nhap mang A: ");
        for(int i=0;i<n;i++){
            a[i]=Integer.valueOf(input[i]);
        }
        System.out.print("Nhap M: ");
        int m = Integer.valueOf(lines[2]);
        int b[] = new int[m];
        System.out.println("Nhap mang B: ");
        for(int i=0;i<m;i++){
            b[i]=Integer.valueOf(input3[i]);
        }
        
        int j=0;;
        for(int i=0;i<m;i++){
            if ( j < n ){
                if ( b[i] == a[j] ) j++;
            }
        }
        if ( j == n ){
            System.out.println("A la day con cua B ");
            output.append("A la day con cua B ");
        }
        else{
            System.out.println("A khong la day con cua B ");
            output.append("A khong la day con cua B ");
        }
        return output.toString();
    }
}
