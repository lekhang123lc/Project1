package hust.project.repo;

import java.util.Scanner;

public class Week3_2 {

    public static int checkPrimary(int x){
        for(int i=2;i<=x/2;i++){
            if ( x%i == 0 ) return 0;
        }
        return 1;
    }

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap N: ");
        int n = Integer.valueOf(lines[0]);
        String input[] = lines[1].split("\\s+");
        int a[] = new int[n];
        System.out.println("Nhap mang: ");
        for(int i=0;i<n;i++){
            a[i]=Integer.valueOf(input[i]);
        }
        System.out.println("Cac so nguyen to: ");
        for(int i=0;i<n;i++)
            if ( checkPrimary(a[i]) == 1 ){
                System.out.print(a[i]+" ");
                output.append(a[i]+" ");
            }
        
        return output.toString();
    }
}