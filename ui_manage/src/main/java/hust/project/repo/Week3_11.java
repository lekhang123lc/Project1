package hust.project.repo;

import java.util.Scanner;

public class Week3_11 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        int n = Integer.valueOf(lines[0]);
        String input[] = lines[1].split("\\s+");
        int a[] = new int[n];
        System.out.println("Nhap mang: ");
        for(int i=0;i<n;i++){
            a[i]=Integer.valueOf(input[i]);
        }
        int d=1,x=0,max_long=0;
        for(int i=1;i<n;i++){
            if ( a[i] > a[i-1] ) d++;
            else d=1;
            if ( d > max_long ){
                x=i-d+1;
                max_long=d;
            }
        }
        System.out.println("Day con tang lien tuc dai nhat la: ");
        for(int i=x;i<n;i++){
            System.out.print(a[i]+" ");
            output.append(a[i]+" ");
        }
        return output.toString();
    }
}
