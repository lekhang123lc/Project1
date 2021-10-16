import java.util.Scanner;

public class B6 {

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
        System.out.println("Cac so la uoc cua mot so khac trong day: ");
        for(int i=0;i<n;i++){
            int check = 0;
            for(int j=0;j<n;j++){
                if ( i != j && a[j]%a[i] == 0 ) check=1;
            }
            if ( check == 1 ){
                System.out.print(a[i]+" ");
            }
        }
    }
}