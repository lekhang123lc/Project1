import java.util.Scanner;

public class B7 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = input.nextInt();
        int a[] = new int[n];
        int d[] = new int[n];
        System.out.println("Nhap mang: ");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
            d[i]=0;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
                if ( a[i] == a[j] ) {
                    d[i]=1;
                    d[j]=1;
                }
        }
        int min_val=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if ( min_val > a[i] && d[i] == 0 ) min_val=a[i];
        }
            
        System.out.println("Gia tri nho nhat khong bi trung: "+min_val);
        
    }
}
