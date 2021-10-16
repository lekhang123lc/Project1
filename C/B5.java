import java.util.Scanner;

public class B5 {

    public static int checkPrimary(int x){
        for(int i=2;i<=x/2;i++){
            if ( x%i == 0 ) return 0;
        }
        return 1;
    }

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
        int num_primary=0;
        for(int i=0;i<n;i++)
            num_primary+=checkPrimary(a[i]);
        System.out.println("So cac so nguyen to: "+num_primary);
        System.out.println("So cac so hop to: "+(n-num_primary));
        
    }
}