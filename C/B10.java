import java.util.Scanner;

public class B10 {

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
        int d=1,x=0,max_long=0;
        for(int i=1;i<n;i++){
            if ( a[i] == a[i-1] ) d++;
            else d=1;
            if ( d > max_long ){
                x=i-d+1;
                max_long=d;
            }
        }
        System.out.println("Day bang nhau dai nhat co do dai la: "+max_long);
        System.out.println("Day bang nhau dai nhat bat dau tu: "+x);
    }
}
