import java.util.Scanner;

public class B3 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Nhap mang: ");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        int min_val=a[0];
        for(int i=1;i<n;i++)
            if ( min_val > a[i] ) min_val=a[i]; 
        System.out.println("Gia tri nho nhat: "+min_val);
        System.out.print("Cac vi tri co gia tri nho nhat: ");
        for(int i=0;i<n;i++)
            if ( min_val == a[i] ){
                System.out.print((i+1)+" ");
            }
        
    }
}
