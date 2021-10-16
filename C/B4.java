import java.util.Scanner;

public class B4 {

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
        int max_val=a[0];
        for(int i=1;i<n;i++)
            if ( max_val < a[i] ) max_val=a[i]; 
        System.out.println("Gia tri lon nhat: "+max_val);
        System.out.print("Cac vi tri co gia tri lon nhat: ");
        for(int i=0;i<n;i++)
            if ( max_val == a[i] ){
                System.out.print((i+1)+" ");
            }
        
    }
}
