import java.util.Scanner;

public class B11 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu cao cua tam giac hinh sao trong khoang tu 2 den 10:");
        int h = input.nextInt();
        while(h < 2 || h > 10){
            System.out.println("Chieu cao khong hop le, vui long nhap lai trong khoang tu 2 den 10:");
            h = input.nextInt();
        }
        System.out.println("Nhap 1 neu ban muon in ra tam giac xuoi, va bat ky so nao khac neu ban muon in ra tam giac nguoc");
        int type = input.nextInt();
        if ( type == 1 ){
            for(int i=1;i<=h;i++){
                for(int j=1;j<=i;j++)
                    System.out.print("*");
                System.out.println();
            }
        }
        else{
            for(int i=1;i<=h;i++){
                for(int j=h;j>=i;j--)
                    System.out.print("*");
                System.out.println();
            }
        }
        
    }
}