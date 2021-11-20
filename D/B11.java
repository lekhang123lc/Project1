import java.util.Scanner;

public class B11 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so hoc sinh: ");
        int n = input.nextInt();
        System.out.println("Nhap danh sach ten: ");
        input.nextLine();
        int x=0;
        for(int j=0;j<n;j++){
            String s = input.nextLine();
            String ho="",dem="",ten="";
            
            for(int i=0;i<s.length();i++){
                if ( s.charAt(i) == ' ' ) {
                    ho = s.substring(0,i);
                    break;
                }
            }
            for(int i=s.length()-1;i>0;i--){
                if ( s.charAt(i) == ' ' ) {
                    ten = s.substring(i+1,s.length());
                    break;
                }
            }
            dem = s.substring(ho.length()+1,s.length()-ten.length()-1);

            if ( ten.equals("An") ) x++;
        }
        
        System.out.println("So hoc sinh ten An la: "+x);
    }
}