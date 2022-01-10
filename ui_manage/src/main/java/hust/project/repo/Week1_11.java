package hust.project.repo;

import java.util.Random;

public class Week1_11 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        int len = 10;
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Random ran = new Random();
        int n = ran.nextInt(9)+1;
        System.out.println("Day ban dau:");
        output.append("Day ban dau:\n");
        for(int i=0;i<len;i++){
            output.append(arr[i]+" ");
            System.out.print(arr[i]+" ");
        }

        for(int i=1;i<=n;i++){
            int r1 = ran.nextInt(len);
            int r2 = ran.nextInt(len);
            int tmp = arr[r1];
            arr[r1]=arr[r2];
            arr[r2]=tmp;
        }

        System.out.println("\nDay sau khi hoan doi "+n+" lan ngau nhien:");
        output.append("\nDay sau khi hoan doi "+n+" lan ngau nhien:\n");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
            output.append(arr[i]+" ");
        }
        
        return output.toString();
    }
}