package hust.project.repo;

import java.util.Scanner;

public class Week3_4 {

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
        int max_val=a[0];
        for(int i=1;i<n;i++)
            if ( max_val < a[i] ) max_val=a[i]; 
        System.out.println("Gia tri lon nhat: "+max_val);
        System.out.print("Cac vi tri co gia tri lon nhat: ");
        output.append("Gia tri lon nhat: "+max_val+"\n");
        output.append("Cac vi tri co gia tri lon nhat: ");
        for(int i=0;i<n;i++)
            if ( max_val == a[i] ){
                System.out.print((i+1)+" ");
            }
        
        return output.toString();
    }
}
