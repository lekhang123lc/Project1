package hust.project.repo;

import java.util.Scanner;

public class Week3_1 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap N: ");
        int n = Integer.valueOf(lines[0]);
        String input[] = lines[1].split("\\s+");
        int a[] = new int[n];
        System.out.println("Nhap mang can sap xep: ");
        for(int i=0;i<n;i++){
            a[i]=Integer.valueOf(input[i]);
        }
        for(int i=0;i<n;i++)
            for(int j=i;j<n;j++){
                if ( a[i] < a[j] ){
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        System.out.println("Mang sau khi sap xep giam dan: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
            output.append(a[i]+" ");
        }
            
        return output.toString();
    }
}