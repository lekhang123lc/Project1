import java.util.Scanner;

public class B13 {

    public static int check(int x, int y, int n){
        if ( x < 0 || y < 0 || x >= n || y >=n ) return 0;
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = input.nextInt();
        while( n < 3 || n > 8 ){
            System.out.print("Nhap N trong khoang tu 3 den 8: ");
            n = input.nextInt();
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
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
            
    }
}
