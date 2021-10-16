import java.util.Scanner;

public class B1 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = input.nextInt();
        int h=0;
        double s=0;
        for(int i=1;i<=n;i++){
            h+=i;
            s+=(double)1/h;
        }
        System.out.println(String.format("%.6f",s));
    }
}