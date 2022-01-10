package hust.project.repo;

import java.util.Scanner;

public class Week3_10 {

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
            if ( a[i] == a[i-1] ) d++;
            else d=1;
            if ( d > max_long ){
                x=i-d+1;
                max_long=d;
            }
        }
        System.out.println("Day bang nhau dai nhat co do dai la: "+max_long);
        System.out.println("Day bang nhau dai nhat bat dau tu: "+x);
        output.append("Day bang nhau dai nhat co do dai la: "+max_long+"\n");
        output.append("Day bang nhau dai nhat bat dau tu: "+x);
        return output.toString();
    }
}
