import java.util.Scanner;

public class B1 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Nhap mang can sap xep: ");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
            for(int j=i;j<n;j++){
                if ( a[i] < a[j] ){
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        System.out.println("Mang sau khi sap xep giam dan: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}