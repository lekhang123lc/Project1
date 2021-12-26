package book;
import java.util.Scanner;
import book.*;
import java.util.List;
import java.util.ArrayList;

public class QuanLySach {

    private static Scanner input;

    private static List<TaiLieu> list;

    public static void add(){
        System.out.println("---- Chon loai tai lieu ----");
        System.out.println("1. Sach");
        System.out.println("2. Tap Chi");
        System.out.println("3. Bao");

        int type = input.nextInt();
        if ( type == 1 ){
            TaiLieu s = Sach.add();
            list.add(s);
        }
        else if ( type == 2 ){
            TaiLieu s = TapChi.add();
            list.add(s);
        }
        else if ( type == 3 ){
            TaiLieu s = Bao.add();
            list.add(s);
        }
    }

    public static void delete(){
        System.out.print("Nhap ma tai lieu muon xoa: ");
        String ma = input.nextLine();
        while( ma == "" ) ma=input.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i).getMaTaiLieu().equals(ma) ) {
                System.out.println(i);
                list.remove(i);
                break;
            }
        }
    }

    public static void show(int type){
        System.out.println("---- Thong tin tai lieu ----");
        for(TaiLieu l : list){
            if ( l.getType() == type || type == 0 ) l.showInfo();
        }
    }

    public static void showByType(){
        System.out.println("---- Chon loai tai lieu ----");
        System.out.println("1. Sach");
        System.out.println("2. Tap Chi");
        System.out.println("3. Bao");

        int type = input.nextInt();
        show(type);
    }

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        System.out.println("Chuong trinh quan ly sach:");
        input = new Scanner(System.in);
        list = new ArrayList<TaiLieu>();;
        while(1==1){
            System.out.println("************** Chon lenh de xu ly **************");
            System.out.println("1. Them moi tai lieu");
            System.out.println("2. Xoa tai lieu");
            System.out.println("3. Hien thi thong tin tai lieu");
            System.out.println("4. Tim kiem tai lieu theo loai");
            System.out.println("5. Thoat khoi chuong trinh");

            int type = input.nextInt();
            if ( type == 1 ) add();
            else if ( type == 2 ) delete();
            else if ( type == 3 ) show(0);
            else if ( type == 4 ) showByType();
            else break;
        }

    }
}