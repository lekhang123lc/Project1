package hust.project.repo;

import java.util.Scanner;

public class Week3_13 {

    public static int check(int x, int y, int n){
        if ( x < 0 || y < 0 || x >= n || y >=n ) return 0;
        return 1;
    }

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        int n = Integer.valueOf(lines[0]);
        while( n < 3 || n > 8 ){
            System.out.print("Nhap N trong khoang tu 3 den 8: ");
            return "Nhap N trong khoang tu 3 den 8";
            
        }
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=0;
        int u[] = {0,1,0,-1};
        int v[] = {1,0,-1,0};
        int dem=0,k=0,x=0,y=0;
        while( dem < n*n ){
            a[x][y] = ++dem;
            if ( check(x+u[k],y+v[k],n) == 0 || a[x+u[k]][y+v[k]] != 0 ) k=(k+1)%4;
            x+=u[k];
            y+=v[k];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
                output.append(a[i][j]+" ");
            }
            output.append("\n");
            System.out.println();
        }
            
        return output.toString();
    }
}
