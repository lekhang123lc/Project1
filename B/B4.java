import java.util.Scanner;

public class B4 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = input.nextInt();
        int f1=1,f2=2,fn=0;
        for(int i=3;i<=n;i++){
            fn=f1+f2;
            f1=f2;
            f2=fn;
        }
        if ( n == 1 ) fn=f1;
        if ( n == 2 ) fn=f2;
        System.out.println(fn);
    }
}