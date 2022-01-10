package hust.project.repo;

import java.util.Scanner;

public class Week3_3 {

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
        int min_val=a[0];
        for(int i=1;i<n;i++)
            if ( min_val > a[i] ) min_val=a[i]; 
        System.out.println("Gia tri nho nhat: "+min_val);
        System.out.print("Cac vi tri co gia tri nho nhat: ");
        output.append("Gia tri nho nhat: "+min_val+"\n");
        output.append("Cac vi tri co gia tri nho nhat: ");
        for(int i=0;i<n;i++)
            if ( min_val == a[i] ){
                System.out.print((i+1)+" ");
                output.append((i+1)+" ");
            }
        
        return output.toString();
    }
}
