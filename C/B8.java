import java.util.Scanner;

public class B8 {

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
        System.out.println("Cac so khac 0: ");
        for(int i=0;i<n;i++){
            if ( a[i] != 0  ) System.out.print(a[i]+" ");
        }
    }
}
