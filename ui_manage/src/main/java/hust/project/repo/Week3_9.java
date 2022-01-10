package hust.project.repo;

import java.util.Scanner;

public class Week3_9 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        String input1[] = lines[0].split("\\s+");
        System.out.print("Nhap N: ");
        int n = Integer.valueOf(input1[0]);
        int c = Integer.valueOf(input1[1]);
        String input[] = lines[1].split("\\s+");
        int d1=0,d2=0,d3=0;
        int a[] = new int[n];
        System.out.println("Nhap mang: ");
        for(int i=0;i<n;i++){
            a[i]=Integer.valueOf(input[i]);
            if ( a[i] < c )  d1++;
            if ( a[i] == c ) d2++;
            if ( a[i] > c )  d3++;
        }

        System.out.println("So cac so nho hon "+c+": "+d1);
        System.out.println("So cac so bang "+c+": "+d2);
        System.out.println("So cac so lon hon "+c+": "+d3);


        output.append("So cac so nho hon "+c+": "+d1+"\n");
        output.append("So cac so bang "+c+": "+d2+"\n");
        output.append("So cac so lon hon "+c+": "+d3+"\n");
        return output.toString();
    }
}
