import java.util.Scanner;

public class B9 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = input.nextInt();
        System.out.print("Nhap c: ");
        int c = input.nextInt();
        int d1=0,d2=0,d3=0;
        int a[] = new int[n];
        System.out.println("Nhap mang: ");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
            if ( a[i] < c )  d1++;
            if ( a[i] == c ) d2++;
            if ( a[i] > c )  d3++;
        }
        System.out.println("So cac so nho hon "+c+": "+d1);
        System.out.println("So cac so bang "+c+": "+d2);
        System.out.println("So cac so lon hon "+c+": "+d3);

    }
}
