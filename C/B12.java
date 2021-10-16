import java.util.Scanner;

public class B12 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Nhap mang A: ");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.print("Nhap M: ");
        int m = input.nextInt();
        int b[] = new int[m];
        System.out.println("Nhap mang B: ");
        for(int i=0;i<m;i++){
            b[i]=input.nextInt();
        }
        
        int j=0;;
        for(int i=0;i<m;i++){
            if ( j < n ){
                if ( b[i] == a[j] ) j++;
            }
        }
        if ( j == n ){
            System.out.println("A la day con cua B ");
        }
        else{
            System.out.println("A khong la day con cua B ");
        }
    }
}
